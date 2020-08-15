
package thirdlargestnumber;

import java.util.Arrays;

/*4)Write a Java program to find third largest number in given Array ?

Input = { 6, 8, 1, 9, 2, 1, 10}
Output: Third largest element : 8

Int [] a = { 6, 8, 1, 9, 2, 1, 10, 12}
Output: Third largest element : 9

Int [] a = {6}
Output: Invalid Input, array size is less than 3*/

public class ThirdLargestNumber {
	public static void findThirdLargestNum(int num[]) {

		if (num.length < 3) {
			System.out.println("Size less Than 3");
			return;
		}
		int first = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > first) {
				first = num[i];
			}
		}

		int second = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (num[i] < first && num[i] > second) {
				second = num[i];
			}
		}
		int third = Integer.MIN_VALUE;

		for (int i = 0; i < num.length; i++) {
			if (num[i] < second && num[i] > third) {
				third = num[i];
			}
		}
		System.out.println("Third Largest no is : " + third);
	}

	public static void main(String[] args) {
		int num[] = { 6, 8, 1, 9, 2, 1, 10 };
		int num2[] = { 6, 8, 1, 9, 2, 1, 10, 12 };
		int num3[] = { 6 };
		findThirdLargestNum(num);
		findThirdLargestNum(num2);
		findThirdLargestNum(num3);

	}

}
