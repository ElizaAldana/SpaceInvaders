package model;

import processing.core.PApplet;

public class Nave implements Runnable{

	//La nave tiene dirección solo en x, y posición
	private int posX, posY, dirX;
	private PApplet app;
	
	public Nave(PApplet app) {
		this.posX = 600/2;
		this.posY = 550;
		this.dirX = 0;
		this.app = app;
	}
	
	public void draw() {
		this.app.fill(127,255,212);
		this.app.triangle(posX-10, posY, posX, posY-30, posX+10, posY);
	}
	
	
	public void moveR() {
		this.posX += posX+dirX*4; 
	}
	public void moveL() {
		this.posX += posX+dirX*-4; 
	}
	
	public void run() {
		moveL();
		moveR();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
