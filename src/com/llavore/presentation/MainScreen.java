package com.llavore.presentation;

public class MainScreen implements IScreen {

	public MainScreen() {
	}

	@Override
	public void show() {
		System.out.println("this is a screen1.");
		change(new Screen2());
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
