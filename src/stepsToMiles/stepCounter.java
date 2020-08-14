package stepsToMiles;

import java.util.Scanner;

public class stepCounter {
	  /* Define your method here */
	   public static double stepsToMiles(int userSteps){
	    
	    float stepsToMiles = userSteps / 2000f;
	    
	    return stepsToMiles;
	}
	

	   public static void main(String[] args) {
	    Scanner scnr = new Scanner(System.in);
	    int userSteps;
	 
	   
	     userSteps = scnr.nextInt();
	   //stepsToMiles(userSteps);
	   System.out.printf("%.2f",stepsToMiles (userSteps));
	 
	  
}
}