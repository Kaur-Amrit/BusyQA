package assignment1;
import java.util.Scanner;

public class Prog4 {
	public static void main(String args[])
	{
		System.out.println("Java program that takes a year from user and print whether that year is a leap year or not."); 
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the year (eg. 1999, 2022):"); 
		int year= sc.nextInt(); 
		
		if(year%4 == 0 && year%400 == 0)
		{
			System.out.println("It is a leap year");
		} 
		
		else
		{
			System.out.println("It is not a leap year");
		}
		System.out.println();	
	}
}
