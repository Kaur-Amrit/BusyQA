package assignment1;

public class Prog10 {

	public static void main(String[] args){
		
		
		System.out.println("Java program to write the fibonacci series in the range of 1 to 50. ");	
		
		int Fib_start1=1;
		int Fib_start2=2;
		System.out.print(Fib_start1 + " " + Fib_start2);
		int Fib_variable=0; 
		while(Fib_start1+Fib_start2<=50) {
			Fib_variable=Fib_start1 + Fib_start2;
			Fib_start1 = Fib_start2;
			Fib_start2 = Fib_variable;
			System.out.print(" "+ Fib_variable);
		}
		System.out.println();
		
		
	}
}
