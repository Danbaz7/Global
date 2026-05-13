
package csci251projsix;

/**
 *	class MyGraph. 
 *
 * We will use Adjacency Matrix to represent a simple weighted directed graph. There is no loop at vertex.
 * No more than one edge from vertex i to another vertex j. The vertices are numbered as 1, 2, ..., n
 * The graph with n vertices is reprented by an n-by-n matrix.
 * If there is an edge from vertex i to vertex j (i != j), then entry on row i column j of the matrix will be 1. 
 *	If there is no edge between vertex i to vertex j (i != j), then the entry on row i column j of the matrix will be Integer.MAX_VALUE and printed out as Infinity (INF).
 * *
 * @author Daniel Obazee
 * @version 04-24-2026
 */

import java.util.*;

public class MyGraph
{
    private int[][] graph;
    private int numberOfVertices;
    
    /**
     * create a graph with given number of vertices with no edges
     * @param numberOfVertices number of vertices of the graph
     */
    public MyGraph(int numberOfVertices){
        this.numberOfVertices = numberOfVertices;
        graph = new int[numberOfVertices+1][numberOfVertices+1];
    }
    
    /**
     * create a graph with given matrix representation
     * @param graph The matrix representation on the given graph.
     */
    public MyGraph(int [][] graph){
        this.graph = graph;
		
        // Change any edge value 0 to Max_Integer if the edge value 0 is not on diagonal (that is, no edge connection)
        for(int i = 1; i < graph.length; i++){
            for(int j = 1; j < graph.length; j++){
                if(i == j) graph[i][j] = 0;
                else if(i != j && graph[i][j] == 0)
                    graph[i][j] = Integer.MAX_VALUE;
            }
        }
        numberOfVertices = graph.length - 1; 
    }
    
	/** Print the graph adjacency matrix
	*/
    public void printGraphMatrix() {
        System.out.println("Graph Adjacency Matrix:");
		
		// Change all Max_Integer values into Infinity (INF) values during graph printout
        for(int i = 1; i <= numberOfVertices; i++){
            for (int j = 1; j <= numberOfVertices; j++) {
				
                System.out.print((graph[i][j] == Integer.MAX_VALUE ? "INF" : graph[i][j]) + "\t");
            }
            System.out.println();
        }
    }
    
    /**
     * return a String that represent the vertices in order if the BFS algorithm is used to traversal the graph
     * starting from the given vertex. If the startVertex not exists, return an error message
     * @param startVertex The vertex where the traversal starts
     * @return A String that describes the vertices visited in order
     */
    public String bfs(int startVertex){
        if (startVertex < 1 || startVertex > numberOfVertices) {
            return null;
        }

        StringBuilder result = new StringBuilder("(");
        boolean[] visited = new boolean[numberOfVertices + 1];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            // Append the vertex to the result string
            if (result.length() > 1) result.append(", ");
            result.append(current);

            // Check all possible neighbors in ascending order (1 to n)
            for (int neighbor = 1; neighbor <= numberOfVertices; neighbor++) {
                // If there's an edge and neighbor hasn't been visited
                if (graph[current][neighbor] != Integer.MAX_VALUE && graph[current][neighbor] > 0 && !visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        result.append(")");
        return result.toString();
    }
    
	
    /**
     * return a String that represents the vertices in order if the DFS algorithm is used to traversal the graph
     * starting from the given vertex. If the startVertex not exist, return an error message
     * @param startVertex The vertex where the traversal starts
     * @return A String that represents the vertices visited in order
     */
    public String dfs(int startVertex){
        if (startVertex < 1 || startVertex > numberOfVertices) {
            return null;
        }

        StringBuilder result = new StringBuilder("(");
        boolean[] visited = new boolean[numberOfVertices + 1];
        
        dfsHelper(startVertex, visited, result);
        
        result.append(")");
        return result.toString();
    }

    /**
     * Recursive helper for DFS to maintain visiting order
     */
    private void dfsHelper(int current, boolean[] visited, StringBuilder result) {
        visited[current] = true;
        
        // Add current vertex to result
        if (result.length() > 1) result.append(", ");
        result.append(current);

        // Visit neighbors in ascending order (1 to n) for consistent tie-breaking
        for (int neighbor = 1; neighbor <= numberOfVertices; neighbor++) {
            if (graph[current][neighbor] != Integer.MAX_VALUE && graph[current][neighbor] > 0 && !visited[neighbor]) {
                dfsHelper(neighbor, visited, result);
            }
        }
    }
}
