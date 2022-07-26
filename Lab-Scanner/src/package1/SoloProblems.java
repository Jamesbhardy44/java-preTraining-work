package package1;

import java.util.Scanner;

public class SoloProblems {

	public static void main(String[] args) {
		//instantiate a scanner to read input 
		Scanner scanner = new Scanner(System.in);
		System.out.println("$> Please enter some text ");
		
		String line = scanner.nextLine();
		int count = 0;
		
		for (int i = 0; i < line.length(); i++) {
			char letter = line.charAt(i);
			if (isVowel(letter)) {
				count++;
			}
		}
		
		System.out.println("The number of vowels: " + count);
		scanner.close();
	}
	
	public static boolean isVowel(char letter) {
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			return true;
		}
		return false;
	}
}
