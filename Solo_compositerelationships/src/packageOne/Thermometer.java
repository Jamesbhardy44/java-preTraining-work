package packageOne;
import java.math.*;
public class Thermometer {



	// should have one public method getTemperature()
	//returns random value between 0 and 108 degrees F
	
	public double getTemperature() {
		
		double value = Math.round((Math.random()/.1000)*10);
		
		return value;
	}
	
}
