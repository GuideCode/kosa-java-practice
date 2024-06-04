package task.string;

import java.util.Scanner;

public class FindString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
	
		String findChar = sc.nextLine();
		
		char[] inputChar = input.toCharArray();
		int count = 0;
		
		for(int i=0; i<inputChar.length; i++) {
			if(findChar.equalsIgnoreCase(inputChar[i]+"")) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
