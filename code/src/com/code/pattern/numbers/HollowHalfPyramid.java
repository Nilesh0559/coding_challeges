package com.code.pattern.numbers;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic : Pattern Printing
* Hollow Half Pyramid
* 	1
*	12
*	1 3
*	1  4
*	12345
*******************************************************************/

public class HollowHalfPyramid {

	public static void main(String[] args) {
		int i, j, rows = 5;
		for(j = 1; j <= rows; j++) {
			for(i = 1; i <= j; i++)
				if(i == 1 || i == j || j == rows)
					System.out.print(i);
				else
					System.out.print(" ");
			System.out.println();
		}
	}
}
