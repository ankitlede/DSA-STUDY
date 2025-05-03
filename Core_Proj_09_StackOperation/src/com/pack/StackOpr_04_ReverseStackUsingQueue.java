package com.pack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackOpr_04_ReverseStackUsingQueue {
	
	
	
	public static void reverseStackUsingQueue(Stack<Integer> stk) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		
                  	while (!stk.isEmpty()) {
                    queue.add(stk.peek());
         		    stk.pop();
                  	}
                  	
                  	while(!queue.isEmpty()) {
                  		stk.push(queue.peek());
                  		queue.poll();
                  	}

	}
	
	public static void main(String[] args) {
	
	              Stack<Integer> stk = new Stack<Integer>();
	              stk .push(1);
	              stk.push(2);
	              stk.push(3);
	              stk.push(4);
	              stk.push(5);
	              
					/*
					 * Queue<Integer> queue = new LinkedList<Integer>();
					 * 
					 * for(int i=0; i< stk.size() ; i++) { queue.add(stk.pop()); }
					 * 
					 * for(int j=0 ; j < queue.size(); j++) {
					 * 
					 * stk.add(queue.poll()); }
					 * 
					 * stk.forEach(n -> System.out.println(n));
					 */
	              
	              reverseStackUsingQueue(stk);
	              
		
		System.out.println(stk);
		
		
		
	}
}
