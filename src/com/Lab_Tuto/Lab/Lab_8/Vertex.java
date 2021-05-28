package com.Lab_Tuto.Lab.Lab_8;

public class Vertex<V extends Comparable<V>, E extends Comparable<E>> {
    V vertexElement;
    Vertex<V, E> nextVertex;
    int inDeg;
    int outDeg;
    int degree;
    Edge<V, E> firstEdge;

    public Vertex() {
        vertexElement = null;
        inDeg = 0;
        outDeg = 0;
        degree = 0;
        firstEdge = null;
        nextVertex = null;
    }

    public Vertex(V vertexElement, Vertex<V, E> nextVertex) {
        this.vertexElement = vertexElement;
        this.nextVertex = nextVertex;
    }
}
