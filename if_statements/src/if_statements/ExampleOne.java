package if_statements;

public class ExampleOne {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		if(b < a || a == b) {
			System.out.println("Inside the if-statement");
		}
		else if(b == 5 || b == 6) {
		System.out.println("inside the else if statement");
		}
		else {
			System.out.println("else statement activated");
		}
	}
}
