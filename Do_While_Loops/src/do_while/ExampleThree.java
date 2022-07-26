package do_while;

public class ExampleThree {

	public static void main(String[] args) {
		
		//do while loop prints letters of alphabet
		// use a single char variable
		
		//JAMES SOLUTION: works, but is more work to make the list...
		/*
		int i = 0;
		char[] abc_list = 
			{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'
					, 'v', 'w', 'x', 'y', 'z'};
		do {
			System.out.println(abc_list[i]);
			i++;
		} while(i <= 26 );
		*/
		
		//REVATURE SOLUTION: faster and easier: *note obsolete methods warning? 
		
		char letter = 'a';
		char end = 'z';
		
		do {
			System.out.println(letter);
			letter++;
		} while (letter <= end);
		
	}
}
