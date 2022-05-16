package carList;

public abstract class Car{
    private String model;
    private int power;
    private String driveTrain;
    private String make;
    
    //these public classes to be inherited by subclasses
    public String getModel()                         { return model;          }
    public void setModel(String model)               { this.model = model;    }
    
    public int getPower()                           { return power;         }
    public void setPower(int power)                 { this.power = power;   }
    
    public String getDriveTrain()                   { return driveTrain;            }
    public void setDriveTrain(String driveTrain)    { this.driveTrain = driveTrain; }
    
    public String getMake()                         { return make;      }
    public void setMake(String make)                { this.make = make; }
    
    //constructor to be referenced in subclass constructors
    public Car(String make, String model, String driveTrain, int power){
        this.make       = make;
        this.model      = model;
        this.driveTrain = driveTrain;
        this.power      = power;
    }
    
    public String toString(){
        return  "Make: " + getMake() +
                " Model: " + getModel() +
                " Drivetrain: " + getDriveTrain() +
                " Power: " + getPower() + " hp";
    }
}