package packageOne;

import package1.Person;
import packageTwo.ProtectedSubClass;

public class AccessModifiers {

	public static void main(String[] args) {
		
		Person adam = new Person();
		adam.age = 15;
		
		System.out.println(adam.age);
		
		ProtectedSubClass psc = new ProtectedSubClass();
		psc.printID();
		
	}
}
