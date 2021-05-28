package GraphTheory.BasicGraph;

public class Vertex<V extends Comparable<V>, E extends Comparable<E>> {
    V vertexElement;
    int inDeg;
    int outDeg;
    Vertex<V, E> nextVertex;
    Edge<V, E> firstEdge;

    public Vertex() {
        vertexElement = null;
        inDeg = 0;
        outDeg = 0;
        nextVertex = null;
        firstEdge = null;
    }

    public Vertex(V vertexElement, Vertex<V, E> nextVertex) {
        this.vertexElement = vertexElement;
        this.nextVertex = nextVertex;
    }
}
