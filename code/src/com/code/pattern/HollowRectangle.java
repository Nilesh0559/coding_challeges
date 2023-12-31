package com.code.pattern;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic : Pattern Printing
* Hollow Rectangle
* 	*****
*	*   *
*	*****
*******************************************************************/

public class HollowRectangle {

	public static void main(String[] args) {
		int rows = 3, columns = 5;
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= columns; j++) {
				if(i == 1 || i == rows || j == 1 || j == columns)
						System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
