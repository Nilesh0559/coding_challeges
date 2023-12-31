package com.code.pattern;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic : Pattern Printing
* Hollow Inverted Half Pyramid
* 	******
*	*   *
*	*  *
*	* *
*	**
*	*
*******************************************************************/

public class HollowInvertedHalfPyramid {

	public static void main(String[] args) {
		int rows = 6;
		for(int i = rows; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				if((i == rows) || (j == 1) || (j == i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
