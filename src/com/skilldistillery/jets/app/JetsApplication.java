package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {

	AirField af = new AirField();
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();

		ja.launch();
	}

	private void launch() {

		boolean menu = true;
		while (menu) {

			af.displayMenu();

			System.out.println("\nPlease pick a number from the list.");
			String userNumber = sc.nextLine();
			int menuChoice = 0;
			
			
			{	
			menuChoice = af.fitlerUserNumber(userNumber, menuChoice);
			}
			
			
			switch (menuChoice) {

			case 1:

				af.listFleet();
				break;

			case 2:
				af.flyJets();
				break;

			case 3:
				af.viewFastestJet();
				break;

			case 4:
				af.viewLongestRange();
				break;

			case 5:
				af.loadAllCargoJets();
				break;

			case 6:
				af.dogfight();
				break;

			case 7:
				af.addJet();
				break;

			case 8:
				af.removeJet();
				break;

			case 9:
				System.out.println("Thanks for playing");
				menu = false;
				break;

			default:
				System.out.println("That choice is invalid.");
			}
		}
	}

	
}