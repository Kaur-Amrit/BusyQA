package assignment2;

public class OneDArrayAvg {
	public static void main(String[] args) {
		System.out.println("Java program to calculate average of array values.");
		
		int array1[]= {1,2,3,4,8,9,14};
		double array_avg=0.0;
		int array_sum = 0;
		int array_length = array1.length;
		for(int x : array1) {
			array_sum += x; 
		}
		array_avg = (double) array_sum/array_length;
		System.out.println("The average of array values is " +array_avg);
	}	

}
