package secondminandsecondmax;

import java.util.Arrays;

/*7)Write Java Program to find second Min and Second Max elements in given Array ?

Input: 1, 2, 5, 9, 6, 4, 7, 2
Output: Second Min-2  Second Max-7*/

public class SecondMinMax {

    public static void main(String[] args) {
        int ar[] = { 1, 2, 5, 9, 6, 4, 7, 2 };

        findSecondMin(ar);
        findSecondMax(ar);
    }

    private static void findSecondMin(int[] ar) {
        Arrays.sort(ar);
        int firstMin = ar[0];

        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > firstMin && ar[i] < secondMin) {
                secondMin = ar[i];

            }
        }
        System.out.println("Second Min Value is: " + secondMin);

    }

    private static void findSecondMax(int[] ar) {
        Arrays.sort(ar);
        int firstMax = ar[ar.length - 1];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < firstMax && secondMax < firstMax) {
                secondMax = ar[i];

            }
        }
        System.out.println("Secomd Max Value is : " + secondMax);
    }

}
