package carList;

public class RaceCar extends Car {
    private String series;
    private String team;
    
    //setter and getter methods
    public String getSeries()               { return series;        }
    public void setSeries(String series)    { this.series = series; }
    
    public String getTeam()                 { return team;          }
    public void setTeam(String team)        { this.team = team;     }
    
    //constructor
    public RaceCar(String make, String model, String driveTrain, int power, String series, String team) {
    	super(make, model, driveTrain, power);
        this.series = series;
        this.team   = team;
    }
    
    @Override   //this adds new info to superclass string method
    public String toString() {
        return super.toString() +
            " Series:" + getSeries() + 
            " Team: " + getTeam();
    }
}