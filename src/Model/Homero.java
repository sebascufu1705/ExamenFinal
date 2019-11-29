package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Homero extends Thread{

	private PApplet app;
	private PImage img;
	private int posX;
	private int posY;
	public Homero(PApplet app, int tipo, PImage img, int posX, int posY) {
		this.app = app;
		this.img=img;
		this.posX=posX;
		this.posY=posY;
		this.vel = vel;
	
	}
	public void run() {
		while(true) {
			mover();
			try {
				sleep(16);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void pintar() {
		app.image(img, posX, posY);
	}
	public void mover() {
		
	}
	

	
	

}
