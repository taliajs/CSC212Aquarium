package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class HungryFish {

	public static int FOODAREA = 300; // near food

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
	// random
	Random rand;
	// hunger
	int hunger = 0;

	// fish constructor
	public HungryFish(Color c) {
		this.color = c;
		this.rand = new Random();
		this.x = rand.nextInt(Aquarium.WIDTH);
		this.y = rand.nextInt(Aquarium.HEIGHT);
		this.isLittle = rand.nextBoolean();
		this.facingLeft = rand.nextBoolean();

		// fish go to random destination
		this.destX = rand.nextInt(Aquarium.WIDTH);
		this.destY = rand.nextInt(Aquarium.HEIGHT);
	}

	public void draw(Graphics2D window) {
		this.swim();
		this.hunger();

		if (this.isLittle) {
			if (this.facingLeft) {
				DrawFish.smallFacingLeft(window, this.color, this.x, this.y);
			} else {
				DrawFish.smallFacingRight(window, this.color, this.x, this.y);
			}
		} else {
			if (this.facingLeft) {
				DrawFish.facingLeft(window, this.color, this.x, this.y);
			} else {
				DrawFish.facingRight(window, this.color, this.x, this.y);
			}
		}
	}

	// animate our fish
	public void swim() { // swim() is a method of Fish

		// about destX and destY
		if (this.x < this.destX) {
			this.x += 1; // moves to the right
			facingLeft = false;
		} else if (this.x > this.destX) {
			this.x -= 1; // moves to the left
			facingLeft = true;
		}
		if (this.y < this.destY) {
			this.y += 1; // moves to the right
			facingLeft = false;
		} else if (this.y > this.destY) {
			this.y -= 1; // moves to the left
			facingLeft = true;
		}
	}

	public void hunger() {
		System.out.println("Hunger: " + this.hunger);
		if (this.hunger == 250) { // THIS LINE, && this.hunger <300
			this.destX = FOODAREA;
			this.destY = 30 + rand.nextInt(125); // go to random destination in food area
			this.color = Color.red;
			// this.hunger = 0;
		}
		
		//else { // if hunger is normal, leave food area
		//this.destX = rand.nextInt(Aquarium.WIDTH);
		//this.destY = rand.nextInt(Aquarium.HEIGHT);
		//this.color = Color.green;
		//}

		// else { if (this.hunger == 301){
		// reset hunger
		// this.hunger = 0;
		// leave food area
		// this.destX = rand.nextInt(Aquarium.WIDTH);
		// this.destY = rand.nextInt(Aquarium.HEIGHT);

	}



}
