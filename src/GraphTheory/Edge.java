package GraphTheory;

public class Edge<E extends Comparable<E>, W extends Comparable<W>> {
    Vertex<E, W> toVertex;
    Edge<E, W> nextEdge;
    W weight;

    public Edge() {
        toVertex = null;
        nextEdge = null;
        weight = null;
    }

    public Edge(Vertex<E, W> toVertex, Edge<E, W> nextEdge, W weight) {
        this.toVertex = toVertex;
        this.nextEdge = nextEdge;
        this.weight = weight;
    }
}
