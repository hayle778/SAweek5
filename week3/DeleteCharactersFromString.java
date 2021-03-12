package week3;

import java.text.DecimalFormat;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	public void run() {
		while (true) {
			
			
			String digits = readLine("Enter a numeric string: ");
			
			Double k = Double.valueOf(digits);
			
	  	DecimalFormat df = new DecimalFormat("###,### ");
  
              println(df.format(k));


              
        if (k <= 999) {
	
           	k++;

	        println("The number you entered is below 1000. No commas to add: ");

	        break;	
	
	
                   }


}
	}
	
}
