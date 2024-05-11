package mono;

import wt.WheeledTransportation;

public class Monowheel extends WheeledTransportation {
	
	protected double maxWeight;
	 protected static long serialNumCtr = 55000;
	 protected long serialNumber;
	
	
	//default constructor
	public Monowheel() {
		super();
		maxWeight=1000;
		serialNumber=serialNumCtr++;
	}
	
	//parametrised constructor
	public Monowheel(int numOfWheels, double maxSpeed, double maxWeight) {
		super(numOfWheels,maxSpeed);
		this.maxWeight=maxWeight;
		serialNumber=serialNumCtr++;
	}
	
	 public Monowheel(Monowheel other) {
		 super(other);
		 this.maxWeight=other.maxWeight;
		 this.serialNumber=serialNumCtr++;
	 }
	
	public long getSerialNumber() {
        return serialNumber;
    }
	  protected void setMaxWeight(double maxWeight) {
	        this.maxWeight = maxWeight;
	    }
	
	
	
	//getter
	public double getMaxWeight() {
		return maxWeight;
	}
	
	
	
	 public boolean equals(Object other)
	    {
	    	if (other == null || this == null || other.getClass()!=this.getClass()  )
	    		return false;
	    	
	    	else
	    	{
	    		Monowheel w= (Monowheel)other;

	    		return (
	    			this.getMaximumSpeed() == w.getMaximumSpeed() &&
	    				this.getNumberOfWheels()==w.getNumberOfWheels() && this.getMaximumSpeed()==w.getMaximumSpeed() && this.getMaxWeight()==w.getMaxWeight() );
	    			
	    	}
	    }
}