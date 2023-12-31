package com.code.pattern.stars;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic : Hollow Full Pyramid
* 	      *       
*	     * *      
*	    *   *     
*	   *     *    
*	  *       *   
*	 * * * * * *  
*******************************************************************/

public class HollowFullPyramid {

	public static void main(String[] args) {
		int i, j, rows = 6;
		for(j = 1; j <= rows; j++) {
			for(i = j; i <= rows; i++)
				System.out.print(" ");
			for(i = 1; i <= j; i++) {
				if(i == 1 || j == rows || i == j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(i = j; i <= rows; i++)
				System.out.print(" ");
			System.out.println();
		}
	}
}
