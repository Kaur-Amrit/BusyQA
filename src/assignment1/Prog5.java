package assignment1;
import java.util.Scanner; 

public class Prog5 {
	public static void main(String args[])
	{
						
		System.out.println("Java program to display the multiplication table of a given integer using for loop."); 
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the integer for its multiplication table:"); 
		int i= sc.nextInt(); 
		int j, k;
		for(j=1;j<=10;j++)
		{
			k=i*j;
			System.out.print(i);
			System.out.print("*");
			System.out.print(j);
			System.out.print("=");
			System.out.print(k);
			System.out.println();
		}
		System.out.println();
	}
}
