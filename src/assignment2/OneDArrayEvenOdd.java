package assignment2;

public class OneDArrayEvenOdd {
	public static void main(String[] args) {
		System.out.println("Java program to find even and odd values in an array.");
		int array1[]= {1,2,3,4,8,9,14};
		System.out.print("The even values in the given array are: ");
		for(int x : array1) {
			if(x%2==0) {
				System.out.print(x+ ", ");
			}
		}
		System.out.println();
		
		System.out.print("The odd values in the given array are: ");
		for(int x : array1) {
			if(x%2==1) {
				System.out.print(x+ ", ");
			}
			
		}
		System.out.println();
	}
}
