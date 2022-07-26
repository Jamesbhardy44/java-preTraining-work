package nested_statements;

public class WaterSystem {

	public static void main(String[] args) {
		int precipitation = 19;
		int waterOutput = 0;
		int temperature = 75;
		
		if (precipitation < 20) {
			
			if(temperature <= 75) {
				
			waterOutput = 30;
			
			}
		}	
	
		else {
			waterOutput = 45;
		}
		System.out.println("The water output should be " + waterOutput);
	}
}
