package tr;

import wt.WheeledTransportation;

public class Train extends WheeledTransportation {
    protected int numberOfVehicles;
    protected String startingStation;
    protected String destinationStation;
protected long serialNumber;
 protected static long serialNumCtr = 10000;
    
    //default constructor
    public Train() {
    	
    	super();
    	startingStation="Montreal";
    	destinationStation="Toronto";
    	serialNumber=serialNumCtr++;
    }
    
    
    
    //parameter constructor
    public Train(int numberOfWheels, double maximumSpeed, int numberOfVehicles, String startingStation, String destinationStation) {
    	
        super(numberOfWheels, maximumSpeed);
        this.numberOfVehicles = numberOfVehicles;
        this.startingStation = startingStation;
        this.destinationStation = destinationStation;
        serialNumber=serialNumCtr++;
    }

    
    //copy constructor
    public Train(Train other) {
    	 super(other); // Call the base class constructor
         numberOfVehicles = other.numberOfVehicles;
         startingStation = other.startingStation;
         destinationStation = other.destinationStation;
         serialNumber=serialNumCtr++;
    }

    
    
    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    
    
    public String getStartingStation() {
        return startingStation;
    }

    
    public String getDestinationStation() {
        return destinationStation;
    }
    public long getSerialNumber() {
        return serialNumber;
    }
    public void setDestinationStation(String Destination) {
    	destinationStation=Destination;
    }
    public void setStartingStation(String starting) {
    	startingStation=starting;
    }
    public void setnbofvehicles(int vehiclesnb) {
    	numberOfVehicles=vehiclesnb;
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
    		Train w= (Train)other;

    		return (
    			this.getMaximumSpeed() == w.getMaximumSpeed() &&
    				this.getNumberOfWheels()==w.getNumberOfWheels() && this.getNumberOfVehicles()==w.getNumberOfVehicles()
    				&& this.getStartingStation()==w.getStartingStation() && this.getDestinationStation()==w.getDestinationStation());
    			
    	}
    }
    
}