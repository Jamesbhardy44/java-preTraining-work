package packageOne;

public class WeatherMachine {
	
	String city;
	
	public WeatherMachine() {
		
	}
	
	public WeatherMachine(String city) {
		this.city = city;  // this keyword creates the attribute on all new instances
	}

	
	
	private double[] getPastTemperatures() {
		Thermometer t = new Thermometer();
		
		double temp_array[] = new double[24];
		int i = 0;
		double time = 00.00;
		
		System.out.println("YOUR LAST 24 HOURS:");
		System.out.println("==============================");
		
		while(i < 24 && time < 24.00) {
		double temps =	t.getTemperature();
		temp_array[i] = temps;
		System.out.println(time + "-" + temps + "  degrees |");
			i++;
			time++;
			if (temp_array.length >24) {
				return temp_array;
			}
		}
		return temp_array;
	}
	
	
	//should also create a public method in WeatherMachine called getWeatherReport
	//that prints the list of 24 temperatures 
	
	public void getWeatherReport() {
		//object
		Thermometer t = new Thermometer();
		
		//object
		WeatherMachine wm = new WeatherMachine();
		
		//object
		WeatherMachine obj2 = new WeatherMachine();
		
		obj2.city = "Edinburgh";
		wm.city = "London";
		
		double temp = t.getTemperature();
		
		System.out.println("WEATHER REPORT:");
		System.out.println("Your temperature in "+ obj2.city  + ": " + temp + "  F");
		System.out.println("Your temperature in "+ wm.city + ": " + temp + "  F");
	}
	
	
	public static void main(String[] args) {
		
		
		Thermometer t = new Thermometer();
		WeatherMachine wm = new WeatherMachine();
		
		WeatherMachine obj1 = new WeatherMachine();
		
		
		double[] temperatures = wm.getPastTemperatures();
		System.out.println(temperatures);
		
		
		
	}

	
}
