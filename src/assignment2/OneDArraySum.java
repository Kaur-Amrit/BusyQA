package assignment2;

public class OneDArraySum {
	public static void main(String[] args) {
		System.out.println("Java program to calculate sum of array values.");
		
		int array1[]= {1,2,3,4,8,9,14};
		int sum=0;
		for(int i=0; i<array1.length; i++) {
		sum = sum + array1[i];
		}
		System.out.println("The sum of values in the given array (using 'for' loop) is " +sum);
	//***********************************************************	
		int sum_for_each = 0;
		for(int x:array1) {
			sum_for_each += x;
		}	
			System.out.println("The sum of values in the given array (using 'for_each' loop) is " +sum_for_each);
		
	}	

}
