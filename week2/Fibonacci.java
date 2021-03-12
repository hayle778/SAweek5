package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	
	private static final int MAX_TERM_VALUE= 10000;
	
	public void run() {
		print("This program list from the fibonacci sequence:");	{
			// fixed value and declared it
			
			int t1 = 0;
		  int t2 = 1;
	//	  int tnew = 1;
		    
		println(t1);
		  while(t1 < MAX_TERM_VALUE) {
		    	
		   println(t1);
		   
		    int t3 = t1 + t2;
		   // int t4 = t2 + t3;
		    //int t5 = t3 + t4;
		    
		    t1 = t2;
		    t2 = t3;
		   
		    //println(t1);
		    
		    
		    }
	}

}}