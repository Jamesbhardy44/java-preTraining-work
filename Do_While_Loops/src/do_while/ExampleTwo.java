package do_while;

public class ExampleTwo {
//James Hardy
	public static void main(String[] args) {
		//do while loop that prints odd numbers 1 - 49 inclusively
		// each on new line:
		
		int i = 0; // counter
		
		do { // if odd, print. note* for even numbers, change != to ==
			if (i % 2 != 0) {
			System.out.println("odd numbers  " + i );
			}
			i++; // check up the counter one time. 
		}while(i <= 49);  // stop when we get to 49.
	}
	
}
