package com.training.domains;

import com.training.ifaces.Automobile;

public class SportsBike implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Yellow";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 200000.00;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "xyz";
	}

}
