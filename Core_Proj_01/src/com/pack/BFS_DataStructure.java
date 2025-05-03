package com.pack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS_DataStructure {
	

	   /*BFS is a vertex based Technique for finding the shortest path of graph.
	    It is internally used Queue Data Structure, that follows first in first out FIFO.
	    In BFS one vertex select at a time when its visited and marked then its adjacent is visited.
       */
	
		public static void breadthFirstSearch(List<List<Integer>> adj, int s, boolean visited[]) {

			/* create queue for BFS */

			Queue<Integer> q = new LinkedList<Integer>();

			/* Mark the source node is visited and enqueue it. */

			visited[s] = true;
			q.offer(s);

			/* Iterate over the queue */

			while (!q.isEmpty()) {

				/* Dequeue the vertex from queue and print it. */

				int curr = q.poll();
				System.out.println(curr + "  ");

				/*
				 * Get All the adjacent vertices of the Dequeued vertex. If an adjacent has not
				 * been visited then marked as visited and enqueue it.
				 */

				for (int x : adj.get(curr)) {

					if (!visited[x]) {
						visited[x] = true;
						q.offer(x);
					}

				}

			}

		}
	
	
		/* Function to add an Edge to the graph */
	public static void  addEdge(List<List<Integer>> adj , int u ,int v) {	 
			 adj.get(u).add(v);
			 adj.get(v).add(u);
			}
		
	public static void main(String[] args) {
	
		/* Number of vertices in the graph. */
		
		 int v = 5 ;
		 
			/* adjacency list representation in the graph. */
		 
		 List<List<Integer>> adj = new ArrayList<>();
		 
		 
		 for (int i=0;  i < v; i ++) {	 
			 adj.add(new ArrayList<Integer>());
         }
		
			/* Add Edge to the Graph */
		 
		 addEdge(adj, 0, 1);
		 addEdge(adj, 0, 2);
		 addEdge(adj, 1, 3);
		 addEdge(adj, 1, 3);
		 addEdge(adj, 2, 4);
		 
		 
			/* Mark All The Vertices as not visited. */
		 
		 boolean[] visited =  new boolean[v];
		 
		 
			/* perform BFS traversal at starting from 0 vertices */
		 
		 System.out.println("BFS Starting from 0 ");
		 
		 breadthFirstSearch(adj, 0, visited);
		 
	}
}
