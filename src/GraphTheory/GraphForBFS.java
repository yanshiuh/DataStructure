package GraphTheory;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphForBFS {
    private int numberOfVertices;
    private LinkedList<Integer>[] adjacencyList;

    public GraphForBFS(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        // each vertex consists of one linked list that used for hold the edges
        adjacencyList = new LinkedList[numberOfVertices];
        for (int i = 0; i < numberOfVertices; i++)
            adjacencyList[i] = new LinkedList<>();
    }

    public void addEdge(int vertex, int toVertex) {
        adjacencyList[vertex].add(toVertex);
    }

    public void BFS(int vertex) {  // start from which vertex
        // all vertexes is not visited yet by default (false)
        boolean[] visitedVertex = new boolean[numberOfVertices];

        // Creating a queue
        LinkedList<Integer> queue = new LinkedList<>();

        // whenever the vertex is not visited before when reaching the vertex, set it true and add to queue
        // start vertex is visited
        visitedVertex[vertex] = true;
        queue.add(vertex);

        while (!queue.isEmpty()) {
            vertex = queue.pop();
            System.out.print(vertex + " ");

            // to find whether the vertex has connected to other vertex
            Iterator<Integer> v = adjacencyList[vertex].listIterator();
            while (v.hasNext()) {   // this vertex has connected to other vertex
                vertex = v.next();
                // if never visit the vertex before, make it visited and addBack in the queue
                if (!visitedVertex[vertex]) {
                    visitedVertex[vertex] = true;
                    queue.add(vertex);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphForBFS g = new GraphForBFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);
    }
}
