package for_loops;

public class ExampleThree {

	
		  public static void main(String[] args){
		    String[] cities = {"Atlanta", "Charlotte", "Dallas", "Los Angeles", "New York", "Orlando", "Philadelphia", "Seattle"};

		    /*reverse the order of the array below */

		   
		    for (int i = 0; i < cities.length/2; i++){
		    	//store temp value:
		      String city = cities[i];
		      
		        //swap elements front to back:
		      cities[i] = cities[cities.length-1 - i];
		      cities[cities.length-1-i] = city;
		      
		    }  
		     
		    for (int i = 0; i < cities.length; i++) {
		      System.out.println(cities[i]);
		    }
		  }
		
}
