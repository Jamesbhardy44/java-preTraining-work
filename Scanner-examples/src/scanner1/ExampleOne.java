package scanner1;
import java.util.Scanner;

public class ExampleOne {
	

	public static void main(String[] args) {
		//setup some String data 
		String numbers = "1 2 3 4 5 7 9";
		
		//create scanner over String
		Scanner scanner = new Scanner(numbers);
	
		while(scanner.hasNextInt()) {
			System.out.println(scanner.nextInt());
			
			//print a comma if more numbers are available
			if(scanner.hasNextInt()) {
				System.out.println(",");
			}
		}
		//close scanner
		scanner.close();
		
	}
}
