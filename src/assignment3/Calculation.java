package assignment3;

/*2. Write a program to demonstrate constructor. 
Create a class 'Calculation' with 3 integer variables. 
Create a constructor to assign the values into variables. 
Then create another method 'sum' to calculate sun of 3 numbers. 
Now create and call constructor by passing 3 integer values then call sum method. */

public class Calculation {
	int Num1, Num2, Num3;
	Calculation(int Num1, int Num2, int Num3){
		this.Num1=Num1;
		this.Num2= Num2;
		this.Num3= Num3;
	}
	int sum;
	public int Sum() {
		sum= Num1+Num2+Num3;
		return sum;
}
	public static void main(String[] args) {
		Calculation cal= new Calculation(2,3,5);
		System.out.println("Sum of given numbers is: " + cal.Sum());
		
	}
}