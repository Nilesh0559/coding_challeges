package com.code.pattern.numbers;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic : Pattern Printing
* Half Pyramid
* 	1
*	12
*	123
*	1234
*	12345
*******************************************************************/

public class HalfPyramid {

	public static void main(String[] args) {
		int i, j, rows = 5;
		for(j = 1; j <= rows; j++) {
			for(i = 1; i <= j; i++)
				System.out.print(i);
			System.out.println();
		}
	}
}
