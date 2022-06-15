package assignment2;

//import java.lang.reflect.Array;

public class OneDArrayMissingNo {
	public static void main(String[] args) {
		System.out.println("4. Write a Java program to find the missing element in an array.");
		int array1[]= {1,2,3,4,8,9,14};
		int array2[]= {1,2,3,4,9,14};
		int array1_sum=0, array2_sum=0;
		for(int x: array1) {
			array1_sum= array1_sum + x;
		}
		
		for(int x: array2) {
			array2_sum= array2_sum + x;
		}
		
		int missing_num= array1_sum - array2_sum;
		System.out.println("The missing number is " +missing_num);
				
	}
}
