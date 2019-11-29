package View;

import Model.Logica;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
	Logica logic;
	

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	public void settings() {
		size(1000,1000);
	}
	public void setup() {
		logic = new Logica(this);
	}
	public void draw() {
		logic.pintar();
		}
}

