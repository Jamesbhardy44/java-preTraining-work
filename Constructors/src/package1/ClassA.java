package package1;

public class ClassA {
	int id;
	
	public ClassA() { // constructor
		System.out.println("Inside the Constructor.");
		id = 1;
	}
	
	public ClassA(int inputId) {
		System.out.println("Inside the Constructor " + id);
		id = inputId;
	}
	
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println("After instantiation " + a.id);
		
		ClassA a2 = new ClassA(9000);
		System.out.println("After instantiation " + a2.id);
	}

}
