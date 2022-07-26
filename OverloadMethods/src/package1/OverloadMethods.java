package package1;

public class OverloadMethods {

	public static void main(String[] args) {
		OverloadMethods om = new OverloadMethods();
		
		om.print();
		
		om.print("second print method");
		
		om.print("second", "third");
	}
	
	public void print() {
		System.out.println("Original Print Method");
	}
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public void print(String str, String str2) {
		System.out.println(str+" " + str2);
	}
	
	
}
