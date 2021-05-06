package GraphTheory;

import java.util.ArrayList;

public class Graph<E extends Comparable<E>, W extends Comparable<W>> {
    Vertex<E, W> head;
    int size;

    public Graph() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean hasVertex(E element) {
        if (head == null)
            return false;
        Vertex<E, W> currentVertex = head;
        while (currentVertex != null) {
            if (currentVertex.vertexElement.compareTo(element) == 0)
                return true;
            currentVertex = currentVertex.nextVertex;
        }

        return false;
    }

    public int getInDeg(E element) {
        if (hasVertex(element)) {
            Vertex<E, W> currentVertex = head;
            while (currentVertex != null) {
                if (currentVertex.vertexElement.compareTo(element) == 0)
                    return currentVertex.inDeg;
                currentVertex = currentVertex.nextVertex;
            }
        }

        return -1;
    }

    public int getOutDeg(E element) {
        if (hasVertex(element)) {
            Vertex<E, W> currentVertex = head;
            while (currentVertex != null) {
                if (currentVertex.vertexElement.compareTo(element) == 0)
                    return currentVertex.outDeg;
                currentVertex = currentVertex.nextVertex;
            }
        }

        return -1;
    }

    public boolean addVertex(E element) {
        if (!hasVertex(element)) {
            if (head == null)
                head = new Vertex<>(element, null);
            else {
                Vertex<E, W> currentVertex = head;
                Vertex<E, W> newVertex = new Vertex<>(element, null);
                while (currentVertex.nextVertex != null) {
                    currentVertex = currentVertex.nextVertex;
                }
                currentVertex.nextVertex = newVertex;
            }
            size++;
        }

        return true;
    }

    public int getIndex(E element) {
        if (hasVertex(element)) {
            Vertex<E, W> currentVertex = head;
            int index = 0;
            while (currentVertex != null) {
                if (currentVertex.vertexElement.compareTo(element) == 0)
                    return index;
                currentVertex = currentVertex.nextVertex;
                index++;
            }
        }

        return -1;
    }

    public ArrayList<E> getAllVertex() {
        ArrayList<E> arrayList = new ArrayList<>();
        Vertex<E, W> currentVertex = head;
        while (currentVertex != null) {
            arrayList.add(currentVertex.vertexElement);
            currentVertex = currentVertex.nextVertex;
        }

        return arrayList;
    }

    public E getVertex(int position) { // not index, position 3 is forth element (0,1,2,3)
        if (position <= 0 || position > size - 1) return null;

        Vertex<E, W> currentVertex= head;
        for (int i = 0; i < position; i++) {
            currentVertex = currentVertex.nextVertex;
        }

        return currentVertex.vertexElement;
    }

    public boolean hasEdge(E source, E destination) {
        if (head == null)
            return false;
        if (!hasVertex(source) || !hasVertex(destination))
            return false;

        Vertex<E, W> currentVertex = head;
        while (currentVertex != null) {
            if (currentVertex.vertexElement.compareTo(source) == 0) {
                Edge<E, W> sourceEdge = currentVertex.firstEdge;
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

    public boolean addEdge(E source, E destination, W weight) {
        if (head == null) return false;
        if (!hasVertex(source) || !hasVertex(destination)) return false;

        Vertex<E, W> findSource = head;
        while (findSource != null) {
            if (findSource.vertexElement.compareTo(source) == 0) {
                Vertex<E, W> findDestination = head;
                while (findDestination != null) {
                    if (findDestination.vertexElement.compareTo(destination) == 0) {
                        Edge<E, W> sourceEdge = findSource.firstEdge;
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

    public W getEdgeWeight(E source, E destination) {
        if (head == null) return null;
        if (!hasVertex(source) || !hasVertex(destination)) return null;

        Vertex<E, W> findSource = head;
        while (findSource != null) {
            if (findSource.vertexElement.compareTo(source) == 0) {
                Edge<E, W> sourceEdge = findSource.firstEdge;
                if (sourceEdge.toVertex.vertexElement.compareTo(destination) == 0)
                    return sourceEdge.weight;
            }
            findSource = findSource.nextVertex;
        }
        return null;
    }

    public ArrayList<E> getNeighbours(E element) {
        if (!hasVertex(element)) return null;

        ArrayList<E> list = new ArrayList<>();
        Vertex<E, W> currentVertex = head;
        while (currentVertex != null) {
            if (currentVertex.vertexElement.compareTo(element) == 0) {
                Edge<E, W> currentEdge = currentVertex.firstEdge;
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
        Vertex<E, W> currentVertex = head;
        while (currentVertex != null) {
            System.out.print("# " + currentVertex.vertexElement + " : [");
            Edge<E, W> edges = currentVertex.firstEdge;
            while (edges != null) {
                System.out.print(edges.toVertex.vertexElement + "]");
                edges = edges.nextEdge;
            }
            System.out.println();
            currentVertex = currentVertex.nextVertex;
        }
    }
}
