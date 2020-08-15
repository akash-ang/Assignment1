package findduplicateinarray;




/*1)Write a Java Program to find duplicate elements in given Array?

Input:  1, 2, 5, 5, 6, 6, 7, 2

Output:  2, 5, 6*/


public class FindDuplicate {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 5, 5, 6, 6, 7, 2};
		
		for(int i=0;i<=numbers.length;i++)
		{
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i] == numbers[j])
				{
					System.out.println(numbers[i]);
				}
				
			}
		}
	}
}
