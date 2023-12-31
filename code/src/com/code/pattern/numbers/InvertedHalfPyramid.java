package com.code.pattern.numbers;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic : Inverted Half Pyramid
* 	12345
*	1234
*	123
*	12
*	1
*******************************************************************/

public class InvertedHalfPyramid {

	public static void main(String[] args) {
		int i, j, rows = 5;
		for(j = rows; j >= 1; j--) {
			for(i = 1; i <= j; i++)
				System.out.print(i);
			System.out.println();
		}
	}
}
