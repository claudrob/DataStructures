package datastructures.test;

import my.datastructures.Graph;

public class GraphTest {

    public static void main(String[] args) {
        testAddVertex();
    }

    public static void testAddVertex(){
        System.out.println("----- Test: Add Vertex -----");
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");

        System.out.println("\nGraph:");
        myGraph.printGraph();

        /*
            EXPECTED OUTPUT:
            ----------------
            Graph:
            {A=[], B=[]}

        */
    }
}
