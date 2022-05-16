package carList;

import java.util.*;

public class MainMenu {

	public static void main(String[] args) {
		//this allows user to run on the console w/out GUI
		
		int menuChoice = 0;
		//car vars
		int newPower;
        String newDriveTrain, newMake, newModel;
        //gas vars
        double newBasePrice;
    	String newEngineType;
    	int newMPG, newYear;
        
        
		System.out.println("press 1 to enter new car.");		
		Scanner menuInput = new Scanner(System.in);	//create Scanner for menu choice
		menuChoice = menuInput.nextInt();
		
		if (menuChoice == 1) {
			System.out.println("1 for Gas Powered");        	
        	Scanner input = new Scanner(System.in);
        	//ask for info to instantiate class
        	System.out.println("Make: ");
        	newMake = input.nextLine();
        	System.out.println("Model: ");
        	newModel = input.nextLine();
        	System.out.println("Drivetrain Type: ");
        	newDriveTrain = input.nextLine();
        	System.out.println("horsepower: ");
       	 	newPower = input.nextInt();
       	 	System.out.println("MSRP: ");
       	 	newBasePrice = input.nextDouble();
	       	System.out.println("engine: ");
	    	newEngineType = input.nextLine();
	    	System.out.println("MPG: ");
	    	newMPG = input.nextInt();
	    	System.out.println("model year: ");
	    	newYear = input.nextInt();
        	
	    	GasPowered newGasCar = new GasPowered(newMake, newModel, newDriveTrain, newPower, newBasePrice, newEngineType, newMPG, newYear);
	    	input.close();
	    	
	    	System.out.println("you made a new gas powered car!\ninfo:\n");
	    	newGasCar.toString();
		}
		
		menuInput.close();
	}
	
	

}
