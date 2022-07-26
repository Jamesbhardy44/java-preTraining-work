package package1;
import java.util.Scanner;

public class SoloProblems2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean done = false;
		
		while(done == false) {
		System.out.println("Hello Human. Enter some text please >");
		
		
		String input = scanner.next();
		
		System.out.println("you entered: " + input);
		
		switch(input) {
		
		 case "1" : {
			 System.out.println("Moving right");
			 break;
		 }
		 case "2" : {
			 System.out.println("Moving left");
			 break;
		 }
		 case "3" : {
			 System.out.println("Moving up");
			 break;
		 }
		 case "4" : {
			 System.out.println("Moving down");
			 break;
		 }
		 case "q" : {
			 System.out.println("exiting program");
			 done = true;
			 break;
		 }
		 default: {
			 System.out.println("Try again. Accepatable input: [1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]");
			 break;
		 }
	
	}
		}
	
	}
}
