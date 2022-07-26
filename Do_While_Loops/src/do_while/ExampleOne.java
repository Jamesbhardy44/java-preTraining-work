package do_while;

public class ExampleOne {

	public static void main(String[] args) {
		
		
		int value = 1;
		
		do {
			//print sums of 1 through ten with each number: ex 1 + 1 = 2:
			System.out.println(value + "+" + value + "=" + (value + value));
			value += 1;
		} while(value <= 10);
		
		}
	}

