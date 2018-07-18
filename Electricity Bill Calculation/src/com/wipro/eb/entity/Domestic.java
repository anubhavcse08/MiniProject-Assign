package com.wipro.eb.entity;

public class Domestic extends Connection {

	public Domestic(int previousReading, int currentReading, float[] slabs) {
		super(previousReading, currentReading, slabs);
	}

	@Override
	public float computeBill() {
		float billAmount;
		int diffReading=getCurrentReading()-getPreviousReading();
		if(diffReading<=50)
			billAmount=(float) (diffReading * 2.3);
		else if(diffReading<=100)
			billAmount=(float) ((50*2.3)+(diffReading * 4.2));
		else
			billAmount=(float) ((50*2.3)+(100*4.2)+(diffReading * 5.5));
		
		return billAmount;
	}

}
