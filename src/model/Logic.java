package model;

import processing.core.PApplet;

public class Logic {

	public PApplet app;
	
	Nave nave;
	
	public Logic(PApplet app) {
		this.app=app;
		nave = new Nave(app);
	}
}
