package fer;

import air.Transportation;

public class Ferry extends Transportation{
	
	protected double maxSpeed;
	protected double maxLoad;
	protected static long serialNumCtr = 70000;
	protected long serialNumber ;



public Ferry() {
	maxSpeed=100.0;
	maxLoad=100.0;
	serialNumber=serialNumCtr++;
}

public Ferry(double maxSpeed,double maxLoad) {
	this.maxSpeed=maxSpeed;
	this.maxLoad=maxLoad;
}
public Ferry(Ferry F) {
	this.maxSpeed=F.maxSpeed;
	this.maxLoad=F.maxLoad;
}
public double getmaxspeed() {
	return maxSpeed;
}
public double getmaxload() {
	return maxLoad;
}
public double getserialnb() {
	return serialNumber;
}


public void setMaxSpeed(double maxSpeed) {
    this.maxSpeed = maxSpeed;
}

// Protected setter for maxLoad
public void setMaxLoad(double maxLoad) {
    this.maxLoad = maxLoad;
}



public boolean equals(Object other)
    {
	if (other == null || this == null || this.getClass() != other.getClass())
		return false;
	else
	{
		
		
		Ferry f = (Ferry)other;

		
		return (this.getmaxload() == f.getmaxload() &&
			this.getmaxspeed() == f.getmaxspeed()) ;
	 
  
			
	}
}







}