package edu.smith.cs.csc212.aquarium;

import java.awt.Color;

//Code came from John Foley's Waves video
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.Random;

public class Bubble {
	int x; 
	int y; 
	int width; 
	int height;
	Random rand;
	
	public Bubble () {
		this.rand = new Random();
		this.x = rand.nextInt(Aquarium.WIDTH);
		this.y = 450;
		this.width = 20;
		this.height = 20;
	}
	


	public void draw(Graphics2D win) {
		Font f = win.getFont();
		win.setFont(f.deriveFont(.0f));
		win.setColor(Color.white);
		win.drawOval(x, y, width, height);
		
		animate();
	}
	public void animate() {
		this.y -= 1;
	}

	
	
}
