package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {

	public PApplet app;
	int s;
	Nave nave;
	boolean edge;
	boolean regresarse;
	private ArrayList<Misil>balitas;
	private ArrayList<Enemigos>listaEne;
	int listaEneTam;
	
	public Logic(PApplet app) {
		this.app=app;
			this.s=0;
		nave = new Nave(app);
		listaEne = new ArrayList<Enemigos>();
		listaEneTam = 12;
		for(int i=0;i<listaEneTam;i++){
			listaEne.add(new Enemigos(app, 20+(i*100), 50));
		}
			balitas = new ArrayList<Misil>();
				balitas.add(new Misil(app,0,0));
	}
	

public void Eject() {
	
	switch (s) {
	case 0:
		app.background(0);
		app.fill(0,0,255);
		app.textSize(30);
		app.text("SpaceInvaders",200,100);
		app.textSize(40);
		if(app.mouseX > app.width/2-40 && app.mouseX <= app.width/2+45 && app.mouseY > app.height-250 && app.mouseY <= app.height-200) {
			
		}
		app.fill(255);
		app.text("Start",app.width/2-40, app.height-200);
		app.fill(255);
		if(app.mouseX > app.width/2-40 && app.mouseX <= app.width/2+40 && app.mouseY > app.height-150 && app.mouseY <= app.height-100) {
			
		}
		app.text("Exit",app.width/2-40,app.height-100);
		
		break;
	case 1:
		app.background(0);
		nave.draw();
		edge=false;
		regresarse=false;
		for (int i = 0; i < listaEne.size(); i++) {
			listaEne.get(i).draw();
			listaEne.get(i).mover();
			if(listaEne.get(i).getPosX() > app.width || listaEne.get(i).getPosX() < 0) {
				edge = true;
			}
			if(listaEne.get(i).getPosY() > app.height) {
				regresarse = true;
			}
		}
		if(edge) {
			for (int i = 0; i < listaEne.size(); i++) {
				listaEne.get(i).cambioDir();
			}
		}
		if(regresarse) {
			s = 2;//validar perder
			app.text("perdiste", 100, 100);
		}
	}
}
		
		
	public void mouseClicked() {
		switch(s) {
		case 0:
			if(app.mouseX > app.width/2-30 && app.mouseX <= app.width/2+45 && app.mouseY > app.height-250 && app.mouseY <= app.height-200) {
				s = 1;
			}
			if(app.mouseX > app.width/2-30 && app.mouseX <= app.width/2+30 && app.mouseY > app.height-150 && app.mouseY <= app.height-100) {
				app.exit();
			}
			break;
		case 1:
			break;
			
		}
	}
	
	public void keyPressed() {
		switch(s) {
		case 1:
			if(app.key == 'A' || app.key == 'a' ) {
				nave.moveL();
			}
			if(app.key == 'D' || app.key == 'd' ) {
				nave.moveR();
			}
			break;
			
		}
	}

	
}

