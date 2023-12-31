package com.code.pattern.stars;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic : Pattern Printing
* Inverted Full Pyramid
* 	 * * * * * *  
*	  * * * * *   
*	   * * * *    
*	    * * *     
*	     * *      
*	      *       
*******************************************************************/

public class InvertedFullPyramid {

	public static void main(String[] args) {
		int i, j, k, rows = 6;
		for(j = 1; j <= rows; j++) {
			for(i = 1; i <= j; i++)
				System.out.print(" ");
			for(k = rows-j+1; k >= 1; k--)
				System.out.print("* ");
			for(i = 1; i <= j; i++)
				System.out.print(" ");
			System.out.println();
		}
	}
}
