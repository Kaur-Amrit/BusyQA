package assignment2;

public class WordCount {
	public static void main(String[] args) {	
		String string3= ("I am from Bharat");
		System.out.println("Java program to count number of words in a sentence.​");
		int j= string3.length(); 
		int words= 1, i=0;
		while(i<j) {
			if(string3.charAt(i)==' ') {
			words++;
		}
		i++;
	}
	System.out.println("The number of words in the given sentence is " + words);
}
}