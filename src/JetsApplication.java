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
			for (int i = 0; i < jets.length; i++) {
				Jet jet = jets[i];
				jet.toString();
			}
		}
		else if (selection == 2) {
			for (int i = 0; i < jets.length; i++) {
				Jet jet = jets[i];
				jet.fly();
			}
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
