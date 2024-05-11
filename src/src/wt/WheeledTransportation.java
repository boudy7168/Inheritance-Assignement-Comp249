package wt;

import air.Transportation;

public class WheeledTransportation extends Transportation {
    protected int numberOfWheels;
    protected double maxSpeed;
    protected long serialNumber;
    
    private static long serialNumCtr=0 ;

    // default constructor
    public WheeledTransportation() {
    	 numberOfWheels = 4;
         maxSpeed = 50;
         serialNumber = serialNumCtr++;
    	
    }
    
    // Parameterized constructor
    public WheeledTransportation(int numOfWheels, double maxSpeed) {
       
        this.numberOfWheels = numOfWheels;
        this.maxSpeed = maxSpeed;
        serialNumber = serialNumCtr++;
    }
    
    
 // Copy constructor
    public WheeledTransportation(WheeledTransportation other) {
    	 
        numberOfWheels = other.numberOfWheels;
        maxSpeed = other.maxSpeed;
        serialNumber = serialNumCtr++;
    }

    //three accessor methods for the attributes
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getMaximumSpeed() {
        return maxSpeed;
    }
    public long getSerialNumber() {
        return serialNumber;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

   
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    
    
    //toString method
    public String toString() {
        return "WheeledTransportation – serial #" + getSerialNumber() + " has " + getNumberOfWheels() + " wheels and a maximum speed of " + getMaximumSpeed() + " km/h.";
    }

 
    public static long getNextSerialNumber() {
        return serialNumCtr+1;
    }
    public boolean equals(Object other)
    {
    	if (other == null || this == null || other.getClass()!=this.getClass()  )
    		return false;
    	
    	else
    	{
    		WheeledTransportation w= (WheeledTransportation)other;

    		return (
    			this.getMaximumSpeed() == w.getMaximumSpeed() &&
    				this.getNumberOfWheels()==w.getNumberOfWheels() );
    			
    	}
    	
    }
   
    
    
    
    
    
 
    
    
    
    
    
 
    }