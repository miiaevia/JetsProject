import java.util.Scanner;

public class JetsApplication {
	
	private AirField airfield = new AirField();
	Scanner kb = new Scanner(System.in);
	
	public JetsApplication() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private void launch() {
		
	}
	
	private void displayUserMenu() {
		System.out.println("Choose of the following options: ");
		System.out.println("\t1. List fleet");
		System.out.println("\t2. Fly all jets");
		System.out.println("\t3. View fastest jet");
		System.out.println("\t4. View jet with longest range");
		System.out.println("\t5. Add a jet to a Fleet");
		System.out.println("\t6. Quit");
	}

}
