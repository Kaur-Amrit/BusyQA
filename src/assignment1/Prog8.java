package assignment1;

import java.util.Scanner;

public class Prog8 {
public static void main(String[] args){
		
	System.out.println("Java program to check a number is palindrome or not using while loop"); 
	System.out.println("Please enter the number:");
	Scanner sc=new Scanner(System.in);
	int num= sc.nextInt();
	int reversed_num= 0;
	int remainder;
	int x= num;
	while(x>0) {
		remainder=x%10;
		reversed_num=reversed_num * 10 + remainder;
		x= x/10;			
	}
	
	if(num==reversed_num) {
		System.out.println("The given number " +num + " is a palindrome.");
	}
	else {
		System.out.println("The given number " +num + " is not a palindrome.");
	}
}
}