package com.skilldistillery.jets.app;
import com.skilldistillery.jets.entities.AirField;
public class JetsApplication {

	AirField af = new AirField();
	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.launch();
	}

	private void launch() {
		af.mainMenu();
	}
}