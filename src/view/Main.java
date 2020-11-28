package view;

import controller.Control;
import processing.core.PApplet;

public class Main extends PApplet{
	
	Pantallas s;
	Control control;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	}
	
	public void settings() {
		size(600,600);
	}
	
	public void setup() {
		s = new Pantallas(this);
		this.control = new Control(this);
	}
	
	public void draw() {
		background(0);
		this.control.Eject();
	}
	
	public void mouseClicked() {
		this.control.mouseClicked();
	}
	
	public void keyPressed() {
		this.control.keyPressed();
	}

}
