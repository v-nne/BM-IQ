package console;

import GUI.MainMenuGUI;
import java.util.Scanner;
public class MainMenu{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("==========================     Welcome to BM-IQ    ==========================");
		System.out.println("                          Please input your name");
		String username = sc.next();

		while (true) {
			System.out.println("\033[H\033[2J");
			System.out.flush();

			System.out.println("Welcome " + username);
			loadingBar();

			System.out.println("What do you wish to do today");
			System.out.println("-------------------------------------------------------------------------------------------------------");
			System.out.println("1. BMI Calculator");
			System.out.println("2. Ideal Weight");
			System.out.println("3. Water Intake");
			System.out.println("4. Open Graphical User Interface");
			System.out.println("5. Exit");
			System.out.println("-------------------------------------------------------------------------------------------------------");

			int choice1 = sc.nextInt();

			switch (choice1){
				case 1:
					BmiCalculator.run(sc, username);
					break;
				case 2:
					IdealWeightCalculator.run(sc, username);
					break;
				case 3:
					WaterIntakeCalculator.run(sc, username);
					break;
				case 4:
                                        MainMenuGUI.run(sc, username);
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("invalid choice...try again");
			}
		}
	}
	public static void loadingBar(){
		System.out.println("Loading");
		for (int i = 0; i < 10; i++){
			System.out.print("...");
			try{
				Thread.sleep(500);
			}
			catch (InterruptedException e){
				e.printStackTrace(); }
		} System.out.println("");
		System.out.println("Done");
	}
}