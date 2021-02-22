package com.llavore.presentation;

public class Main {

	private static boolean closeProgram;
	private static IScreen currentlyScreen;

	static {
		closeProgram = false;
		currentlyScreen = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		currentlyScreen = new MainScreen();
		while (!closeProgram) {
			currentlyScreen.show();
		}

	}

	public static void close() {
		closeProgram = true;

	}

	public static void changeScreen(IScreen screen) {
		currentlyScreen = screen;
	}

}
