package com.llavore.presentation;

public class MainScreen implements IScreen {

	public MainScreen() {
	}

	@Override
	public void show() {
		System.out.println("Welcom to Student System");
		System.out.println("You can add diferents Students.");
		System.out.println();
		change(new MenuScreen());
	}

	@Override
	public void close() {
		Main.close();
	}

	@Override
	public void change(IScreen screen) {
		if (screen != null) {
			Main.changeScreen(screen);
		}
	}

}
