package packageOne;

public class Trumpet extends Instrument {
	
	@Override
	public void makeSound() {
		System.out.println("Brummm brumm");
	}
	
	public static void main(String[] args) {
		Trumpet trumpet = new Trumpet();
		trumpet.makeSound();
	}

}
