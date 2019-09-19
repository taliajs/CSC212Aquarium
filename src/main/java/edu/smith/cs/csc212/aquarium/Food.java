package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Food {
		int x; 
		int y; 
		int width;
		int height;
		
		public Food () {
			this.x = 350;
			this.y = 50;
			this.width = 10;
			this.height = 60;
		}
		
		public void draw(Graphics2D win) {
			win.setColor(Color.green);
			win.drawOval(x, y, width, height);
			win.fillOval(x, y, width, height);
		}	
}
