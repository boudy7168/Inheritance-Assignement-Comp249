package tr;



import met.Metro;
import wt.WheeledTransportation;

public class Tram extends Metro {
    protected int yearOfCreation;
    protected long serialNumber;
    protected static long serialNumCtr = 30000;

    
    //default constructor
    public Tram() {
    	super();
    	yearOfCreation=2023;
    	serialNumber=serialNumCtr++;
    }
    
    //parameterised constructor
    public Tram(int numberOfWheels, double maximumSpeed, int numberOfVehicles, String startingStation, String destinationStation,int totalStops, int yearOfCreation) {
    	super( numberOfWheels, maximumSpeed, numberOfVehicles,  startingStation,  destinationStation,totalStops);
        this.yearOfCreation = yearOfCreation;
        serialNumber=serialNumCtr++;
    }

    //copy constructor
    public Tram(Tram other) {
        super(other);
        this.yearOfCreation = other.yearOfCreation;
        serialNumber=serialNumCtr++;
    }

    
    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public long getSerialNumber() {
        return serialNumber;
    }
    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }
    
    
    
    

    public String toString() {
        return "Tram – serial #" + getSerialNumber() + " has " + getNumberOfWheels() + " wheels, has a maximum speed of " + getMaximumSpeed() + " km/h. It has " + getNumberOfVehicles() + " vehicles and its starting and destination stations are " + getStartingStation() + " and " + getDestinationStation() + ". It was created in the year " + getYearOfCreation() + ".";
    }
     
    public boolean equals(Object other)
    {
    	if (other == null || this == null || other.getClass()!=this.getClass()  )
    		return false;
    	
    	else
    	{
    		Tram w= (Tram)other;

    		return (
    			this.getMaximumSpeed() == w.getMaximumSpeed() &&
    				this.getNumberOfWheels()==w.getNumberOfVehicles()&& this.getNumberOfVehicles()==w.getNumberOfVehicles()
    				&& this.getStartingStation()==w.getStartingStation() && this.getDestinationStation()==w.getDestinationStation()  && this.getTotalStops()==w.getTotalStops() && this.getYearOfCreation()==w.getYearOfCreation());
    			
    	}
    }
   
    
    
}