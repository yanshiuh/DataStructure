package GraphTheory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class GraphForDFS {
    private int numberOfVertices;
    private LinkedList<Integer>[] adjacencyList;

    public GraphForDFS(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        adjacencyList = new LinkedList[numberOfVertices];
        for (int i = 0; i < numberOfVertices; i++){
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int fromVertex, int toVertex) {
        adjacencyList[fromVertex].add(toVertex);
    }

    public void DFS(int vertex) { // start with which vertex
        boolean[] visitedVertex = new boolean[numberOfVertices];
        Stack<Integer> stack = new Stack<>();

        visitedVertex[vertex] = true;
        stack.push(vertex);

        while (!stack.isEmpty()) {
            vertex = stack.pop();
            System.out.print(vertex + " ");

            Iterator<Integer> v = adjacencyList[vertex].listIterator();
            if (v.hasNext()) {
                vertex = v.next();
                if (!visitedVertex[vertex]) {
                    visitedVertex[vertex] = true;
                    stack.push(vertex);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphForDFS g = new GraphForDFS(6);

        g.addEdge(5, 3);
        g.addEdge(5, 4);
        g.addEdge(3, 0);
        g.addEdge(3, 2);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");

        g.DFS(5);
    }
}
