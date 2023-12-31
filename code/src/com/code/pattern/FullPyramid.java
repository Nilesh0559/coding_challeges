package com.code.pattern;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic : Pattern Printing
* Full Pyramid
* 		  *       
*	     * *      
*	    * * *     
*	   * * * *    
*	  * * * * *   
*	 * * * * * *  
*******************************************************************/

public class FullPyramid {

	public static void main(String[] args) {
		int i,j,k, rows = 6;
		for(j = rows; j >= 1; j--) {
			for(i = j; i >= 1; i--)
				System.out.print(" ");
			for(k = 1; k <= rows-j+1; k++)
				System.out.print("* ");
			for(i = 1; i <= j; i++)
				System.out.print(" ");
			System.out.println();
		}
	}
}
