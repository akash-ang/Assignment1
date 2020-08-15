package elementpairssum;

/*9)Write a Java program to find element Pairs in given Array whose sum is equal to given number

Input Array :  {3, 6, 8, -8, 10, 8 } 
Sum : 16
Output :  Pairs with sum 16 are (6, 10) and (8, 8)*/

public class ElementPairsSum {

	public static void main(String[] args) {
		int arr[] = { 3, 6, 8, -8, 10, 8 };

		int sum = 16;

		findSumPairs(sum, arr);
	}

	private static void findSumPairs(int sum, int arr[]) {
		System.out.println("Pairs with sum 16 are:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == sum) {
					System.out.printf("(%d , %d)", arr[i], arr[j]);

				}
			}
		}
	}
}
