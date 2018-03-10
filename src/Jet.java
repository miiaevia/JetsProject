
public abstract class Jet {

	private String model; 
	private double speed; 
	private int range; 
	private long price;
	private double mach; 
	
	public Jet() {
	}

	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	 public double getSpeedMach(int mph) {
		    // mach = miles per hour × 0.001303
		    this.mach = mph * 0.001303;
		    return mach;
		  }

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	public double getTime() {
		return (getRange() / getSpeed());
	}
	
	@Override
	public String toString() {
		return "\tModel: " + getModel() + "\n\tSpeed:" + getSpeed() + "\n\tRange: " + getRange()
				+ "\n\tPrice:  " + getPrice() + "\n";
	}

	public String fly() {
		return "Model: " + getModel() + "\n Speed:" + getSpeed() + "\nRange: " + getRange()
		+ "\n Price:  " + getPrice() + "\nTime: " + getTime() + "\n";
	}

}
