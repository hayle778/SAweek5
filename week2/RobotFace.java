package week2;

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {
    private static final int HEAD_WIDTH = 102;
    private static final int HEAD_HEIGHT = 154;

    private static final int EYE_RADIUS = 9;

private static final int MOUTH_WIDTH = 65;
private static final int MOUTH_HEIGHT = 20;


public void run() {
	
// to put the face in the centre of the applet board:
	
	addRobotFace(getWidth()/2, getHeight()/2);
	
	
}


private void addRobotFace(double x, double y) {
	// TODO Auto-generated method stub
	

	  addHead(x, y);            //
	  addMouth(x, y + HEAD_HEIGHT/4);
 
	 
	  // both eyes set the quarter of the vertical (y) and horizontal(x)
	
	  addEye(x - HEAD_WIDTH/4, y - HEAD_HEIGHT /4);
	  addEye(x + HEAD_WIDTH /4, y - HEAD_HEIGHT /4);



}


/*	private void addFace(double x, double y) {
	
	addHead(x, y);
	 addMouth(x, y + HEAD_HEIGHT/4);
 addEye(x-HEAD_WIDTH/4, y - HEAD_HEIGHT /4);
	addEye(x+ HEAD_WIDTH /4, y - HEAD_HEIGHT /4);
}
*/
private void addEye(double x, double y) {
double a = x-EYE_RADIUS;
double b = y-EYE_RADIUS;

GOval eye = new GOval(a,b,  2*EYE_RADIUS, 2*EYE_RADIUS);
	eye.setFilled(true);
	eye.setColor(Color.YELLOW);
	add(eye);
}




private void addMouth(double x, double y) {
	double a = x-MOUTH_WIDTH/2;
	double b = y-MOUTH_HEIGHT/2;
	
	GRect mouth = new GRect(a, b, MOUTH_WIDTH, MOUTH_HEIGHT);
	mouth.setFilled(true);
	mouth.setColor(Color.WHITE);
	add(mouth);
}




private void addHead(double x, double y) {
	
	
	double a = x - HEAD_WIDTH/2;
	double b = y - HEAD_HEIGHT/2;


	GRect head = new GRect(a, b, HEAD_WIDTH, HEAD_HEIGHT);
 
	head.setFilled(true);
 head.setFillColor(Color.GRAY);

add(head);
}

}
