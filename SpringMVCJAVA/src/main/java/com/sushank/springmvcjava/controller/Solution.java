package com.sushank.springmvcjava.controller;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   /* public static int[] arrayLeftRotation(int[] a, int n, int k) {
    	
    	for (int i=0 ; i < k ; i++) {
    		int temp = a[0];
    		for (int j=0 ; j < a.length ; j ++) {
    			if (j == a.length-1) {
    				a[a.length-1] = temp;
    			} else {
    				a [j] = a [j+1];
    			}
    			
    		}
    	}
    	
		return a;
      
    }*/
    
	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		rotate (a, n, k);
		return a;
	}
	
	private static void rotate (int[] a, int n, int k) {
		
		if (k > 0 ) {
			int temp = a[0];
    		for (int j=0 ; j < a.length ; j ++) {
    			if (j == a.length-1) {
    				a[a.length-1] = temp;
    			} else {
    				a [j] = a [j+1];
    			}
    			
    		}
    		k = k - 1;
    		System.out.println(k);
    		rotate (a, n, k);
		}
		
		
	}
			
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
