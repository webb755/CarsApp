package carList;

import java.util.*;

public class NewCar {
    //public static void newCar(String[] args) {
    public static Car newCar() {
        Scanner input = new Scanner(System.in);
        System.out.print("What Kind of car? \nenter 2 for gas powered\nenter 2 for electric\nenter 3 for racecar\n");
        int entry = input.nextInt();
        
        //variables for Car
        int newPower;
        String newDriveTrain, newMake, newModel;
        
        //if (entry == 1){
        public static GasPowered newGas() {
            //link to GasPoweredGUI
        	//variables for gasPowered
        	double newBasePrice;
        	String newEngineType;
        	int newMPG, newYear;
        	
        	//ask for info to instantiate class
        	System.out.print("Make: ");
        	newMake = input.nextLine();
        	System.out.print("Model: ");
        	newModel = input.nextLine();
        	System.out.print("Drivetrain Type: ");
        	newDriveTrain = input.nextLine();
        	System.out.print("horsepower: ");
       	 	newPower = input.nextInt();
       	 	System.out.print("MSRP: ");
       	 	newBasePrice = input.nextDouble();
	       	System.out.print("engine: ");
	    	newEngineType = input.nextLine();
	    	System.out.print("MPG: ");
	    	newMPG = input.nextInt();
	    	System.out.print("model year: ");
	    	newYear = input.nextInt();
        	
	    	GasPowered newCar = new GasPowered(newMake, newModel, newDriveTrain, newPower, newBasePrice, newEngineType, newMPG, newYear);
	    	input.close();
        }
        if (entry == 2){
            //link to ElectricGUI
        }
        if (entry == 3){
            //link to RaceGUI
        }
        
        input.close();
        return newCar;
    }
}