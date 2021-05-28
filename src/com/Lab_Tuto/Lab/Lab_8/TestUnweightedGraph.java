package com.Lab_Tuto.Lab.Lab_8;

public class TestUnweightedGraph {

    public static void main(String[] args) {
        Unweighted_Graph<String, Integer> graph = new Unweighted_Graph<>();
        String[] cities = {"Alor Setar", "Kuching", "Langkawi", "Melaka", "Penang", "Tawau"};
        for (String city: cities)
            graph.addVertex(city);

        System.out.println("The number of vertices in graph is " + graph.getSize());

        System.out.println("\nCities and their vertices: ");
        for (int i = 0; i < graph.getSize(); i++)
            System.out.print(i + ": " + graph.getVertex(i) + "\t");
        System.out.println("\n");

        String melaka = graph.hasVertex("Melaka") ? "Yes" : "No";
        System.out.println("Is Melaka in the graph? " + melaka);
        String ipoh = graph.hasVertex("Ipoh") ? "Yes" : "No";
        System.out.println("Is Ipoh in the graph? " + ipoh);

        System.out.println("\nKuching at index: " + graph.getIndex("Kuching"));
        System.out.println("Ipoh at index: " + graph.getIndex("Ipoh"));

        System.out.println("\nAdd edge Kuching - Melaka: " + graph.addUndirectedEdge("Kuching", "Melaka", 800));
        System.out.println("Add edge Langkawi - Penang: " + graph.addUndirectedEdge("Langkawi", "Penang", 100));
        System.out.println("Add edge Melaka - Penang: " + graph.addUndirectedEdge("Melaka", "Penang", 400));
        System.out.println("Add edge Alor Setar - Kuching: " + graph.addUndirectedEdge("Alor Setar", "Kuching", 1200));
        System.out.println("Add edge Tawau - Alor Setar: " + graph.addUndirectedEdge("Tawau", "Alor Setar", 1900));
        System.out.println("Add edge Kuching - Tawau: " + graph.addUndirectedEdge("Kuching", "Tawau", 900));
        System.out.println("Add edge Langkawi - Ipoh: " + graph.addUndirectedEdge("Langkawi", "Ipoh", 200));
        System.out.println();

        System.out.println("Has edge from Kuching to Melaka? " + graph.hasEdge("Kuching", "Melaka"));
        System.out.println("Has edge from Melaka to Langkawi? " + graph.hasEdge("Melaka", "Langkawi"));
        System.out.println("Has edge form Ipoh to Langkawi? " + graph.hasEdge("Ipoh", "Langkawi"));
        System.out.println();

        System.out.println("Weight of edge from Kuching to Melaka: " + graph.getEdgeWeight("Kuching", "Melaka"));
        System.out.println("Weight of edge from Tawau to Alor Setar: " + graph.getEdgeWeight("Tawau", "Alor Setar"));
        System.out.println("Weight of edge from Semporna to Ipoh: " + graph.getEdgeWeight("Semporna", "Ipoh"));
        System.out.println();

        System.out.println("Degree for Kuching is " + graph.getDegree("Kuching"));
        System.out.println("Degree for Penang is " + graph.getDegree("Penang"));
        System.out.println("Degree for Ipoh is " + graph.getDegree("Ipoh"));
        System.out.println();

        System.out.println("Neighbours of Kuching : " + graph.getNeighbours("Kuching"));
        System.out.println();

        System.out.println("Print Edges: ");
        graph.displayEdges();
    }
}
