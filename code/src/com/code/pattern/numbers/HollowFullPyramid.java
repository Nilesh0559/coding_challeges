package com.code.pattern.numbers;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic : Pattern Printing
* Hollow Full Pyramid
* 	          1           
*	        1   2         
*	      1       3       
*	    1           4     
*	  1 2 3 4 5 2 3 4 5   
*******************************************************************/

public class HollowFullPyramid {

	public static void main(String[] args) {
		int i, j, rows = 5;
		for(j = 1; j <= rows; j++) {
			for(i = j; i <= rows; i++)
				System.out.print("  ");
			for(i = 1; i <= j; i++){
				if(i == 1 || j == rows)
					System.out.print(i + " ");
				else
					System.out.print("  ");
			}
			for(i = 2; i <= ((j * 2) - i); i++) {
				if(i == j || j == rows)
					System.out.print(i + " ");
				else
					System.out.print("  ");
			}
			for(i = j; i <= rows; i++)
				System.out.print("  ");
			System.out.println();
		}
	}
}
