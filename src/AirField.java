
public class AirField {

	private Jet[] jets = new Jet[10];
	
	CargoPlane cargo1 = new CargoPlane("747", 300.00, 3000, 34_000_000);
	CargoPlane cargo2 = new CargoPlane("Guppy", 150.00, 1000, 50_000_000);
	FighterJet fighter1 = new FighterJet("Zepplin", 80.00, 250, 25_000_000);
	FighterJet fighter2 = new FighterJet("Albatros", 250.00, 1500, 60_000_000);
	JetImpl jet1 = new JetImpl("Basic Jet", 100.00, 1000, 45_000_000);
	
	public AirField() {
	}

	public Jet[] getJets() {
		return jets;
	}

	public void setJets(Jet[] jets) {
		this.jets = jets;
	}

}
