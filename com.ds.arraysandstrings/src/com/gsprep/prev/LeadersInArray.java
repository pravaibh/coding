package com.gsprep.prev;

import java.util.Stack;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class LeadersInArray {
  
  
  public static void main(String[] args) {
    int [] arr = {1,2,11,6,8,4,1,3,2};
    findPossibleDecodings(arr);
  }
  
  static void findPossibleDecodings(int [] arr) {
    
    //1st approach: loop through the array , push first element if stack is empty.     // if not, check with top. If         top > element, push;
    //else pop until top > element;
    Stack<Integer> st = new Stack<Integer>();
    for(int i: arr) {
      if(st.isEmpty()) {
        st.push(i);
      } else {
        if(st.peek() > i) {
          st.push(i);
        } else {
          while(!st.isEmpty() && st.peek() <= i) {
            st.pop();
          }
          st.push(i);
        }
      }
    }
    for(int i : st) {
      System.out.println(i);
    }
    //2nd approach: loop from the end. Print last element for sure. maxTR = last element. If current > maxTR, print that element. maxTR = current. i--;
    int maxTR = arr[arr.length - 1];
    System.out.println(maxTR);
    for(int i = arr.length -1; i >=0; i --) {
      if(arr[i] > maxTR) {
        maxTR = arr[i];
        System.out.println(maxTR);
      }
    }
  }
  
}
