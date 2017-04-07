/**
 * Given a string S, of length N that is indexed from 0 to N - 1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line.
 */

package com.sushank;

import java.util.Scanner;

public class OddEvenStringCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] output = new String[n];

		for (int i = 0; i < n; i++) {
			String line = scanner.next();
			String[] lineElements = line.split("");
			boolean flag = true;
			String part1 = "";
			String part2 = "";
			for (int j = 0; j < lineElements.length; j++) {
				if (flag) {
					part2 += lineElements[j];
					flag = false;
				} else {
					part1 += lineElements[j];
					flag = true;
				}
			}

			output[i] = part1 + " " + part2;
		}

		for (String showThis : output) {
			System.out.println(showThis);
		}
	}
}
