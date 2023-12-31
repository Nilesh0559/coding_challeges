package com.code.pattern;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic : Patten Printing
* Solid Rectangle
	* * * * * 
	* * * * *
	* * * * *
*******************************************************************/

public class SolidRectangle {

	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
