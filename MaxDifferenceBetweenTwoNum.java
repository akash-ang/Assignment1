package maxdifferencebetweentwonum;

import java.util.Arrays;

/*5)Write a java program to find maximum difference between two elements in given Array?
Input = { 2, 5, 1, 7, 3, 9, 5}
Output = 8  

Explanation : The maximum difference is between 1 and 9

Input = { 9, 2, 12, 5, 4, 7, 3, 19, 5}
Output: 17

Explanation : The maximum difference is between 19 and 2
*/

public class MaxDifferenceBetweenTwoNum {
	public static void maxDifference(int num[])
	{
		Arrays.sort(num);
		//System.out.println(num[num.length-1] - num[0]);
		System.out.printf("The maximum difference is between %d and %d is: %d",num[num.length-1],num[0],num[num.length-1]-num[0]);
	    System.out.println();
	}
	public static void main(String[] args) {
		int num[] = { 2, 5, 1, 7, 3, 9, 5};
		int num1[] = { 9, 2, 12, 5, 4, 7, 3, 19, 5};
		
		maxDifference(num);
		maxDifference(num1);
	}
}
