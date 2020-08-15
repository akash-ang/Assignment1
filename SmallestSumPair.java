package smallestsumpair;

import java.util.Arrays;

/*10)Write a Java Program to find smallest pair sum in given Array?

Input: arr[] = {1, 7, 2, 9, 6}
Output: 3

The pair (1, 2) will have the minimum sum pair i.e. 1 + 2 = 3*/

public class SmallestSumPair {

    public static void main(String[] args) {
        int arr[] = { 1, 7, 2, 9, 6 };
        findSmallestSumPair(arr, arr.length);
    }

    private static void findSmallestSumPair(int arr[], int length) {
        Arrays.sort(arr);

        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min && arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }
        System.out.printf("sum of min pair (%d , %d) is %d", min, secondMin, min + secondMin);
    }
}