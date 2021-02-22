package com.llavore.presentation;

public class Screen2 implements IScreen {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("this is a screen2.");
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
