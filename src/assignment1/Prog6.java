package assignment1;

import java.util.Scanner;

public class Prog6 {
	public static void main(String args[])
	{
		System.out.println("6. Write a Java program to find the number of digits in a number using while loop.");
		
		System.out.println("Please enter the number: ");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt(); 
		int i=0; 
		do {
		num=num/10;
		i++;
		}
		while(num>0);
		System.out.println("The number of digits is " +i);		
	}

}
