package edu.StringWordProgram;

public class PrintFirstTwoCharacterOfWordInSttring {

	public static void main(String[] args) {
		String s = "In the box";
		String w ="";
		s += " ";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if(c!=' ') {
			 w += c;
			}else {
				System.out.print(w.substring(0, 2));
				w = "";
			}
		}

	}

}
