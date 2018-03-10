import java.util.Scanner;

public class JetsApplication {
	static int selection;

	static Scanner kb = new Scanner(System.in);
	static AirField airfield = new AirField();
	static Jet[] jets = airfield.getJets();

	public JetsApplication() {
	}

	public static void main(String[] args) {
		run(); 
	}
	
	public static void run() {
		displayUserMenu();
		if (selection != 6) {
		launch();		
		}
	}

	private static void launch() {
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
				// double maxSpeed = 0;
				String fastestJet = "";
				for (int i = 0; i < airfield.getLength(); i++) {
					double speed = jets[0].getSpeed();
					String fastestJet1 = jets[0].toString();
					Jet jet = jets[i];

					if (jet.getSpeed() > speed) {
						speed = jet.getSpeed();
						fastestJet1 = jet.toString();
					}

					// maxSpeed = speed;
					fastestJet = fastestJet1;
				}
				System.out.println("Fastest Jet is: \n" + fastestJet.toString());
			}
			else if (selection == 4) {
				// double maxSpeed = 0;
				String longestRange = "";
				for (int i = 0; i < airfield.getLength(); i++) {
					long range = jets[0].getRange();
					String longestRangeJet1 = jets[0].toString();
					Jet jet = jets[i];

					if (jet.getRange() > range) {
						range = jet.getRange();
						longestRangeJet1 = jet.toString();
					}

					// maxSpeed = speed;
					longestRange = longestRangeJet1;
				}
				System.out.println("Longest Range Jet is: \n" + longestRange.toString());
			}
			else if (selection == 5) {
				Jet[] newAirfield = airfield.getJets();
				for (int i = 0; i < airfield.getLength() + (i + 1); i++) {
					Jet jet = newAirfield[i];
					if (jet == null) {
						System.out.println("Do you want to add a new plane? ");
						System.out.println("Press 1 for yes or 2 for no: ");
						int newPlaneChoice = kb.nextInt();
						if (newPlaneChoice == 1) {
							System.out.println("Enter a model: ");
							String model = kb.next();
							System.out.println("Enter a speed: ");
							double speed = kb.nextDouble();
							System.out.print("Enter a range (distance in miles): ");
							int range = kb.nextInt();
							System.out.print("Enter a price: ");
							long price = kb.nextLong();
							JetImpl newJet = new JetImpl(model, speed, range, price);
							newAirfield[i] = newJet;
							System.out.println("Your new jet is: \n" + newAirfield[i]);
						}
						else {
							break;
						}
					}
				}
			}
			else {
				System.out.println("That is not a valid option. Please try again.");
			}
			run();
		}


	private static int displayUserMenu() {
		System.out.println("Choose of the following options: ");
		System.out.println("\t1. List fleet");
		System.out.println("\t2. Fly all jets");
		System.out.println("\t3. View fastest jet");
		System.out.println("\t4. View jet with longest range");
		System.out.println("\t5. Add a jet to a Fleet");
		System.out.println("\t6. Quit");
		selection = kb.nextInt();
		return selection; 
	}

}
