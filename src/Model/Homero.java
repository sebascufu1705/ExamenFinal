package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Homero extends Thread{

	private PApplet app;
	private PImage img;
	private int posX;
	private int posY;
	private int vel;
	public Homero(PApplet app, int tipo, PImage img, int posX, int posY) {
		this.app = app;
		this.vel = 10;
		this.img=img;
		this.posX=posX;
		this.posY=posY;
		
	
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
	
	public void mover() {
		
	}
	public void pintar() {
		
		app.image(img, posX++, posY,100,100);
		
		
		
		
		

		
	}
	
}
