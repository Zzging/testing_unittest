package com.unittest.testing;

public class fahrenheit {
	private double celcius;
	
	public double getCelcius() {
		return celcius;
	}
	
	public void input (double celcius) {
		this.celcius = celcius;
	}
	public boolean isBoumd(double celcius) {
		boolean isResult;
		if (celcius <= 1000 && celcius>=-1000) {
			isResult = true;
		}else {
			isResult = false;
		}
		return isResult;
	}
}
