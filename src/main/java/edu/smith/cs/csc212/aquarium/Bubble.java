package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.Random;

/**
 * Code came from John Foley's Waves video
 */

public class Bubble {
	int x; 
	int y; 
	int width; 
	int height;
	Random rand;
	
	public Bubble () {
		this.rand = new Random();
		this.x = 200 + rand.nextInt(115);
		this.y = 450;
		this.width = 10 + rand.nextInt(10);
		this.height = 10 + rand.nextInt(10);
	}

	public void draw(Graphics2D win) {
		win.setColor(Color.white);
		win.drawOval(x, y, width, height);
		animate();
	}
	public void animate() {
		this.y -= 1; //bubble drifts upwards
		
		if (this.y < 0) {
			this.y = 450;
		}
	}
}

