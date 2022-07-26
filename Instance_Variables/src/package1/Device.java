package package1;

public class Device {

	public static void main(String[] args) {
		Battery b1 = new Battery();
		Battery b2 = new Battery();
		
		System.out.println(b1.maxHours);
		System.out.println(b2.maxHours);
		
		b1.maxHours = 6;
		b2.maxHours = 7;
		
		System.out.println(b1.maxHours);
		System.out.println(b2.maxHours);
	}
}
