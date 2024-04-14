package edu.StringWordProgram;

public class ChangeWordtoAnotherWord {

	public static void main(String[] args) {
		String s = "A RED SEED";
		String w = "";
		s += " ";
		String ns = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c!=' ') {
				w += c;
			}
			else {
				if(w.equals("RED"))
					ns = ns+"BLUE"+" ";
				else
					ns = ns+w+" ";
				w = "";
			}
		}
		System.out.println(ns);

	}

}
