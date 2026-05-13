
package csci251projsix;

/**
 *	class CSCI251ProjSix. It is an interactive test class for MyGraph
 * 
 * 	@author Mike Mireku Kwakye
 * 	@version April 15, 2025
 */

import java.util.*;

public class CSCI251ProjSix
{
   public static void main(String args[]){
        int numberOfVertices;
        String result;
        int [][] graphRep;
        int startVertex;
        int choice;
        Scanner input = new Scanner(System.in);
        MyGraph graph = null;
       
        do{
            menu();
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
			
            switch(choice){
				
            case 1:
                System.out.println("\nEnter a weighted directed graph");
                System.out.print("First enter the number of vertices: ");
                numberOfVertices = input.nextInt();
				
                graphRep = new int[numberOfVertices+1][numberOfVertices+1];
				
                System.out.println("\nEnter the matrix representation of the graph. If there is no edge between two vertices, enter 0: \n");
                
				for(int i = 1; i<= numberOfVertices; i++){
                    for(int j = 1; j <= numberOfVertices; j++){
                        graphRep[i][j] = input.nextInt();
                    }
                }
                graph = new MyGraph(graphRep);
                break;
                
            case 2:
                System.out.println("\nPrint a weighted directed graph");
                graph.printGraphMatrix();
                break;
				
            case 3: 
                System.out.print("\nEnter the start vertex: ");
                startVertex = input.nextInt();
                result = graph.bfs(startVertex);
                if(result == null)
                    System.out.println("No such a start vertex");   
                else
                    System.out.println("The result for Breadth-First Search (BFS) is: " + result);
                break;
				
            case 4:
                System.out.print("\nEnter the start vertex: ");
                startVertex = input.nextInt();
                result = graph.dfs(startVertex);
                if(result == null)
                    System.out.println("No such a start vertex");   
                else
                    System.out.println("The result for Depth-First Search (DFS) is: " + result);
                break;
				
            case 5:
                System.out.println("\nMake sure you run enough tests before you turn it in");
                break;
				
            default:
                System.out.println("Wrong option. Please choose from menu");
                break;
				
            }
        }while(choice != 5);
        input.close();
    }
    
    private static void menu(){
        System.out.println("***************************************");
        System.out.println("*              MENU                   *");
        System.out.println("* 1. Enter a graph                    *");
        System.out.println("* 2. Print the graph                  *");
        System.out.println("* 3. Breadth-First Search (BFS)       *");
        System.out.println("* 4. Depth-First Search (DFS)         *");
        System.out.println("* 5. Quit                             *");
        System.out.println("***************************************");
    }
}

