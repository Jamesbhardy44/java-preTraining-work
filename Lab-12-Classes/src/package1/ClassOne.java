package package1;

public class ClassOne {
	
	int id; // variable exists
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;  
	}
	
	//now that we have setup the getters and setters,
	//we call what we want in the main:
	public static void main(String[] args) {
		ClassOne c1 = new ClassOne(); // instantiate 
		int v = 25; //setter value 
		
		c1.setId(v); // call method 
		
		System.out.println(c1.getId());
	}
}
