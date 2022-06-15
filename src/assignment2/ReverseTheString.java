package assignment2;

public class ReverseTheString {
	public static void main(String[] args) {	
		String string2= "Kaur";
		System.out.println("Java program to reverse a string and check if it is a palindrome.​");
		String reversed = " ";
		char ch;
		for (int i=0; i<string2.length(); i++)
	      {
	        ch= string2.charAt(i); //extracts each character
	        reversed= ch+reversed; //adds each character in front of the existing string
	      }
	    System.out.println("Reversed word: "+ reversed);
	      
	     if(string2.equalsIgnoreCase(reversed)) {
	     System.out.println(string2 +" is a palindrome");    
	     }
	     else {
	      System.out.println(string2 +" is not a palindrome");   
	      }
	}
}
