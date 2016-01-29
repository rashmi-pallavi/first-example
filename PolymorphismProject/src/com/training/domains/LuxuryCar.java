package com.training.domains;

import com.training.ifaces.Automobile;

public class LuxuryCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Blue";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 600000.00;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Audi";
	}

}
