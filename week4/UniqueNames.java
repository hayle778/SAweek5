package week4;

import java.util.ArrayList;

import acm.program.ConsoleProgram;
import acmx.export.java.util.Scanner;

public class UniqueNames extends ConsoleProgram  {
	
	// write the program that asks the user for a list of name (one per line)
	
	
	public void run () {
	

        Scanner input = new Scanner(System.in);

        ArrayList<String> empList = new ArrayList<>();
        System.out.println("Enter a name:");
        String america = input.nextLine();
        empList.add(america);
        System.out.println("Enter a name:");
        String america2 = input.nextLine();
        empList.add(america2);
        System.out.println("Enter a name:");
        String america3 = input.nextLine();
        empList.add(america3);
        System.out.println("Enter a name:");
        String america4 = input.nextLine();
       empList.add(america4);
        System.out.println("Enter a name:");
        String america5 = input.nextLine();
       empList.add(america5);
        System.out.println("Enter a name:");
        String america6 = input.nextLine();
        empList.add(america6);
        //System.out.println(empList);
        ArrayList<String> newList = new ArrayList<>();

        for (String emp : empList) {
            if (empList == null) {
                break;
                //    return;
            }
           
            if (!newList .contains(emp)) {
          newList.add(emp);

            }}
     for(String  empName : newList ){
    System.out.println("The edited name list is: "+ empName);
}
            //   System.out.println();

	}

    }
		
        
        
	
	
