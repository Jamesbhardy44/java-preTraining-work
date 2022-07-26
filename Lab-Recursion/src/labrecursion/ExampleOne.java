package labrecursion;

public class ExampleOne {
	
	public static void main(String[] args) {
		
		// create some dummy data for our method
		int input = 1;
		char letter = 'j';
		int[] data = {1, 2,3, 4, 5, 6, 7, 8, 9, 10};
		// instantiation
		ExampleOne eo = new ExampleOne();
		//call your method here
		System.out.println(eo.factorial(input));
		//call second method
		eo.alphabet(letter);
		int bs = eo.recursiveBinarySearch(data, input);
		System.out.println("Binary Search target found at index: " + bs);
	}
	
	//create first method
	public int factorial(int num) {
		//base cases: return 0 or 1
		if(num <= 0)return 0;
		if(num == 1)return 1;
		//recursion
		return num * factorial(num-1);
	}
	//create second method
	public void alphabet(char letter) {
		if (letter < 'a' || letter > 'z') return;
		System.out.println(letter);
		letter --;
		alphabet(letter);
	}
	//create third method
	public int recursiveBinarySearch(int[] data, int target ) {
		//if p_target null return -1; // base case
		if (data == null || data.length== 0) return -1;	
	// define range of indexes
	int minRange = 0;
	int maxRange = data.length;
	//find midpoint
	int midPoint = data[maxRange / 2];
	
	if (midPoint == target) {
		return  maxRange / 2; // return the position
	} else if (data.length == 1) {
		return -1; // this is to stop additional recursive calls
	} else if (midPoint < target) { //zoning in on target...
		minRange = (maxRange/2);
	int[] temp = copyArray(data, minRange, maxRange);
	//need to add the range if it is in the upper half
	// to keep track of the index; otherwise index based on smaller range
	int indexAdder = (maxRange / 2);
	//find the index in the smaller array
	int search = recursiveBinarySearch(temp, target);
	//check if search found the value
	if (search == -1) {
		return -1;
	} else {
		return indexAdder + search;
	// return the value plus the adder if found	
	}
} else if (midPoint > target ) {
		maxRange = (maxRange / 2);
	 
	int temp[] = copyArray(data, minRange, maxRange);
	
	return recursiveBinarySearch(temp, target);
}
	return -1;
		
		}// method
	
	public int[] copyArray(int[] original, int min, int max) {
		int[] target = new int[max-min];
		for (int i = 0; i < target.length; i++) {
			target[i] = original[min + i];
		}
		return target;
	}
}













