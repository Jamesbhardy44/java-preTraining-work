package labmethodparameters;

public class MethodParams {

	public static void main(String[] args) {
		//new class instance
		MethodParams mp = new MethodParams();
		
		// call method
		double int_conversion = mp.convertIntToDouble(44);
		System.out.println(int_conversion);
		
		//call method2 double is a valid argument to println() method:
			//notice we did not store this one in a variable:
		System.out.println(mp.sum(1.0, 2, 3));
		//=======================================================================
		// call method 3 square
		float [] f = mp.square(2, 4, 6, 8);
		//==================================================================
		
		String s = mp.findFirstWord("zzz", "aaa");
		System.out.println(s);
	}
	
		//create first method
		public double convertIntToDouble(int num) {
			return (double)num;
		}
		
		//create second method
		public double sum(double num1, int num2, int num3) {
			return num1 + num2 + num3;
		}
		
		//create third method JH
		public float[] square(int p_num1, int p_num2, int p_num3, int p_num4) {
			int v_int1 = (p_num1 * p_num1);
			int v_int2 = (p_num2 * p_num2);
			int v_int3 = (p_num3 * p_num3);
			int v_int4 = (p_num4 * p_num4);
			
			float f_list [] = {v_int1, v_int2, v_int3, v_int4};
			System.out.println(p_num1 + " squared = " +  f_list[0]);
			System.out.println(p_num2 + " squared = " + f_list[1]);
			System.out.println(p_num3 + " squared = " + f_list[2]);
			System.out.println(p_num4 + " squared = " + f_list[3]);
			return f_list;
		}
		
		public String findFirstWord(String p_string1, String p_string2) {
			//convert strings to arrays for iterating:
			char[] p_string1Array = p_string1.toCharArray(); 
			char[] p_string2Array = p_string2.toCharArray();
			
			//iterate through each array
			
			for (int i = 0; i < p_string1.length(); i++){
				if (p_string1Array[i] < p_string2Array[i]) {
					return p_string1;
				}
				
				if (p_string1Array[i] > p_string2Array[i]) {
					return p_string2;
				}
			}
			
			
			return p_string1;
			
	}
}

