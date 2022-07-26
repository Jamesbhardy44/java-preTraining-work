package packageOne;

public class ExampleOne {
	
	public static int staticVar = 0;
	public int instanceVar = 0;
	
	public ExampleOne() {
		this.instanceVar++;
		staticVar++;
	}

	public static void main(String[] args) {
		ExampleOne.wakeUp();
		
		ExampleOne thingA = new ExampleOne();
		ExampleOne thingB = new ExampleOne();
		
		System.out.println(thingA.instanceVar); // object.variable
		System.out.println(thingB.instanceVar); //
		
		System.out.println(ExampleOne.staticVar); // class.variable
		// use class name when invoking static variables
	}
	
	public static void wakeUp() {
		System.out.println("Wake Up");
	}
}
