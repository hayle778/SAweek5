package week2;

import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class DrawingLines extends GraphicsProgram {
	public void run() {
	       
		addMouseListeners();
    }
    // mouth press  to start a line
   
	//reposition for the mouse drag
	   
		public void mouseDragged(MouseEvent cursor) {
	        double x = cursor.getX();
	        
	        
	        double y = cursor.getY();
	       
	        
	        
	        line.setEndPoint(x, y);
	    
		}

	
	
	
	
	public void mousePressed(MouseEvent cursor) {
        double x = cursor.getX();
       
        
        
        double y = cursor.getY();
       
        
        line = new GLine(x, y, x, y);
      
        add(line);
  
	}

   //reposition for the mouse drag
   
	

    private GLine line;

	
	
	
	
	
}
