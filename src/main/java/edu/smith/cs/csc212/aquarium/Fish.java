package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

/**
Parts of the code were from John Foley's P1 video from Moodle
 * @author tseshaiah
 * 
 *
 */

//create a Fish class with three fish in it
public class Fish {
	// color of the fish
	Color color;
	// position of the fish
	int x;
	int y; 
	// size of the fish
	boolean isLittle; 
	// direction of fish
	boolean facingLeft;
	// destination of fish
	int destX;
	int destY;
	
	// fish constructor
	public Fish(Color c) { 
		this.color = c;
		Random rand = new Random(); 
		this.x = rand.nextInt(Aquarium.WIDTH);
		this.y = rand.nextInt(Aquarium.HEIGHT);
		this.isLittle = rand.nextBoolean();
		this.facingLeft = rand.nextBoolean();
		
		//debug destination of fish
		// have all fish swim towards same destination
		this.destX = 250;
		this.destY = 250;
		
	}
	
	
	public void draw(Graphics2D window) {
		this.swim();
		
		// need to add isLeft code here:
		if (this.isLittle) {
			if (this.facingLeft) {
				DrawFish.smallFacingLeft(window, this.color, 
					this.x, this.y);
			} else {
				DrawFish.smallFacingRight(window, this.color, 
						this.x, this.y); 
			}
		} else {
			if (this.facingLeft) {
				DrawFish.facingLeft(window, this.color, 
					this.x, this.y);
			} else {
				DrawFish.facingRight(window, this.color, 
						this.x, this.y);
			}
		}
	}
	
	// animate our fish
	public void swim() {
		
		// about destX and destY
		if (this.x < this.destX) {
			this.x += 1;
			facingLeft = false;
		} else if (this.x > this.destX){
			this.x -= 1;
			facingLeft = true;
		}
		
		//member variable 
		
		
	}
}

//random destination; swimming towards destination
//member variable: variable in the class, not specific to a function
	// ex: x and y