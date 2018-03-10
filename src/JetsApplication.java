import java.util.Scanner;

public class JetsApplication {
	static int selection;
	
	static Scanner kb = new Scanner(System.in);
	
	public JetsApplication() {
	}

	public static void main(String[] args) {
		AirField airfield = new AirField();
		Jet[] jets = airfield.getJets(); 
//		launch(); 
		displayUserMenu();
		if (selection == 1) {
			for (int i = 0; i < airfield.getLength(); i++) {
				Jet jet = jets[i];
				System.out.println(jet.toString());
			}
		}
		else if (selection == 2) {
			for (int i = 0; i < airfield.getLength(); i++) {
				Jet jet = jets[i];
				System.out.println(jet.fly());
			}
		}
		else if (selection == 3) {
//			double maxSpeed = 0;
			String fastestJet = "";
			for (int i = 0; i < airfield.getLength(); i++) {
				double speed = jets[0].getSpeed();
				String fastestJet1 = jets[0].toString();
				Jet jet = jets[i];
				
				if (jet.getSpeed() > speed) {
					speed = jet.getSpeed();	
					fastestJet1 = jet.toString();
				}
				
//				maxSpeed = speed;
				fastestJet = fastestJet1;
			}
			System.out.println("Fastest Jet is: \n" + fastestJet.toString());
		}
		else if (selection == 4) {
//			double maxSpeed = 0;
			String longestRange = "";
			for (int i = 0; i < airfield.getLength(); i++) {
				long range = jets[0].getRange();
				String longestRangeJet1 = jets[0].toString();
				Jet jet = jets[i];
				
				if (jet.getRange() > range) {
					range = jet.getRange();	
					longestRangeJet1 = jet.toString();
				}
				
//				maxSpeed = speed;
				longestRange = longestRangeJet1;
			}
			System.out.println("Fastest Jet is: \n" + longestRange.toString());
		}
	}
	
//	private static void launch() {
//		
//	}
	
	private static void displayUserMenu() {
		System.out.println("Choose of the following options: ");
		System.out.println("\t1. List fleet");
		System.out.println("\t2. Fly all jets");
		System.out.println("\t3. View fastest jet");
		System.out.println("\t4. View jet with longest range");
		System.out.println("\t5. Add a jet to a Fleet");
		System.out.println("\t6. Quit");
		selection = kb.nextInt(); 
	}
	
}
