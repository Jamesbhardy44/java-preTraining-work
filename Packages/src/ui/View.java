package ui;

public class View {

	String message = "Hello from View Class!";
	
	public static void main(String[] args) {
		
		View v = new View();
		v.talk();
		
	}
	
	public String talk() {
		System.out.println(message);
		return this.message;
	}
}
