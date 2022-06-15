package assignment2;

		
public class StringComparison {
	
	public static void main(String[] args) {
		String string1 = "AMRIT";
		String string2 = "Kaur";
		String string3= ("I am from Bharat");	
		
		System.out.println("Java program to compare two strings, ignoring case differences.");
		System.out.println(string1.compareToIgnoreCase(string2));
		
		System.out.println("*************************************************************************");
		
		System.out.println("Java program to concatenate a given string to the end of another string.");
		System.out.println(string1.concat(string2));
		
		System.out.println("*************************************************************************");
		
		System.out.println("Java program to get the length of a given string.");
		System.out.println(string1.length());
		
		System.out.println("*************************************************************************");
		
		System.out.println("Java program to get a substring of a given string between two specified positions.");
		
		System.out.println(string3.substring(1,10));
		
		System.out.println("*************************************************************************");
		
		System.out.println("Java program to convert all the characters in a string to lowercase.​");
		System.out.println(string3.toUpperCase());
		System.out.println(string3.toLowerCase());
		
		System.out.println("*************************************************************************");
		
     	  	
	
		//Did not succeed
		System.out.println("Write a Java program to convert integer to string.​");
		
		int num = 97;
		String s= String.valueOf(num);
		System.out.println("String value of given intger is " + s);
		//###########################################################################################
		
		//Did not succeed
		System.out.println("Write a Java program to convert string to integer.​");
		String string= "26";
		int num_value = Integer.valueOf(string);
		System.out.println("Integer value of given string is " + num_value);
		//###########################################################################################
	}
}