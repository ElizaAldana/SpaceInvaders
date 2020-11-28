package model;

import processing.core.PApplet;

public class Nave {

	//La nave tiene dirección y posición
	private int posX, posY, dirX;
	private PApplet app;
	
	public Nave(PApplet app) {
		this.posX = 600/2;
		this.posY = 350;
		this.dirX = 0;
		this.app = app;
	}
	
	public void drawN() {
		this.app.fill(127,255,212);
		this.app.triangle(posX, posY, posX, posY, 60, 60);
	}
	
	public void mover() {
		
	}
	
	
	
	//Getters & setters
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

	public int getDirX() {
		return dirX;
	}

	public void setDirX(int dirX) {
		this.dirX = dirX;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	
}
