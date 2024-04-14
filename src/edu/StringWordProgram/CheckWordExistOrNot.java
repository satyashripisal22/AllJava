package edu.StringWordProgram;

public class CheckWordExistOrNot {

	public static void main(String[] args) {
		String s = "MOM OR DAD";
		String w = "";
		s += " ";
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if(c!=' ') {
				w += c;
			}else {
				if(w.equalsIgnoreCase("OR"))
					count++;
			}
		}
		if(count==0) {
			System.out.println("Not found");
		}else {
			System.out.println("found");
		}

	}

}
