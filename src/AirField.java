
public class AirField {

	private Jet[] jets = new Jet[100];

	CargoPlane cargo1 = new CargoPlane("747", 300.00, 3000, 34_000_000);
	CargoPlane cargo2 = new CargoPlane("Guppy", 150.00, 1000, 50_000_000);
	FighterJet fighter1 = new FighterJet("Zepplin", 80.00, 250, 25_000_000);
	FighterJet fighter2 = new FighterJet("Albatros", 250.00, 1500, 60_000_000);
	JetImpl jet1 = new JetImpl("Basic Jet", 100.00, 1000, 45_000_000);

	public AirField() {
	}

	public Jet[] getJets() {
		jets[0] = cargo1;
		jets[1] = cargo2;
		jets[2] = fighter1;
		jets[3] = fighter2;
		jets[4] = jet1;

		return jets;
	}

	public void setJets(Jet[] jets) {
		this.jets = jets;
	}
	
	public int getLength() {
		int count = 0;
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				count ++;
			}
		}
		return count; 
	}

}
