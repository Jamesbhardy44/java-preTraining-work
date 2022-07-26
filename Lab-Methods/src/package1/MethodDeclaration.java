package package1;

public class MethodDeclaration {

	public static void main(String[] args) {
		//create a class instance
		MethodDeclaration md = new MethodDeclaration();
		
		//call first method 
		md.talk();
		
		//call second method
		int value = 150;
		int sameValue = md.getInt(value);
		System.out.println(sameValue);
		
		//call third method
		int num = md.rand();
		System.out.println(md.sum(1,2,4.5));
		
		//call fourth method 
		System.out.println(md.rand());
	}
	
	//create methods:
	
	public void talk() {
		System.out.println("inside the talk method");
	}
	
	public int getInt(int input) {
		return input;
	}
	
	public double sum(int x, int y, double z) {
		return x + y + z;
	}
	
	public int rand() {
		int d = (int) (Math.random() * 50) + 1;
		return d;
	}
	
	
	
	
}
	

