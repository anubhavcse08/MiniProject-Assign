package com.wipro.eb.entity;

public class Commercial extends Connection{

	public Commercial(int previousReading, int currentReading, float[] slabs) {
		super(previousReading, currentReading, slabs);
	}

	@Override
	public float computeBill() {
		float billAmount;
		int diffReading=getCurrentReading()-getPreviousReading();
		if(diffReading<=50)
			billAmount=(float) (diffReading * 5.2);
		else if(diffReading<=100)
			billAmount=(float) ((50*2.3)+(diffReading * 6.8));
		else
			billAmount=(float) ((50*2.3)+(100*4.2)+(diffReading * 8.3));
		
		return billAmount;
	}

}
