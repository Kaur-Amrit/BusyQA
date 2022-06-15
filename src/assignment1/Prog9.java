package assignment1;

import java.util.Scanner;

public class Prog9 {
	public static void main(String[] args){
		
		System.out.println("Java program to calculate the factorial of a number using any loop");	
		
		System.out.println("Please enter the number:");
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		int fact=1;
		for(int i =num; i>=1; i--){
			fact = fact *i;
		}
		System.out.println("The factorial of given number is " +fact);
}
}