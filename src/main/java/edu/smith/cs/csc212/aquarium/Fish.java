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
	boolean isLittle;
	
	// construct a fish at position with color
	public Fish(Color c, int startX, int startY, boolean dir, boolean size) {
		this.color = c;
		this.x = startX;
		this.y = startY;
		this.facingLeft = dir;
		this.isLittle = size;
		//this.facingLeft = true; //dir = direction
		//this.isLittle = true;
	}
	
	//true = facing left and small
	//false = facing right and big
	
	public void draw(Graphics2D window) {
		this.swim();
		
		if (this.facingLeft == true) {
			DrawFish.facingRight(window, this.color, 
					this.x, this.y);	//when i do facingLeft --> both have 2 
		} 
		// if facing Left --> draw it facing Right
		else {
			DrawFish.facingRight(window, this.color, 
					this.x, this.y);
		}
				
		
		DrawFish.facingRight(window, 
				this.color, this.x, this.y);
//		DrawFish.facingRight(window, 
//				this.color, this.x, this.y);
//		DrawFish.smallFacingLeft(window, 
//				this.color, this.x, this.y);
//		DrawFish.smallFacingRight(window, 
//				this.color, this.x, this.y);//draws the pink fish
	}
	
	
	// animate our fish
	public void swim() {
		// this.y += 1;

	}
		
		
}
