package carList;

public class GasPowered extends Car{
    private double basePrice;
    private String engineType;
    private int mpg;
    private int modelYear;
    
    public double getPrice()                        { return basePrice;             }
    public void setPrice(double basePrice)          { this.basePrice = basePrice;   }
    
    public String getEngineType()                   { return engineType;            }
    public void setEngineType(String engineType)    { this.engineType = engineType; }
    
    public int getMPG()                             { return mpg;                   }
    public void setMPG(int mpg)                     { this.mpg = mpg;               }
    
    public int getModelYear()                       { return modelYear;             }
    public void setModelYear(int modelYear)         { this.modelYear = modelYear;   }
    
    //parameterized constructor
    public GasPowered(String make, String model, String driveTrain, int power, double basePrice, String engineType, int mpg, int modelYear){
        super(make, model, driveTrain, power);
        basePrice   = this.basePrice;
        engineType  = this.engineType;
        mpg         = this.mpg;
        modelYear   = this.modelYear;
    }
    
    @Override
    public String toString(){
        return  super.toString() +
                " Engine: " + getEngineType() +
                " mpg: " + getMPG() +
                " year: " + getModelYear() +
                " msrp: " + getPrice();
    }
}
