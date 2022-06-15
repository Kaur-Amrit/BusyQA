package assignment1;
import java.util.Scanner;

public class Prog7 {
public static void main(String[] args){
		
		System.out.println("Java program to reverse a number using while loop.");
		System.out.println("Please enter the number to reverse.");
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		int reversed_num;
		while(num>0) {
			reversed_num=num%10;
			num=num/10;
			System.out.print(reversed_num);
		}
		
		System.out.println();
}
}