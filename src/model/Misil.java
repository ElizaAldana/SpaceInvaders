package model;

import processing.core.PApplet;

public class Misil {

	private int posX, posY, radio;
	private PApplet app;
	private boolean borrar;
	
	public Misil(PApplet app, int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		this.radio = 8;
		this.app = app;
		this.borrar = false;
	}
	
	public void draw() {
		this.app.fill(255,0,0);
		this.app.ellipse(this.posX, this.posY, this.radio*2, this.radio*2);

	}
	
	public void disparo() {
		this.posY = posY -5;
	}

	
	public boolean isborrar() {
		return borrar;
	}

	public void setborrar(boolean borrar) {
		this.borrar = borrar;
	}
	
	//Getters & Setters
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	
}
