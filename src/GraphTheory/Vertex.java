package GraphTheory;

public class Vertex<E extends Comparable<E>, W extends Comparable<W>> { // E = element, W = weight
    E vertexElement;
    int inDeg;
    int outDeg;
    Vertex<E, W> nextVertex;
    Edge<E, W> firstEdge;

    public Vertex() {
        vertexElement = null;
        inDeg = 0;
        outDeg = 0;
        nextVertex = null;
        firstEdge = null;
    }

    public Vertex(E vertexElement, Vertex<E, W> nextVertex) {
        this.vertexElement = vertexElement;
        this.nextVertex = nextVertex;
    }


}
