package jsjf.graph;
/**
 * GraphTest is a class meant for testing the implementation of Graph
 *
 * @author Mohammad Chaudhry
 * @version 4.0
 *
 */

public class GraphTests {

  public static void main(String[] args){

    //Create a Graph
    Graph<String> graph = new Graph();

    //Test: Add a vertex with value "A"
    graph.addVertex("A");
    System.out.println("Successfully added \"A\" \n");

    //Test: Add a vertex without value
    graph.addVertex();
    System.out.println("Successfully added an empty vertex \n");

    //Test: Remove added vertices
    graph.removeVertex("A");
    System.out.println("Successfully removed \"A\"");
    graph.removeVertex(null);
    System.out.println("Successfully removed empty vertex\n");


    //Test: Remove vertex by index
    graph.addVertex("B");
    graph.addVertex("C");
    graph.addVertex("D");
    System.out.println("Successfully added \"B\" \"C\" \"D\"\n");
    System.out.println("Before removing B by index");
    System.out.println(graph.toString());
    graph.removeVertex(0);
    System.out.println("After removing B by index");
    System.out.println(graph.toString());
    graph.removeVertex(1);
    System.out.println("After removing D by index");
    System.out.println(graph.toString());
    graph.removeVertex(0);

    //Test: Removing on an empty graph
    System.out.println("Removing a vertex on an empty graph by index");
    try{
      graph.removeVertex(0);
    }catch(Exception e){
      System.out.println(e);
    }
    System.out.println("\nRemoving a vertex on an empty graph by value");
    try{
      graph.removeVertex("A");
    }catch(Exception e){
      System.out.println(e);
    }

    //Test: Remove edges when there are none
    System.out.println("\nRemoving an edge on an empty graph by index (0,1)");
    graph.removeEdge(0,1);
    System.out.println("\nRemoving an edge on an empty graph by value (\"A\",\"B\")");
    graph.removeEdge("A","B");

    //Test: Remove edges when only one Vertex exists by value
    graph.addVertex("A");
    System.out.println("\nSuccessfully added \"A\"");
    System.out.println("Removing an edge when only one vertex exists by value (\"A\",\"B\")");
    graph.removeEdge("A", "B");

    //Test: Remove edges when only one Vertex exists by value
    System.out.println("\nRemoving an edge when only one vertex exists by index (0,1)");
    graph.removeEdge(0, 1);


    //Test: Add Edge when one vertex is in the graph
    System.out.println("\nAdd an edge when only one vertex exists by index (0,1)");
    graph.addEdge(0,1);
    System.out.println("\nAdd an edge when only one vertex exists by value (\"A\",\"B\")");
    graph.addEdge("A","B");

    //Test: Add Edge when no vertices are in the graph
    graph.removeVertex("A");
    System.out.println("\nAdd an edge when only one vertex exists by value (\"A\",\"B\")");
    System.out.println("\nAdd an edge when no vertices exists by index (0,1)");
    graph.addEdge(0,1);
    System.out.println("\nAdd an edge when no vertices exists by value (\"A\",\"B\")");
    graph.addEdge("A","B");

    //Test: Add Edge between two existing vertices
    graph.addVertex("A");
    graph.addVertex("B");
    graph.addVertex("C");
    System.out.println("\nSuccessfully added \"A\"  \"B\" \"C\"");
    System.out.println("Add an edge by value (\"A\",\"B\")");
    graph.addEdge("A","B");
    System.out.println("Successful");
    System.out.println("Add an edge by index (1,2)");
    graph.addEdge("B","C");
    System.out.println("Successful");


    //Test: Connectivity on connected graph
    System.out.println("\nConnectivity on connected graph");
    System.out.println(graph.isConnected());

    //Test: Connectivity on not an disconnected graph
    System.out.println("\nConnectivity on disconnected graph");
    graph.addVertex("D");
    System.out.println("Succesfully added \"D\"");
    System.out.println(graph.isConnected());


    //Test: get index of vertices
    System.out.println("\n Get index of vertices by value");
    System.out.println("A:"+graph.getIndex("A"));
    System.out.println("B:"+graph.getIndex("B"));
    System.out.println("C:"+graph.getIndex("C"));
    System.out.println("D:"+graph.getIndex("D"));
    System.out.println("A vertex that doesnt exist - E: "+graph.getIndex("E"));

    //Test: Check valid indexes
    System.out.println("\nCheck if index is valid");
    System.out.println("0:"+graph.indexIsValid(0));
    System.out.println("1:"+graph.indexIsValid(1));
    System.out.println("2:"+graph.indexIsValid(2));
    System.out.println("3:"+graph.indexIsValid(3));
    System.out.println("index which is not valid -> 4:"+graph.indexIsValid(4));
    System.out.println("index which is not valid -> -1:"+graph.indexIsValid(-1));

    //Test: size
    System.out.println("\nCheck size (currently 4)");
    System.out.println(graph.size());
    System.out.println("Another size check will be done after adding two elements");

    //Test expandCapacity
    System.out.println("\nExpand Capacity  test will be done first");
    graph.addVertex("E");
    System.out.println("Successfully added \"E\". At maximum capacity now.");
    graph.addVertex("G");
    System.out.println("Successfully added \"G\"");

    //Test: size
    System.out.println("\nSecond size test (currently 6)");
    System.out.println(graph.size());


    //Test: isEmpty
    System.out.println("\nCheck if graph empty");
    System.out.println("isEmpty():"+graph.isEmpty());
    graph.removeVertex(5);
    graph.removeVertex(4);
    graph.removeVertex(3);
    graph.removeVertex(2);
    graph.removeVertex(1);
    graph.removeVertex(0);
    System.out.println("Removed all vertices");
    System.out.println("isEmpty():"+graph.isEmpty());


  }
}
