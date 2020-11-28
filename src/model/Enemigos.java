package model;

import processing.core.PApplet;

public class Enemigos {

	private int posX, posY, dirX, tam;
	private PApplet app;
	
	public Enemigos(PApplet app, int posX, int posY, int dirX, int dirY) {
		this.posX = posX;
		this.posY = posY;
		this.dirX = dirX;
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
}
