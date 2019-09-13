package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

//create a Fish class with three fish in it
public class Fish {
	// color of the fish
	Color color;
	// position of the fish
	int x;
	int y;
	boolean facingLeft;
	
	// construct a fish at position with color
	public Fish(Color c, int startX, int startY ) {
		this.color = c;
		this.x = startX;
		this.y = startY;
	}
	
	public void draw(Graphics2D window) {
		this.swim();
		
		DrawFish.facingLeft(window, 
				this.color, this.x, this.y);
		DrawFish.facingRight(window, 
				this.color, this.x, this.y);
		DrawFish.smallFacingLeft(window, 
				this.color, this.x, this.y);
		DrawFish.smallFacingRight(window, 
				this.color, this.x, this.y);//draws the pink fish
	}
	
	// animate our fish
	public void swim() {
		// this.y += 1;

	}
		
		
}
