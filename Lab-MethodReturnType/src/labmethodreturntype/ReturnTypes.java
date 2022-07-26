package labmethodreturntype;

public class ReturnTypes {

	public static void main(String[] args) {
		
		// create class instance
		ReturnTypes rt = new ReturnTypes();
		
		// call method
		rt.returnNothing();
		
		// call method2
		boolean b = rt.returnBoolean();
		System.out.println("The value of b is: " + b);
		
		//call method3 PI
		double pi = rt.getPi();
		System.out.println("Pi:"+ pi);
		
		//call method4 
		char[] c = rt.getAlphabetArray();
		System.out.println(c);
		
		//call method 5 JH
		char[] cc = rt.swapFirstLastAlphabetArray();
		System.out.println(cc);
		
	}
	
	//create method
	public void returnNothing() {
		System.out.println("inside of a void method");
	}
	
	//method2
	public boolean returnBoolean() {
		return true;
	}
	
	//method3 PI
	public double getPi() {
		double d = Math.PI;
		return d;
	}
	
	
	//method4
	public char[] getAlphabetArray() {
		char[] abc_list = 
			{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'
					, 'v', 'w', 'x', 'y', 'z'};
		return abc_list;
	}
	
	//method5 -- JH
	public char[] swapFirstLastAlphabetArray() {
		
	char[] abc_list_master = 
		{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'
				, 'v', 'w', 'x', 'y', 'z'};
	
	char[] abc_list_dummy = 
		{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'
				, 'v', 'w', 'x', 'y', 'z'};
	
	
	abc_list_dummy[0] = abc_list_master[25];
	abc_list_dummy[25] = abc_list_master[0];
	
	return abc_list_dummy;
	}
	
	
	
	
	
	
}
