package GraphTheory.BasicGraph;

import java.util.ArrayList;

public class Graph<V extends Comparable<V>, E extends Comparable<E>> {
    Vertex<V, E> head;
    int size;

    public Graph() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean hasVertex(V element) {
        if (head == null)
            return false;
        Vertex<V, E> currentVertex = head;
        while (currentVertex != null) {
            if (currentVertex.vertexElement.compareTo(element) == 0)
                return true;
            currentVertex = currentVertex.nextVertex;
        }

        return false;
    }

    public int getInDeg(V element) {
        if (hasVertex(element)) {
            Vertex<V, E> currentVertex = head;
            while (currentVertex != null) {
                if (currentVertex.vertexElement.compareTo(element) == 0)
                    return currentVertex.inDeg;
                currentVertex = currentVertex.nextVertex;
            }
        }

        return -1;
    }

    public int getOutDeg(V element) {
        if (hasVertex(element)) {
            Vertex<V, E> currentVertex = head;
            while (currentVertex != null) {
                if (currentVertex.vertexElement.compareTo(element) == 0)
                    return currentVertex.outDeg;
                currentVertex = currentVertex.nextVertex;
            }
        }

        return -1;
    }

    public boolean addVertex(V element) {
        if (!hasVertex(element)) {
            if (head == null)
                head = new Vertex<>(element, null);
            else {
                Vertex<V, E> currentVertex = head;
                Vertex<V, E> newVertex = new Vertex<>(element, null);
                while (currentVertex.nextVertex != null) {
                    currentVertex = currentVertex.nextVertex;
                }
                currentVertex.nextVertex = newVertex;
            }
            size++;
            return true;
        }

        return false;
    }

    public int getIndex(V element) {
        if (hasVertex(element)) {
            int index = 0;
            Vertex<V, E> currentVertex = head;
            while (currentVertex != null) {
                if (currentVertex.vertexElement.compareTo(element) == 0)
                    return index;
                currentVertex = currentVertex.nextVertex;
                index++;
            }
        }

        return -1;
    }

    public ArrayList<V> getAllVertex() {
        ArrayList<V> arrayList = new ArrayList<>();
        Vertex<V, E> currentVertex = head;
        while (currentVertex != null) {
            arrayList.add(currentVertex.vertexElement);
            currentVertex = currentVertex.nextVertex;
        }

        return arrayList;
    }

    public V getVertex(int position) { // not index, position 3 of (0,1,2,3) is 2
        int index = position - 1;
        if (index <= 0 || index > size - 1) return null;

        Vertex<V, E> currentVertex= head;
        for (int i = 0; i < index; i++) {
            currentVertex = currentVertex.nextVertex;
        }

        return currentVertex.vertexElement;
    }

    public boolean hasEdge(V source, V destination) {
        if (head == null)
            return false;
        if (!hasVertex(source) || !hasVertex(destination))
            return false;

        Vertex<V, E> currentVertex = head;
        while (currentVertex != null) {
            if (currentVertex.vertexElement.compareTo(source) == 0) {
                Edge<V, E> sourceEdge = currentVertex.firstEdge;
                while (sourceEdge != null) {
                    if (sourceEdge.toVertex.vertexElement.compareTo(destination) == 0) {
                        return true;
                    }
                    sourceEdge = sourceEdge.nextEdge;
                }
            }
            currentVertex = currentVertex.nextVertex;
        }
        return false;
    }

    public boolean addEdge(V source, V destination, E weight) {
        if (head == null) return false;
        if (!hasVertex(source) || !hasVertex(destination)) return false;

        Vertex<V, E> findSource = head;
        while (findSource != null) {
            if (findSource.vertexElement.compareTo(source) == 0) {
                Vertex<V, E> findDestination = head;
                while (findDestination != null) {
                    if (findDestination.vertexElement.compareTo(destination) == 0) {
                        Edge<V, E> sourceEdge = findSource.firstEdge;
                        findSource.firstEdge = new Edge<>(findDestination, sourceEdge, weight);
                        findSource.outDeg++;
                        findDestination.inDeg++;
                        return true;
                    }
                    findDestination = findSource.nextVertex;
                }
            }
            findSource = findSource.nextVertex;
        }
        return false;
    }

    public E getEdgeWeight(V source, V destination) {
        if (head == null) return null;
        if (!hasVertex(source) || !hasVertex(destination)) return null;

        Vertex<V, E> findSource = head;
        while (findSource != null) {
            if (findSource.vertexElement.compareTo(source) == 0) {
                Edge<V, E> sourceEdge = findSource.firstEdge;
                if (sourceEdge.toVertex.vertexElement.compareTo(destination) == 0)
                    return sourceEdge.weight;
            }
            findSource = findSource.nextVertex;
        }
        return null;
    }

    public ArrayList<V> getNeighbours(V element) {
        if (!hasVertex(element)) return null;

        ArrayList<V> list = new ArrayList<>();
        Vertex<V, E> currentVertex = head;
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
        Vertex<V, E> currentVertex = head;
        while (currentVertex != null) {
            System.out.print("# " + currentVertex.vertexElement + " : [");
            Edge<V, E> edges = currentVertex.firstEdge;
            while (edges != null) {
                System.out.print(edges.toVertex.vertexElement + "]");
                edges = edges.nextEdge;
            }
            System.out.println();
            currentVertex = currentVertex.nextVertex;
        }
    }
}
