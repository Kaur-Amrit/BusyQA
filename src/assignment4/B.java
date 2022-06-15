package assignment4;

public class B implements A{
		public void sum() {
			int sum= a+b;
			System.out.println("The sum of two numbers is " + (a+b));
	}
		public static void main(String[] args) {
			B s= new B();
			s.sum();
		}
}
