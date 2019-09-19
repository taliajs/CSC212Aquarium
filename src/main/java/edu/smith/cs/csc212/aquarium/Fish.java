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
	//random 
	Random rand;
	
	// fish constructor
	public Fish(Color c) { 
		this.color = c;
		this.rand = new Random(); 
		this.x = rand.nextInt(Aquarium.WIDTH);
		this.y = rand.nextInt(Aquarium.HEIGHT);
		this.isLittle = rand.nextBoolean();
		this.facingLeft = rand.nextBoolean();
		
		//debug destination of fish
		// have all fish swim towards same destination
//		this.destX = 250;
//		this.destY = 250;
		
		//fish go to random destination
		this.destX = rand.nextInt(Aquarium.WIDTH);
		this.destY = rand.nextInt(Aquarium.HEIGHT);	
	}
	
	
	public void draw(Graphics2D window) {
		this.swim();
		
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
			this.x += 1; //moves to the right
			facingLeft = false;
		} else if (this.x > this.destX){
			this.x -= 1; //moves to the left 
			facingLeft = true;
		}
		if (this.y < this.destY) {
			this.y += 1; //moves to the right
			facingLeft = false;
		} else if (this.y > this.destY){
			this.y -= 1; //moves to the left 
			facingLeft = true;
		}
		
		
		//member variable 
		
		//close to destination, fish chooses another
		if (Math.abs(this.x - this.destX) <=3 && Math.abs(this.y - this.destY) <=3) {
			this.destX = this.rand.nextInt(Aquarium.WIDTH);
			this.destY = this.rand.nextInt(Aquarium.HEIGHT);	
			}
	

	}
}

//random destination; swimming towards destination
//member variable: variable in the class, not specific to a function
	// ex: x and y