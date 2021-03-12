package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		
				
	
	
	
	
		 while (frontIsClear()) {
	            move();
	            checkMiddleBeeper();
	            cleanExtraBeepers();
	            move();
	        }
	    }
	    
	    private void cleanExtraBeepers() {
	        if (noBeepersPresent()) {
	            cleanBeepersSouth();
	            cleanBeepersNorth();
	        }
	    }
	    
	    private void cleanBeepersNorth() {
	        move();
	        if (frontIsClear()) {
	            move();
	        }
	        while (beepersPresent()) {
	            pickBeeper();
	        }
	        turnAround();
	        move();
	        turnLeft();
	        }

	    private void checkMiddleBeeper() {
	        if (beepersPresent()) {
	            move();
	            move();
	        }
	    
	    
	    }
	 
	    private void cleanBeepersSouth() {
	        turnRight();
	        move();
	        while (beepersPresent()) {
	            pickBeeper();
	        }
	        turnAround();
	        move();
	    }
	 
	    
	    

	    
	    
	       
	       
	       
	       
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
		

