package packageOne;

public class SomeClass {
	
// when we create or instantiate a new object, we are using a constructor.
	// we can customize these to have attributes and parameters. 
	
	long serialNumber;
	
	public SomeClass() {
		this(101);
		System.out.println("inside default no arg constructor");
	}
	
	public SomeClass(long serialNumber) {
		this.serialNumber = serialNumber;
		System.out.println("inside constructor with parenthesis");
	}
	
	public static void main(String[] args) {
		SomeClass sc = new SomeClass();
		// this gives us an id / address : System.out.println(sc);
	}
	
	
}
