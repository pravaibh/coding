package com.gsprep.prev;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class PossibleDecodings {
  
  static int[] count;
  public static void main(String[] args) {
    int [] arr = {1,2,1,6,8,4,1,3,2};
    count = new int[arr.length + 1];
    System.out.print(findPossibleDecodings(arr));
  }
  
  static int findPossibleDecodings(int [] arr) {
    
    //
    count[0] = 1;
    count[1] = 1;
    for(int i = 2; i <= arr.length; i++) {
      count[i] = 0;
      if(arr[i-1] > 0) {
        count[i] = count[i-1];
      }
      if(arr[i-2] == 1 || arr[i-2] == 2 && arr[i-1] < 7) {
        count[i]+= count[i-2];
      }
    }
    return count[arr.length];
  }
  
}
