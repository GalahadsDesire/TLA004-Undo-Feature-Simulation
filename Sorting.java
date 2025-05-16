package sorts;

import java.util.Scanner;

import java.util.Stack;

public class Sorting {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	      Stack <String> galahad = new Stack <> ();
	      
	      galahad.push("Hotdog");
	      
	      galahad.push("Chocolate");
	      
	      galahad.push("Steak");
	      
	      String action;
	      
	      boolean running = true;
	      
	    
	        
	        String Choice;
	        
	        
	        
	        while(running){
	           
	            System.out.println("Enter a choice either type 'UNDO', 'EXIT', 'DO' 'PRINT" );
	            Choice = scanner.nextLine();
	        if (Choice.equalsIgnoreCase("Exit")){
	            
	            System.out.println(" Exit successfully");
	            
	            running = false;
	            } else if(Choice.equalsIgnoreCase("DO")){
	                System.out.println("ENTER VALUE TO BE ADDED");
	                
	                action = scanner.nextLine();
	                
	                galahad.push(action);
	                
	                
	            } else if(Choice.equalsIgnoreCase("UNDO")){
	                
	                galahad.pop();
	                
	                System.out.println(galahad);
	            }  else if(Choice.equalsIgnoreCase("PRINT")){
	                
	                System.out.println(galahad);
	            }
	                
	                
	                
	            }

	}

}
