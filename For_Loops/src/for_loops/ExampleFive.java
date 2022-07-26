package for_loops;

public class ExampleFive {

	public static void main(String[] args) {
		String[] firstNames = {"Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Memphis",
				"Nicky", "Sarah", "William"};
		String[] lastNames = {"Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson",
				"Perez", "Snow", "Tran"};
		
		//name generator:
		
		//loop through firstNames
		for(int i = 0; i < firstNames.length; i++) {
			
			//get current first name
			String currentFirstName = firstNames[i];
			
			//loop through lastNames 
			for(int j = 0; j < lastNames.length; j++) {
				
				String currentLastName = lastNames[j];
				
				//print result
				System.out.println(currentFirstName+" "+currentLastName);
			}
		}
	}
}
