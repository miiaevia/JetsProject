
public class CargoPlane extends Jet {

	public CargoPlane() {
	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	public void loadCargo() {
		System.out.println("I am loading cargo.");
	}

	
}
