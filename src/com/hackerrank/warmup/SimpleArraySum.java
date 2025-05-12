package com.hackerrank.warmup;

/**
 * 
Given an array of integers, find the sum of its elements.
For example, if the array ar = [1,2,3], 1 + 2 + 3 = 6 , so return 6.
Function Description
Complete the simpleArraySum function with the following parameter(s):
 ar[n]  : an array of integers
Returns
 int   : the sum of the array elements

Input Format
The first line contains an integer, n , denoting the size of the array.
The second line contains n space-separated integers representing the array's elements.
Constraints
Sample Input
STDIN           Function
-----           --------
6               ar[] size n = 6
1 2 3 4 10 11   ar = [1, 2, 3, 4, 10, 11]
Sample Output
31

 * 
 */

import java.util.*;

public class SimpleArraySum {

    static int simpleArraySum(int n, int[] ar) {
        // Complete this function
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum = sum + ar[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int[] ar = new int[n];
			for(int ar_i = 0; ar_i < n; ar_i++){
			    ar[ar_i] = in.nextInt();
			}
			int result = simpleArraySum(n, ar);
			System.out.println(result);
			System.out.println(simpleArraySumLambda(n, ar));
		}
    }
    
    static int simpleArraySumLambda(int n, int[] ar) {
    	return Arrays.stream(ar).reduce(0, (n1,n2) -> n1 + n2);
    }
}

