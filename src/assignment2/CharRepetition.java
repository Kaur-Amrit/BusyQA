package assignment2;

public class CharRepetition {
	public static void main(String[] args) {
		System.out.println("Java program to count number of time a character repeated in a string.​");
		String string3= ("I am from Bharat");
		int char_count[]= new int[128];
		char ch;
		for(int i=0;i<string3.length();i++) {
			ch= string3.charAt(i);
			int ascii_value=ch;
			char_count[ascii_value]++;	
		
		}
		
		for(int i=0;i<char_count.length; i++) {
			if(char_count[i]!=0) {
				ch= (char)i;	//converting array index to character
				
				System.out.println("The letter '"+ ch+ "' occurred " + char_count[i] + " times");
			}
		}
	}

}
