package view;

import controller.Control;
import processing.core.PApplet;

public class Pantallas {

	PApplet app;
	Control controller;
	
	
	public Pantallas(PApplet app) {
		this.app = app;
		this.controller = new Control(app);
	}
}
