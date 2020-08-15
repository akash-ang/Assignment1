package minmaxinarray;

import java.util.Arrays;

/*6)Write a Java Program to find Min and Max elements in given Array?

Input:  1, 2, 5, 5, 6, 6, 7, 2

Output:   Min : 1  Max : 7*/
public class MinMaxInArray {

	private static void findMinMax(int[] ar) {
		Arrays.sort(ar);

		System.out.println();
		System.out.println();
		System.out.printf("Min : %d   Max : %d", ar[0], ar[ar.length - 1]);

	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 5, 5, 6, 6, 7, 2 };

		findMinMax(ar);
	}

}
