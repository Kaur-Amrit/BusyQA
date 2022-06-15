package assignment2;

public class OneDArrayGreatestAndSmallestNo {
	public class OneDArrayMissingNo {
		public static void main(String[] args) {
			System.out.println("4. Write a Java program to find the greatest and the smallest element in an array.");
			int array1[]= {1,2,3,4,8,9,14};
			int i=0;
			for(int x:array1)
			{
				if(i<=x) {
					i=x;
				}
				else {
					i=i;
				}
			}
			System.out.println("The greatest number in array is " +i);
			
			for(int x:array1)
			{
				if(i>=x) {
					i=x;
				}
				else {
					i=i;
				}
			}
			System.out.println("The smallest number in array is " +i);
			
		}
	}
}
