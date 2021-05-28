package GraphTheory.BasicGraph;

public class Edge<V extends Comparable<V>, E extends Comparable<E>> {
    Vertex<V, E> toVertex;
    Edge<V, E> nextEdge;
    E weight;

    public Edge() {
        toVertex = null;
        nextEdge = null;
        weight = null;
    }

    public Edge(Vertex<V, E> toVertex, Edge<V, E> nextEdge, E weight) {
        this.toVertex = toVertex;
        this.nextEdge = nextEdge;
        this.weight = weight;
    }
}
