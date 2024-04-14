package edu.StringWordProgram;

public class CountString {

	public static void main(String[] args) {
		
		String str = "!! Test Automation Central !! @ 12345";
		int digits = 0, letters = 0, whitespaces = 0, special = 0;
		
		for(char ch : str.toCharArray()) {
			if(Character.isDigit(ch)) {
				digits++;
			}else if(Character.isLetter(ch)) {
				letters++;
			}else if(Character.isWhitespace(ch)) {
				whitespaces++;
			}else {
				special++;
		
			}
				
		}
		System.out.println("No of Digits:"+digits);
		System.out.println("No of Letters:"+letters);
		System.out.println("No of Whitespaces:"+whitespaces);
		System.out.println("No of special:"+special);
	}

}
