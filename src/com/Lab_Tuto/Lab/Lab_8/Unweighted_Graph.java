package com.Lab_Tuto.Lab.Lab_8;

import java.util.ArrayList;

public class Unweighted_Graph<V extends Comparable<V>, E extends Comparable<E>> {
    Vertex<V, E> root;
    int size;

    public Unweighted_Graph() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean hasVertex(V element) {
        if (root == null)
            return false;


        Vertex<V, E> currentVertex = root;
        while (currentVertex != null) {
            if (currentVertex.vertexElement.equals(element))
                return true;

            currentVertex = currentVertex.nextVertex;
        }

        return false;
    }

    public int getInDeg(V element) {
        if (root == null) {
            System.out.println("The graph is empty");
            return -1;
        }

        Vertex<V, E> currentVertex = root;
        while (currentVertex != null) {
            if (currentVertex.vertexElement.equals(element))
                return currentVertex.inDeg;

            currentVertex = currentVertex.nextVertex;
        }

        return -1;
    }

    public int getOutDeg(V element) {
        if (root == null) {
            System.out.println("The graph is empty");
            return -1;
        }

        Vertex<V, E> currentVertex = root;
        while (currentVertex != null) {
            if (currentVertex.vertexElement.equals(element))
                return currentVertex.outDeg;

            currentVertex = currentVertex.nextVertex;
        }

        return -1;
    }

    public int getDegree(V element) {
        if (root == null) {
            System.out.println("The graph is empty");
            return -1;
        }
        if (!hasVertex(element)) {
            System.out.println("No such vertex");
            return -1;
        }

        Vertex<V, E> findSource = root;
        while (findSource != null) {
            if (findSource.vertexElement.equals(element)) {
                return findSource.degree;
            }
            findSource = findSource.nextVertex;
        }
        return -1;
    }

    public boolean addVertex(V element) {
        if (!hasVertex(element)) {
            Vertex<V, E> currentVertex = root;
            Vertex<V, E> newVertex = new Vertex<>(element, null);
            if (root == null)
                root = newVertex;
            else {
                while (currentVertex.nextVertex != null) {
                    currentVertex = currentVertex.nextVertex;
                }
                currentVertex.nextVertex = newVertex;
//                Vertex<E, W> previous = root;
//                while (currentVertex != null) {
//                    previous = currentVertex;
//                    currentVertex = currentVertex.nextVertex;
//                }
//                previous.nextVertex = newVertex;
            }
            size++;
            return true;
        }
        return false;
    }

    public int getIndex(V element) {
        if (hasVertex(element)) {
            int index = 0;
            Vertex<V, E> currentVertex = root;
            while (currentVertex != null) {
                if (currentVertex.vertexElement.equals(element))
                    return index;

                currentVertex = currentVertex.nextVertex;
                index++;
            }
        }
        return -1;
    }

    public ArrayList<V> getAllVertex() {
        ArrayList<V> list = new ArrayList<>();
        Vertex<V, E> currentVertex = root;
        while (currentVertex != null) {
            list.add(currentVertex.vertexElement);
            currentVertex = currentVertex.nextVertex;
        }
        return list;
    }

    public V getVertex(int position) {
        if (root == null) {
            System.out.println("The graph is empty");
            return null;
        }

        Vertex<V, E> currentVertex = root;
        for (int i = 0; i < position; i++) // because currentVertex = root, thus i <= position when i = 0
            currentVertex = currentVertex.nextVertex;

        return currentVertex.vertexElement;
    }

    public boolean hasEdge(V source, V destination) {
        if (root == null) {
            System.out.println("The graph is empty");
            return false;
        }
        if (!hasVertex(source) || !hasVertex(destination)) {
            System.out.println("No such vertex");
            return false;
        }

        Vertex<V, E> findSource = root;
        while (findSource != null) {
            if (findSource.vertexElement.equals(source)) {
                Edge<V, E> currentEdge = findSource.firstEdge;
                while (currentEdge != null) {
                    if (currentEdge.toVertex.vertexElement.equals(destination)) {
                        return true;
                    }
                    currentEdge = currentEdge.nextEdge;
                }
            }
            findSource = findSource.nextVertex;
        }
        return false;
    }

    public boolean addEdge(V source, V destination, E weight) {
        if (root == null) {
            System.out.println("The graph is empty");
            return false;
        }

        if (!hasVertex(source) || !hasVertex(destination)) {
            System.out.println("No such vertex");
            return false;
        }

        Vertex<V, E> findSource = root;
        while (findSource != null) {
            if (findSource.vertexElement.equals(source)) {
                Vertex<V, E> findDestination = root;
                while (findDestination != null) {
                    if (findDestination.vertexElement.equals(destination)) {
                        Edge<V, E> currentEdge = findSource.firstEdge;

                        findSource.firstEdge = new Edge<>(weight, findDestination, currentEdge);

                        findSource.outDeg++;
                        findDestination.inDeg++;
                    }
                    findDestination = findDestination.nextVertex;
                }
            }
            findSource = findSource.nextVertex;
        }
        return false;
    }

