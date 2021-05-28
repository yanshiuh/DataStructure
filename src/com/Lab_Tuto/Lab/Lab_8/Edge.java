package com.Lab_Tuto.Lab.Lab_8;

public class Edge<V extends Comparable<V>, E extends Comparable<E>> {
    E weight;
    Vertex<V, E> toVertex;
    Edge<V, E> nextEdge;

    public Edge() {
        weight = null;
        toVertex = null;
        nextEdge = null;
    }

    public Edge(E weight, Vertex<V, E> toVertex, Edge<V, E> nextEdge) {
        this.weight = weight;
        this.toVertex = toVertex;
        this.nextEdge = nextEdge;
    }
}
