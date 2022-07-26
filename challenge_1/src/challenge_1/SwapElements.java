package challenge_1;

public class SwapElements {
	
	//variable swap. make sure you get WHY this works. 
	
	public static void main(String[] args) {
		//declare array
		int[] elements = {1,2,3,4,5};
		
		//swap!
		elements[0] = elements[elements.length-1];
		elements[4] = elements[elements.length -1]-4;
	
		
		
		//System.out.println(elements[1]);
		
		//print resulting array
		
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
		
	}
}
