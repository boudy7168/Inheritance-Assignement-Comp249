package met;


import fer.Ferry;
import tr.Train;
import wt.WheeledTransportation;

public class Metro extends Train {
    protected int totalStops;
    protected long serialNumber;
    protected static long serialNumCtr = 25000;

    //default constructor
    public Metro() {
    	super();
    	totalStops=10;
    	serialNumber=serialNumCtr++;
    }
    
    //Parameterized constructor
    public Metro(int numberOfWheels, double maximumSpeed, int numberOfVehicles, String startingStation, String destinationStation,int totalStops) {
    	super( numberOfWheels, maximumSpeed, numberOfVehicles,  startingStation,  destinationStation);
    	this.totalStops=totalStops;
    	serialNumber=serialNumCtr++;
    }
    
    //copy constructor
 public Metro(Metro obj) {
	 super (obj);
	 this.totalStops=obj.totalStops;
	 serialNumber=serialNumCtr++;
	 
 }

    //getter
    public int getTotalStops() {
        return totalStops;
    }

    //setter for total stops
    public void setTotalStops(int totalStops) {
        this.totalStops = totalStops;
    }
    public long getSerialNumber() {
        return serialNumber;
    }
    
     
    public String toString() {
        return "Train – serial #" + getSerialNumber() + " has " + getNumberOfWheels() + " wheels, has a maximum speed of " + getMaximumSpeed() + " km/h. It has " + getNumberOfVehicles() + " vehicles and its starting and destination stations are " + getStartingStation() + " and " + getDestinationStation() + ".";
    }
    
    public boolean equals(Object other)
    {
    	if (other == null || this == null || other.getClass()!=this.getClass()  )
    		return false;
    	
    	else
    	{
    		Metro w= (Metro)other;

    		return (
    			this.getMaximumSpeed() == w.getMaximumSpeed() &&
    				this.getNumberOfWheels()==w.getNumberOfWheels() && this.getNumberOfVehicles()==w.getNumberOfVehicles()
    				&& this.getStartingStation()==w.getStartingStation() && this.getDestinationStation()==w.getDestinationStation()  && this.getTotalStops()==w.getTotalStops());
    			
    	}
    }
    
    
   
}