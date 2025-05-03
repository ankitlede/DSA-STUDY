package com.pack.singlyLinkedList;

public class DataInsertion_01 {
	

	
	
	// Function to insert  a new node at the beginning of the list.
	
	 
	
	public static Node insertFront(Node head , int data) {
		
		// create new node at the given data 
		Node  newNode = new Node(data);
		
		
		// make the next of the new node piont to the current head
	   newNode.next= head;
	   
	   
       // Return the new node as the new head of the list
	   return newNode;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
