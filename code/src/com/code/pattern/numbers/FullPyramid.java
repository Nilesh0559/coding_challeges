package com.code.pattern.numbers;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic : Pattern Printing
* Full Pyramid
* 	          1           
*	        2 3 2         
*	      3 4 5 4 3       
*	    4 5 6 7 6 5 4     
*	  5 6 7 8 9 8 7 6 5   
*******************************************************************/

public class FullPyramid {

	public static void main(String[] args) {
		int i, j, k;
		for(j = 1; j <= 5; j++) {
			for(i = j; i <= 5; i++) 
				System.out.print("  ");
			for(k = j; k <= ((j * 2) - 1) ; k++)
				System.out.print(k + " ");
			for(k = ((j-1) * 2); k >= j; k--)
				System.out.print(k + " ");
			for(i = j; i <= 5; i++) 
				System.out.print("  ");
			System.out.println();
		}
		
	}
}
