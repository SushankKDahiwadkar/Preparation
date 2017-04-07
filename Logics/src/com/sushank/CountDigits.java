/**
 * Count Digits
 * 
 * You are given a string S. Count the number of occurrences of all the digits in the string S.
   
   Input : First line contains string S.
   
   Output :
   For each digit starting from 0 to 9, print the count of their occurrences in the string S. So, print 10 lines, each line containing 2 space separated integers. First integer i and second integer count of occurrence of i.  
 */

package com.sushank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountDigits {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		String[] numbers = line.split("");

		int[] counts = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			counts[Integer.parseInt(numbers[i])]++;
		}

		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + " " + counts[i]);
		}
	}
}
