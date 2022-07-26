package package1;

public class ClassB {
	
    classA classA = new classA();

public static void main(String[] args) {
	ClassB b = new ClassB();
	b.classA.setName("Ellie");
	System.out.println(b.classA.getName());
	}

}
