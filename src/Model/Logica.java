package Model;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logica {
	private PApplet app;
	protected String[] datos;
	protected PImage imgHomero, imgBart, imgLisa;
	protected ArrayList<Homero> homerito;
	protected int[] Array; 
	protected boolean act1;

	public Logica(PApplet app) {
		this.app = app;
		Array = new int[3];
		//activador
		act1 = false;
		// cargar texto

		datos = app.loadStrings("../data/archivo.txt");
		// inicializar los arreglos
		homerito = new ArrayList<Homero>();
		
		// cargas las imagenes

		imgHomero = app.loadImage("../data/homero_simpson.png");
		imgBart = app.loadImage("../data/bart_simpson.png");
		imgLisa = app.loadImage("../data/lisa_simpson.png");
		// -------------------------------------------------------------
		// -------------------------------------------------------------
		// cargar el txt
		for (int i = 0; i < datos.length; i++) {
			String[] datosTemp = datos[i].split(",");
			int tipo = Integer.parseInt(datosTemp[0]);
			String img = datosTemp[1];
			int posX = Integer.parseInt(datosTemp[2]);
			int posY = Integer.parseInt(datosTemp[3]);

			if (tipo == 1) {
				
				Homero temp = new Homero(app, tipo, imgHomero, posX, posY);
				
				temp.start();
				homerito.add(temp);
			}
			if (tipo == 2) {
				Homero temp = new Homero(app, tipo, imgBart, posX, posY);
				temp.start();
				homerito.add(temp);
			}
			if (tipo == 3) {
				Homero temp = new Homero(app, tipo, imgLisa, posX, posY);
				temp.start();
				homerito.add(temp);
			}
			

		}
	}

	

	public void pintar() {
		app.background(0);
		
		// ---------------------------------
if (act1 == true) {
	for (int i = 0; i < homerito.size(); i++) {
		Homero temp = homerito.get(i);
		temp.pintar();

	}
}
		
		app.rect(800,600, 60, 60);

		

	}
	public void click() {
		if(app.mouseX>800 && app.mouseX<850&& app.mouseY>600&&app.mouseY<650) {
			act1 = true;
		}
	}
}
