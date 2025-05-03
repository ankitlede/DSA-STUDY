package com.pack;

import java.util.Stack;

public class StackOpr_01_ParenthesisChecker {

	// Function for parenthesis checking
	public static boolean isPair(String par) {

		// create stack to store previous parenthesis
		Stack<Character> stk = new Stack<>();

		for (int i = 0; i < par.length(); i++) {
			// Initial checking ......

			if (par.charAt(i) == '{' || par.charAt(i) == '[' || par.charAt(i) == '(') {
				stk.add(par.charAt(i));
			} else {

				// here we checking opening parenthesis and closing
				// parenthesis matched or unmatched if unmatched then remove it otherwise return
				// false
				if (!stk.isEmpty() && stk.peek() == '{' && par.charAt(i) == '}'
						|| stk.peek() == '[' && par.charAt(i) == ']' || stk.peek() == '(' && par.charAt(i) == ')') {

					stk.pop();

				} else
					return false;

			}

		}
	// At the end stack is empty and returns true.
		return stk.empty();
	}

	// reverse String using stack

	// peack pop add

	public static void strReverse(StringBuffer str) {

		Stack<Character> stk = new Stack<Character>();

		// insert into stack

		for (int i = 0; i < str.length(); i++) {
			stk.push(str.charAt(i));
		}

		// set reverse character in string with help of pop()

		for (int j = 0; j < str.length(); j++) {

			char ch = stk.pop();
			str.setCharAt(j, ch);
		}
	}

	public static void main(String[] args) {
	//	String str = "{[{[(())]}]{}}";
	//	System.out.println("Given paraneth is matched :: " + isPair(str));
		StringBuffer st = new StringBuffer("Ankit");
		strReverse(st);
		System.out.println(st);
	}

}
