package carList;

public class Electric extends Car{
    private double basePrice;
    private int range;
    private int modelYear;
    
    public double getBasePrice()               { return basePrice;             }
    public void setBasePrice(double basePrice)  { this.basePrice = basePrice;   }
    
    public int getRange()                       { return range;                 }
    public void setRange(int range)             { this.range = range;           }
    
    public int getModelYear()                   { return modelYear;             }
    public void setModelYear(int modelYear)     { this.modelYear = modelYear;   }
    
    //parameterized constructor
    public Electric(String make, String model, String driveTrain, int power, double basePrice, int range, int modelYear){
        super(make, model, driveTrain, power);
        basePrice   = this.basePrice;
        range       = this.range;
        modelYear   = this.modelYear;
    }
    
    @Override
    public String toString(){
       return super.toString() +
       " msrp: " + getBasePrice() +
       " range: " + getRange() +
       " year: " + getModelYear();
    }
}