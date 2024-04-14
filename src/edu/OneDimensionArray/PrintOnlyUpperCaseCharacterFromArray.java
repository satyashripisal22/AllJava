package edu.OneDimensionArray;

public class PrintOnlyUpperCaseCharacterFromArray {

	public static void main(String[] args) {
		char arr[] = {'N','O','2','6','S','o','u','n','d'};
		for(int i=0;i<arr.length;i++) {
			
			if(Character.isUpperCase(arr[i]))
				System.out.println(arr[i]);
		}

	}

}
/*Print only lowercase if(Character.isLowerCase(arr[i]
 * Print only digits if(Character.isDigits(arr[i])
 * Remove all spaces if(!Character.isspace(arr[i])*/
