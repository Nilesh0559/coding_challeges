package com.code.pattern.numbers;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic : Pattern Printing
* Hollow Inverted Half Pyramid
* 	1 2 3 4 5 
*	2     5 
*	3   5 
*	4 5 
*	5 
*******************************************************************/

public class HollowInvertedHalfPyramid {

	public static void main(String[] args) {
		int i, j, rows = 5;
		for(j = 1; j <= rows; j++) {
			for(i = j; i <= rows; i++) {
				if(j == 1 || i == j || i == rows)
					System.out.print(i + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}
