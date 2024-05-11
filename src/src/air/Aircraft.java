package air;

import fer.Ferry;

public class Aircraft  extends Transportation {
protected double price;
protected double maxElevation;
protected static long serialNumCtr = 75000;
protected long serialNumber ;

public Aircraft() {
	price=10000;
	maxElevation=20000;
	serialNumber=serialNumCtr++;
}

public Aircraft(double price, double maxElevation) {
	this.price=price;
	this.maxElevation=maxElevation;
}

//copy constructor
public Aircraft(Aircraft other) {
	this.price=other.price;
	this.maxElevation=other.maxElevation;
	serialNumber=serialNumCtr++;
}
protected double getPrice() {
    return price;
}

// Protected setter for price
protected void setPrice(double price) {
    this.price = price;
}

// Protected getter for maxElevation
protected double getMaxElevation() {
    return maxElevation;
}

// Protected setter for maxElevation
protected void setMaxElevation(double maxElevation) {
    this.maxElevation = maxElevation;
}
public long getSerialNumber() {
    return serialNumber;
}


public String toString() {
    return "Aircraft – serial #" + getSerialNumber() +" has a price of "+ getPrice()+"$ , and a maximum elevation of "+ getMaxElevation()+" meters.\n";
}

public boolean equals(Object other)
{
if (other == null || this == null || this.getClass() != other.getClass())
	return false;
else
{
	
	
	Aircraft f = (Aircraft) other;

	
	return (this.getPrice() == f.getPrice() &&
		this.getMaxElevation() == f.getMaxElevation()) ;
 

		
}
}



}