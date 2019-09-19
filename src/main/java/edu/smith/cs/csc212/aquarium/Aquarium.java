package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

import me.jjfoley.gfx.GFX;

/**
 * Aquarium is a graphical "application" that uses some code I built and have
 * shared with you that takes care of opening a window and communicating with
 * the user in a simple way.
 * 
 * The method draw is called 50 times per second, so we make an animation by
 * drawing our fish in one place, and moving that place slightly. The next time
 * draw gets called, our fish looks like it moved!
 * 
 * @author jfoley
 *
 */
public class Aquarium extends GFX {
	/**
	 * This is a static variable that tells us how wide the aquarium is.
	 */
	public static int WIDTH = 500;
	/**
	 * This is a static variable that tells us how tall the aquarium is.
	 */
	public static int HEIGHT = 500;

	/**
	 * Put a snail on the top of the tank.
	 */
	Snail algorithm = new Snail(177, Snail.HEIGHT + 1, "top");

	/**
	 * This is a constructor, code that runs when we make a new Aquarium.
	 */
	
	Fish[] fishes = new Fish[20];
	
	public Aquarium() {
		// Here we ask GFX to make our window of size WIDTH and HEIGHT.
		// Don't change this here, edit the variables instead.
		super(WIDTH, HEIGHT);
//		Random rand = new Random();
//		for (int i = 0; i <this.fishes.length; i++) {
//			Color rcolor = Color.getHSBColor (
//					rand.nextFloat(), 0.8f, 0.8f);
//			boolean isSmall = rand.nextBoolean();
//			boolean isRight = rand.nextBoolean();
//			int x = 50 + (i*90) % (WIDTH-100);
//		    int y = 50 + (i*40) % (HEIGHT-100);
//		    this.fishes[i] = new Fish(x, y, rcolor, isSmall, isRight);
//		}
		
	}

	//make a Fish constructor in Fish.java

	Fish nemo = new Fish(Color.red); 
	Fish fish1 = new Fish(Color.pink);
	
	// create a loop that automatically creates new fishes?
	
	Bubble bubble = new Bubble();
	


	@Override
	public void draw(Graphics2D g) {
		// Draw the "ocean" background.
		g.setColor(Color.blue);
		g.fillRect(0, 0, getWidth(), getHeight());
		bubble.draw(g);
		
		//The new fishes
		fish1.draw(g);
		nemo.draw(g);


		// Draw our snail!
		algorithm.draw(g);
		
	}


	public static void main(String[] args) {
		// Uncomment this to make it go slower!
		// GFX.FPS = 10;
		// This is potentially helpful for debugging movement if there are too many print statements!

		// Note that we can store an Aquarium in a variable of type GFX because Aquarium
		// is a very specific GFX, much like 7 can be stored in a variable of type int!
		GFX app = new Aquarium();
		app.start();
	}

}
