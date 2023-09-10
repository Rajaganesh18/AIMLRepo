package com.mphasis;

public class BillCalculator {

	public static void main(String[] args) {
		int units=250;
		double  billpay =0;
		if(units < 100) {
			billpay=units*1.20;
		}
		else if(units<300) {
			billpay=100*1.20+(units-100)*2;
		}
		System.out.println("The elec bill for "+units + " "+billpay);
	}

}
