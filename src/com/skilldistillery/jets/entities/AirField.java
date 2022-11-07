package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AirField {
	Scanner sc = new Scanner(System.in);
	private ArrayList<Jet> airField = new ArrayList<>();

	String fileName = "jets.txt";

	public AirField() {
		populateAirField(fileName);
	}

	public ArrayList<Jet> populateAirField(String fileName) {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;

			while ((line = bufIn.readLine()) != null) {

				String arr[] = line.split(",");
				// capture the info, split between commas, and store into variables that match
				// the objects fields
				String planeType = arr[0];
				String shipName = arr[1];
				String shipModel = arr[2];
				long shipPrice = Long.parseLong(arr[3]);
				double shipSpeed = Double.parseDouble(arr[4]);
				int shipRange = Integer.parseInt(arr[5]);
				// create a jet( carrier, or fighter, or spaceship)
				if (planeType.equals("SpaceFleet")) {
					SpaceFleet sf = new SpaceFleet(shipName, shipModel, shipPrice, shipSpeed, shipRange);
					airField.add(sf);
				} else if (planeType.equals("CombatFighter")) {
					CombatFighter cf = new CombatFighter(shipName, shipModel, shipPrice, shipSpeed, shipRange);
					airField.add(cf);

				} else if (planeType.equals("CargoCarrier")) {
					CargoCarrier cc = new CargoCarrier(shipName, shipModel, shipPrice, shipSpeed, shipRange);
					airField.add(cc);
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}

		return airField;
	}

	public void listFleet() {
		for (Jet jet : airField) {
			System.out.println(jet);
		}

		// TODO Auto-generated method stub
//		System.out.println(Arrays.asList(airField.toString()));
	}

	public void flyJets() {
		for(Jet jet : airField) {
			System.out.println(jet.fly());
		}
	}
	public void viewFastestJet() {
		
	
		double fastestJet = 0.0;
		int counter = 0;
		for (int i = 0; i < airField.size(); i++) {
			if (airField.get(i).getSpeed() > fastestJet) {
				fastestJet = airField.get(i).getSpeed();
				counter = i;
				
				
			}
		}
		System.out.println("Fastest Jet " + airField.get(counter));
		System.out.println("\n");
	}

	public void viewLongestRange() {
		int counter = 0;
		double longestRange = 0.0;
		for (int i = 0; i < airField.size(); i++) {
			if (airField.get(i).getSpeed() > longestRange) {
				longestRange = airField.get(i).getSpeed();
				counter = i;
			}
		}
				System.out.println("Jet with longest range " + airField.get(counter));
				System.out.println("\n");
}
	public void loadAllCargoJets() {
		// TODO Auto-generated method stub
		 for (Jet jet : airField) {
			 if (jet instanceof CargoCarrier) {
				 ((CargoCarrier) jet).callToInterfaceCC();
			 }
		 }			
	}

	public void dogfight() {
		for (Jet jet : airField) {
			 if (jet instanceof CombatFighter) {
				 ((CombatFighter) jet).callToInterfaceCR();
			 }
		}
	}
	public void addJet() {
		
		System.out.println("Please enter the make.");
		String make = sc.next();
		System.out.println("Please enter model.");
		String model = sc.next();
		System.out.println("Please enter price of jet.");
		long price = sc.nextLong();
		System.out.println("Please enter jet speed.");
		double speed = sc.nextDouble();
		System.out.println("Please enter flight range");
		int range = sc.nextInt();
		
		CombatFighter combatFighter = new CombatFighter(make, model, price, speed, range);
		airField.add(combatFighter);
		System.out.println("Congrats you added a new aircraft!");
	}

	public void removeJet() {
		
		int counter = 1;
		for(Jet jet : airField) {
			System.out.println(counter + ": " + jet.getName());
			counter++;
			
		System.out.println("Please enter the number of the aircraft you wish to remove.");
		int num = sc.nextInt();
		
		airField.remove(num -1);	
		System.out.println("Success! You removed an aircraft!");	
			
		}	
	}
	public void displayMenu() {
		System.out.println("*************MENU**************\n");
		System.out.println("1. List Fleet");
		System.out.println("2. Fly All Jets");
		System.out.println("3. View Fastest Jet");
		System.out.println("4. View Jet With Longest Range");
		System.out.println("5. Load All Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add A Jet To Fleet");
		System.out.println("8. Remove A Jet From Fleet");
		System.out.println("9. Quit");
}
	
	
	public int fitlerUserNumber(String userNumber, int menuChoice) {
		if (userNumber.equals("1") || userNumber.equalsIgnoreCase("one")) {
			menuChoice = 1;
		} else if (userNumber.equals("2") || userNumber.equalsIgnoreCase("two")) {
			menuChoice = 2;
		} else if (userNumber.equals("3") || userNumber.equalsIgnoreCase("three")) {
			menuChoice = 3;
		} else if (userNumber.equals("4") || userNumber.equalsIgnoreCase("four")) {
			menuChoice = 4;
		} else if (userNumber.equals("5") || userNumber.equalsIgnoreCase("five")) {
			menuChoice = 5;
		} else if (userNumber.equals("6") || userNumber.equalsIgnoreCase("six")) {
			menuChoice = 6;
		} else if (userNumber.equals("7") || userNumber.equalsIgnoreCase("seven")) {
			menuChoice = 7;
		} else if (userNumber.equals("8") || userNumber.equalsIgnoreCase("eight")) {
			menuChoice = 8;
		} else if (userNumber.equals("9") || userNumber.equalsIgnoreCase("nine")) {
			menuChoice = 9;
		}
		return menuChoice;
	}
	
	
}