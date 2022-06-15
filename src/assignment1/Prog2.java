package assignment1;

import java.util.Scanner;

public class Prog2 {
	public static void main(String args[])
	{
			
		System.out.println("Java program to find the greatest of three numbers.");
		
		int x, y, z;
		do
			{
			Scanner s = new Scanner(System.in);
			System.out.println("Please enter 3 different numbers below:");
			System.out.print("Please enter the first number: x= ");
			x= s.nextInt();
			System.out.print("Please enter the second number: y= ");
			y= s.nextInt();
			System.out.print("Please enter the third number: z= ");
			z= s.nextInt();
			}
		
		while(x==y||x==z||y==z);
				
		System.out.println();
		
		if(x>y &&x>z)
		{
		System.out.println("x is greatest, i.e: " +x);
		}
		else if(y>x && y>z)
		{
			System.out.println("y is greatest, i.e: "+y);
		}
		else
			System.out.println("z is greatest, i.e: "+z);
		System.out.println();
		

}
}
