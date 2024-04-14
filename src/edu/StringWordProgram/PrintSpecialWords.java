package edu.StringWordProgram;

public class PrintSpecialWords {

	public static void main(String[] args) {
		String s ="MOM OR DAD";
		String w = "";
		s += " ";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c!=' ') {
				w += c;			
			}else {
				char f = w.charAt(0);
				char l = w.charAt(w.length()-1);
				if(Character.toUpperCase(l)== 
						Character.toUpperCase(f));
				System.out.println(w);
				w = "";
			}
		}

	}

}
