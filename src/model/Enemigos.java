package model;

import processing.core.PApplet;

public class Enemigos {

	private int posX, posY, dirX, tam;
	private PApplet app;
	
	public Enemigos(PApplet app, int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		this.dirX = 10;
		this.tam = 10;
		this.app = app;
	}
	
	public void cambioDir() {
		this.dirX *= -1;
		this.posY += this.tam;
	}
	
	public void draw() {
		this.app.fill(57,255,20);
		this.app.rect(posX, posY, tam, tam);
	}
	
	public void mover() {
		this.posX = this.posX + this.dirX;
	}

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

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	
}
