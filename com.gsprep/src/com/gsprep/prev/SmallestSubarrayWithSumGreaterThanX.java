package com.gsprep.prev;

import java.util.HashMap;
import java.util.Map;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class SmallestSubarrayWithSumGreaterThanX {
  
  
  public static void main(String[] args) {
    int arr[] = {1, 4, 45, 6, 0, 19};
    smallestSubarrayWithSumGreaterThanGiven(arr, 51);
  }
  
  static void smallestSubarrayWithSumGreaterThanGiven(int [] arr, int x) {
    
    //keep two pointers... start and end. init to 0. keep a variable length. keep count of sum while looping through the array... 0 <= end <= arr.length-1... whenever u get the sum as greater than x, increment start, and reduce arr[start] from sum and check if this new sum is less than x. Map of innt int... length vs start index.
    int end = 0;
    int length = arr.length+1;
    int start = 0;
    Map<Integer, Integer> map = new HashMap<>();
    int sum = 0;
    while (end < arr.length) {
      while(sum <= x && end < arr.length){
        sum += arr[end++];
      }
      while(sum > x && start < arr.length){
        if(end - start < length) {
          length = end - start;
          map.put(length,start);
        }
        sum -= arr[start++];
      }
    }
    // if(sum > x) {
    System.out.println(length);
    for(int i = 0; i < length;i++) {
      System.out.println(arr[map.get(length)+i]);
    }
    // } else {
    //   System.out.println("not possible");
    // }
   
    }
  }
