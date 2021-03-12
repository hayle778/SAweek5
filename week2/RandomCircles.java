package week2;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomCircles extends GraphicsProgram {
private RandomGenerator random = RandomGenerator.getInstance();

	
	public void run() {
		
		for(int i = 0; i < QUANTITY_CIRCLE; i++) {
			double radius = random.nextDouble(MIN_RADIUS, MAX_RADIUS);
			double h = random.nextDouble(0, getHeight()- 2* radius);
			Double w = random.nextDouble(0, getWidth() - 2* radius);
			
			
			// create the oop of the circle using the radius, height and width
			
			GOval circle = new GOval(h,w , 2 * radius, 2 * radius);
			circle.setFilled(true);
			circle.setColor(random.nextColor());
			add(circle);
			
			
		}
	}
	
private static final double MAX_RADIUS = 50;
private static final double MIN_RADIUS = 5;
private static final int QUANTITY_CIRCLE = 10;


}
