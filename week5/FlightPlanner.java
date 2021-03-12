/*write the program that reads in a file containing flight destinations from 
various cities.  Allow the user to plan a round-trip flight rout

*/
package week5;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import acm.program.ConsoleProgram;
import acmx.export.java.util.Scanner;

public class FlightPlanner extends ConsoleProgram {
   
	public void run() {

		HashMap<Integer,String> dest = new HashMap<Integer,String>();
	
		println ("                                       Welcome to Flight planner: ");
	
		println("Here is the list of all cities in our data base: ");
	          
		dest.put(1 , "   San Jose -> San Francisco");
	           dest.put  (2, "  San Jose -> Anchorage");
		     dest.put(3 , "  New York -> Anchorage");
		     dest.put (4,   " New York -> San Jose");
		    dest.put(5,    " New York -> San Francisco");
	       dest.put (6,    " New York -> Honolulu");
	      dest.put(7,    " Anchorage -> New York");
		  dest.put(8,    " Anchorage -> San Jose");
		  dest.put(9,   " Honolulu -> New York");
		 dest.put(10,  " Honolulu -> San Francisco");
		dest.put(11,   " Denver -> San Jose");
		dest.put(12," San Francisco -> New York");
	     dest.put(13,  " San Francisco -> Honolulu");
	     dest.put(14,   " San Francisco -> Denver");             

		
	
		Scanner input = new Scanner(System.in);
		 ArrayList <String> flightRepo = new ArrayList< String>();
		
                	flightRepo.add("San Jose");
	               flightRepo.add("San Franciso");
	               flightRepo.add("Anchorage");
	               flightRepo.add("New York");
	               flightRepo.add("Honolulu");
	               flightRepo.add("Denver");
		
		Iterator itr=flightRepo.iterator();//getting the Iterator  
		 
		while(itr.hasNext()){//check if iterator has the elements  
		   
			println(itr.next());//printing the element and move to next  
		
		}  

		  println(dest);
		
		println( "Let`s plan the round trip route! " );
		
		
        for( String k : flightRepo) {
		
	        println("--------------------------------------------------");
			        
	                String city ="";
			         
	                 println( " Enter the starting city:  "  );

			         city = readLine();
	
	              //println("from " + city + "  you can fly direcly to: " + dest);

	   
	              println( "Where do you want to go from " + city + "?");
	          
	          
	              
	              int a= readInt();
	          	
	     	          if( a > 14|| a<1 ) {
	     	        	 println("There is no direct flight with that # " +dest.get(a));
	     	
	     	        	 
	     	        	 break;
	     	        
	     	          
	     	          }
	     	        println( dest.get(a)  );
	     	         

	                  String city2 ="";
			         
	                 println( " Enter the starting city:  "  );

			         city2 = readLine();
	     	    
	     	        println( "Where do you want to go from " + city2 + "?");
		              
	 	          
		              
		              int b= readInt(" ");
		          	
		     	          if( b > 14|| a<1 ) {
		     	        	 println("There is no direct flight with that # " +dest.get(b));
		     	   
		     	        
		     	        	 break;
		     	          
		     	          
		     	          }
		     	    println(dest.get(a));
	             
		     	        }
	              
	}

	      
	
	}
	
	
	

