package com.gsprep.prev;

import java.util.Stack;

public class CopyFromOneStackToAnotherNoExSpace {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		Stack<Integer> copy = new Stack<>();
		copyStack(st, copy);
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		while(!copy.isEmpty()) {
			System.out.println(copy.pop());
		}
	}
	
	/**
	 * Recursively traverse the original stack calling pop and then recursively calling copyStack. 
	 * After the first return, you're at the end of the stack. start adding to the new stack here.
	 * @param orig
	 * @param copy
	 */
	public static void copyStack(Stack<Integer> orig, Stack<Integer> copy) {
		
		if(!orig.isEmpty()) {
			int top = orig.pop();
			copyStack(orig, copy);
			copy.push(top);
		}
		return;
	}
}
