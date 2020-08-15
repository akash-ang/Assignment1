package sumofuniqueelements;

import java.util.Arrays;

/*3)Write a Java Program to find sum of unique elements in given Array?

Input = {1, 6, 4, 3, 2, 2, 3, 8, 1};
Output : 24 
(Unique elements are: 1, 6, 4, 3, 2, 8)

Input= {1, 1, 3, 2, 2, 3};
Output : 6 
(Unique elements are: 1, 2, 3)*/

public class SumOfUniqueElements {

	public static int findSum(int num[]) {

		Arrays.sort(num);
		int sum = num[0];

		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] != num[i + 1]) {
				sum += num[i + 1];

			}

		}
		return sum;
	}

	public static void main(String[] args) {
		int num[] = { 1, 6, 4, 3, 2, 2, 3, 8, 1 };
		int num2[] = { 1, 1, 3, 2, 2, 3 };

		System.out.println(findSum(num));
		System.out.println(findSum(num2));

	}

}
