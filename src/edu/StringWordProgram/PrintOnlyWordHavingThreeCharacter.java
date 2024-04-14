package edu.StringWordProgram;

public class PrintOnlyWordHavingThreeCharacter {

	public static void main(String[] args) {
		String s = "A RED SEED";
		String w ="";
		s += " ";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c!=' ') {
				w += c;
			}else {
				if(w.length()==4)
					System.out.println(w);
				w="";
			}
		}

	}

}
