package com.code.array;

import java.util.Arrays;
import java.util.Scanner;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic : Arrays
* Problem statement
*	Given an array ‘arr’ of size ‘n’ find the largest element in the array.
*	Example:
*	Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]
*	Output: 5
*	Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.
*******************************************************************/

public class Problem1 {

	  public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        String line = sc.nextLine();
	        String[] strArr = line.split(" ");
	        int[] arr = Arrays.stream(strArr).mapToInt(e -> Integer.parseInt(e)).toArray();
	        int max = largestElement(arr, n);
	        System.out.println(max);
	        sc.close();
	    }

	    static int largestElement(int[] arr, int n) {
	        int max = 0;
	        for(int element : arr){
	            if(element > max)
	                max = element;
	        }
	        return max;
	    }
}
