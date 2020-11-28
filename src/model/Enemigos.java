package model;

import processing.core.PApplet;

public class Enemigos {

	private int posX, posY, dirX, dirY, tam;
	private PApplet app;
	
	public Enemigos() {
		this.posX = posX;
		this.posY = posY;
		this.dirX = dirX;
		this.dirY = dirY;
		this.tam = 10;
		this.app = app;
	}
	
	public void drawE() {
		this.app.fill(57,255,20);
		this.app.rect(posX, posY, tam, tam);
	}
	
	public void mover() {
		
	}
}
