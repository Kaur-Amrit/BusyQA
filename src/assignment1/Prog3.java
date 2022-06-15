package assignment1;

import java.util.Scanner;

public class Prog3 {
	public static void main(String args[])
	{
		
	
		System.out.println("3. Write a Java program to find the number of days in a month."); 
		Scanner m = new Scanner(System.in);
		System.out.print("Please enter the month name (eg. January, February):"); 
		String month= m.nextLine(); 
		
		switch (month)
		{
			
		case "January":
			case "March":
			case "May":
			case "July" :
			case "August":
			case "October":
			case "December":
			System.out.print("It has 31 days.");
			
			break;
			
			case "April":
			case "June": 
			case "September": 
			case "November":
			System.out.print("It has 30 days.");	
			
			break;
			
			case "February":
			System.out.print("It has 28 days for non-leap years and 29 days for leap years.");
				
			break;
			
			default:
			System.out.println("No match found");
		
		}
		System.out.println(); 
	}
}