    public boolean addUndirectedEdge(V source, V destination, E weight) {
        if (root == null) {
            System.out.println("The graph is empty");
            return false;
        }

        if (!hasVertex(source) || !hasVertex(destination)) {
            System.out.println("No such vertex");
            return false;
        }

        Vertex<V, E> findSource = root;
        while (findSource != null) {
            if (findSource.vertexElement.equals(source)) {
                Vertex<V, E> findDestination = root;
                while (findDestination != null) {
                    if (findDestination.vertexElement.equals(destination)) {
                        Edge<V, E> sourceEdge = findSource.firstEdge;
                        Edge<V, E> desEdge = findDestination.firstEdge;

                        findSource.firstEdge = new Edge<>(weight, findDestination, sourceEdge);
                        findDestination.firstEdge = new Edge<>(weight, findSource, desEdge);

                        findSource.degree++;
                        findDestination.degree++;

                        return true;
                    }
                    findDestination = findDestination.nextVertex;
                }
            }
            findSource = findSource.nextVertex;
        }
        return false;
    }

    public boolean removeEdge(V source, V destination) {
        // if want to remove edge in undirected graph, must remove twice like removeEdge(1,2)
        // and removeEdge(2,1), only that could remove from both side
        if (root == null) {
            System.out.println("The graph is empty");
            return false;
        }

        if (!hasVertex(source) || !hasVertex(destination)) {
            System.out.println("No such vertex");
            return false;
        }

        Vertex<V, E> findSource = root;
        while (findSource != null) {
            if (findSource.vertexElement.equals(source)) {
                Vertex<V, E> findDestination = root;
                while (findDestination != null) {
                    if (findDestination.vertexElement.equals(destination)) {
                        Edge<V, E> sourceEdge = findSource.firstEdge.nextEdge;
                        Edge<V, E> previousSourceEdge = findSource.firstEdge;
                        while (sourceEdge != null) {
                            if (findSource.firstEdge.toVertex.vertexElement.equals(destination)) {
                                findSource.firstEdge = findSource.firstEdge.nextEdge;

                                findSource.degree--;
                                findDestination.degree--;
                                return true;
                            }
                            if (sourceEdge.toVertex.vertexElement.equals(destination)) {
                                previousSourceEdge.nextEdge = sourceEdge.nextEdge;

                                findSource.degree--;
                                findDestination.degree--;
                                return true;
                            }
                            sourceEdge = sourceEdge.nextEdge;
                            previousSourceEdge = previousSourceEdge.nextEdge;
                        }
                    }
                    findDestination = findDestination.nextVertex;
                }
            }
            findSource = findSource.nextVertex;
        }
        return false;
    }

    public E getEdgeWeight(V source, V destination) {
        if (root == null) {
            System.out.println("The graph is empty");
            return null;
        }

        if (!hasVertex(source) || !hasVertex(destination)) {
            System.out.println("No such vertex");
            return null;
        }

        Vertex<V, E> currentVertex = root;
        while (currentVertex != null) {
            if (currentVertex.vertexElement.equals(source)) {
                Edge<V, E> currentEdge = currentVertex.firstEdge;
                while (currentEdge != null) {
                    if (currentEdge.toVertex.vertexElement.equals(destination)) {
                        return currentEdge.weight;
                    }
                    currentEdge = currentEdge.nextEdge;
                }
            }
            currentVertex = currentVertex.nextVertex;
        }

        return null;
    }

    public ArrayList<V> getNeighbours(V element) {
        if (!hasVertex(element)) return null;

        ArrayList<V> list = new ArrayList<>();
        Vertex<V, E> currentVertex = root;
        while (currentVertex != null) {
            if (currentVertex.vertexElement.compareTo(element) == 0) {
                Edge<V, E> currentEdge = currentVertex.firstEdge;
                while (currentEdge != null) {
                    list.add(currentEdge.toVertex.vertexElement);
                    currentEdge = currentEdge.nextEdge;
                }
            }
            currentVertex = currentVertex.nextVertex;
        }
        return list;
    }

    public void displayEdges() {
        Vertex<V, E> currentVertex = root;
        while (currentVertex != null) {
            System.out.print("# " + currentVertex.vertexElement + " : ");
            Edge<V, E> edges = currentVertex.firstEdge;
            while (edges != null) {
                System.out.print("[" + currentVertex.vertexElement + "," + edges.toVertex.vertexElement + "] ");
                edges = edges.nextEdge;
            }
            System.out.println();
            currentVertex = currentVertex.nextVertex;
        }
    }
}
