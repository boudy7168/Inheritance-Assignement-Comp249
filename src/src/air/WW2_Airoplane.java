package air;

import wt.WheeledTransportation;

public class WW2_Airoplane extends Aircraft {

	protected boolean hasTwinEngine;
	protected static long serialNumCtr = 80000;
	protected long serialNumber ;
	
	
	public WW2_Airoplane() {
		super();
		hasTwinEngine=true;
	}
	
	public WW2_Airoplane(double price, double maxElevation, boolean hasTwinEngine) {
		
		super(price,maxElevation);
		this.hasTwinEngine=hasTwinEngine;
	}
	
	public WW2_Airoplane(WW2_Airoplane other) {
		super(other);
		this.hasTwinEngine=other.hasTwinEngine;
	}
	public void sethastwinengine(boolean twin) {
		hasTwinEngine=twin;
	}
	public boolean gethastwinengine() {
		return hasTwinEngine;
	}
	public String hasTwin() {
		if(this.hasTwinEngine==true) {
			return"Has a twin engine";
		}
		else {
			return "Doesn't have a twin engine";
		}
	}
	 

public String toString() {
    return "This WW2 airoplane with – serial #" + getSerialNumber() +" has a price of "+ getPrice()+"$ , and a maximum elevation of "+ getMaxElevation()+" meters and "+this.hasTwin()+".\n";
}

public long getSerialNumber() {
	
	return serialNumber;
}
public boolean equals(Object other)
{
if (other == null || this == null || this.getClass() != other.getClass())
	return false;
else
{
	
	
	WW2_Airoplane f = (WW2_Airoplane) other;

	
	return (this.getPrice() == f.getPrice() &&
		this.getMaxElevation() == f.getMaxElevation()  && this.gethastwinengine()==f.gethastwinengine()) ;
 

		
}
}

	


}