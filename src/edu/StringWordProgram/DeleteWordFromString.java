package edu.StringWordProgram;

public class DeleteWordFromString {

	public static void main(String[] args) {
		String s = "A RED SEED";
		String w = "";
		s += " ";//s=s+"";
		String ns = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c!=' ') {
				w += c;
			}else {
				if(!w.equals("RED")) 
					ns = ns+w+" ";
					w = "";				
					}
			}
		System.out.println(ns);
		}

	

}
