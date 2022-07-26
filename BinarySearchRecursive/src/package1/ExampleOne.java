package package1;

public class ExampleOne {
	public static void main(String[] args) {
		//set values to parameters
		int target = 9;
		int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//instantiate class instance
		ExampleOne eo = new ExampleOne();
		// set method return value to a variable
		int bs = eo.recursiveBinarySearch(data, target);
		//display what we want to see
		System.out.println("Binary Search target found at index: " + bs);
	}
	
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
