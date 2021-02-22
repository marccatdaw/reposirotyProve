package com.llavore.presentation;

public interface IScreen {

	void show();

	void close();

	void change(IScreen screen);
}
