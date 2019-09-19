package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;


public class Chest {
		int x; 
		int y;
		int width;
		int height;
		
		
		public Chest () {
			this.x = 200;
			this.y = 470;
			this.width = 115;
			this.height = 150;
		}
		
		public void draw(Graphics2D win) {
			win.setColor(Color.gray);
			win.drawRect(x, y, width, height);
			win.fillRect(x, y, width, height);
			
		}

		
	}

