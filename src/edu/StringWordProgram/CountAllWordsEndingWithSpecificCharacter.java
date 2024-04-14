package edu.StringWordProgram;

public class CountAllWordsEndingWithSpecificCharacter {

	public static void main(String[] args) {
		String s = "A RED SEED";
		String w = "";
		s += " ";
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if(c!=' ') {
				w += c;
			}else {
				if(w.endsWith("D"))
					count++;
			}
		}
		System.out.println("No. of words"+count);
	}

}
