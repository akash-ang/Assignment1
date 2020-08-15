package removeduplicatefromarray;

/*2)Write a Java Program to remove duplicate elements in given Array?

Input:  1, 2, 5, 5, 6, 6, 7, 2

Output:  1, 2, 5, 6, 7*/
public class RemoveDuplicate {

	public static int removeDuplicate(int ar[], int n) {
		int temp[] = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (ar[i] != ar[i + 1]) {
				temp[j++] = ar[i];
			}
		}
		for (int i = 0; i < j; i++) {
			ar[i] = temp[i];
		}

		return j;

	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 5, 5, 6, 6, 7, 2 };

		int length = RemoveDuplicate.removeDuplicate(ar, ar.length);

		for (int i = 0; i < length; i++) {
			System.out.println(ar[i]);
		}
	}
}
