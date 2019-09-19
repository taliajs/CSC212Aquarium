package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Bubble {
	int x; 
	int y; 
	int width; 
	int height;
	public Bubble () {
		this.x = 250;
		this.y = 250;
		this.width = 20;
		this.height = 20;
	}

	public void draw(Graphics2D win) {
		Font f = win.getFont();
		win.setFont(f.deriveFont(.0f));
		win.setColor(Color.white);
		//win.drawString("o", x, y);
		win.drawOval(x, y, width, height);
		
		animate();
	}
	public void animate() {
		this.y -= 1;
	}
	
	//create a bubble array of 10 bubbles
	
}
