package assignment3;

/*1) Create a class Calculation with the following methods. 
Class Name: Calculation
int sum(int x, int y) : Should accept two integer parameters and returns sum of two numbers.
int sum(int x, int y, int z) : Should accept three integer parameters and returns sum of three
numbers.
double sum(double x, double y) : Should accept two double type parameters and returns sum
of two numbers.
double sum(double x, double y, double z) : Should accept three double type parameters and
returns sum of three numbers.

Now, create object for Calculations class ‘cal’ then call different methods by passing different
inputs.
*/

public class Calculation1 {

	public void sum(int x, int y) {
		int sum=x+y;
		System.out.println("Sum of the given 2 integers is: " + sum);
	}
	
	public void sum(int x, int y, int z) {
		int sum=x+y+z;
		System.out.println("Sum of the given 3 integers is: " + sum);
	}
	public void sum(double x, double y, double z) {
		double sum= x+y+z;
		System.out.println("Sum of the given 3 double variables is: " + sum);
		
	}
	public void sum(double x, double y) {
		double sum= x+y;
		System.out.println("Sum of the given 2 double variables is: " + sum);
	}

public static void main(String[] args) {
	Calculation1 cal = new Calculation1();
	cal.sum(5, 5);
	cal.sum(5.5, 5.5);
	cal.sum(5, 5, 5);
	cal.sum(5.5, 5.5, 5.5);
}
}