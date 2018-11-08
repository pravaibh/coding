package com.gsprep.prev;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class QuickSort {
  
  public static void main(String[] args) {
    int [] a = {5,21,18,25,3,11,78};
    quickSort(a, 0, a.length - 1);
    for(int i: a) {
      System.out.println(i);
    }
  }
  
  static void quickSort(int[] arr,int low, int high) {
    if(low < high) {
      int pivot = partition(arr, low, high);
      quickSort(arr, low, pivot - 1);
      quickSort(arr, pivot+1, high);
    }
  }
  
  static int partition(int[] arr, int start, int end) {
    int pivot = arr[end];
    int i = start - 1;
    for(int j = start; j < end; j++) {
      if(arr[j] <= pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, end, i+1);
    return i+1;
  }
  
  static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
  
}