package assignment1;

import java.util.Scanner;

public class Prog1 {

	//Conditions , Loops and Input from User
	public static void main(String args[])
	{	
			System.out.println("Conditions, Loops and Input from User");
			System.out.println("1. Java program to get a number from the user and print whether it is positive or negative.");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter the number of your choice: ");
			int num= sc.nextInt();
			
			if(num<0)
			
				System.out.println("The entered number is negative");
			
				else if(num>0)
			
				System.out.println("The entered number is positive");
				
				else 
					System.out.println("The entered number is Zero"); 
			System.out.println();
}
}
