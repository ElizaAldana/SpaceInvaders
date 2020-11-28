package controller;

import model.Logic;
import processing.core.PApplet;

public class Control {
	
	PApplet app;
	Logic logic;
	
	public Control(PApplet app) {
		this.app = app;
		this.logic = new Logic(app);
	}
	
	public void Eject() {
		this.logic.Eject();
	}
	
	public void mouseClicked() {
		this.logic.mouseClicked();
	}
	
	public void keyPressed() {
		this.logic.keyPressed();
	}
	
}
