package assignment4;

public class Calculation implements A,C{

	@Override
	public void mul() {
		System.out.println("The multiplicstion of numbers in interface C is " + (x*y));
		
	}

	@Override
	public void sum() {
		System.out.println("The sum of numbers in interface A is " + (a+b));
		
	}

public static void main(String[] args) {
	Calculation c= new Calculation();
	c.mul();
	c.sum();
}


}
