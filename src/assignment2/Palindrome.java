package assignment2;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Java program to check a string is palindrome or not​");
		String string2 = "AMRIT";
		int i = 0, j = string2.length() - 1;
		while (i < j) {
       	if (string2.charAt(i) != string2.charAt(j)) {
               System.out.println(string2 +" is not a palindrome");
               break;
       	}
       	else {
       		System.out.println(string2 +" is a palindrome");    		
       	}
       i++;
           j--;
       }

	}
}
