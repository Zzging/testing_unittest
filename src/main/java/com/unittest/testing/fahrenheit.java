package com.unittest.testing;

public class fahrenheit {
	private double celcius;
	private double fahrenheit;
	
	public int araikoodai() {
		return 0;
	}
	
	public double getCelcius() {
		return celcius;
	}
	
//	public void setCelcius(double celcius) {
//		this.celcius = celcius;
//	}
	public void input (double celcius) {
		this.celcius = celcius;
	}
	
	
	public boolean isBound(double celcius) {
		boolean isResult;
		if (celcius <= 1000 && celcius>=-1000) {
			isResult = true;
		}else {
			isResult = false;
		}
		return isResult;
	}
	
	public void cal() {
		double fahrenheit = this.celcius*9/5+32;
		this.fahrenheit = fahrenheit;
	}
	
//	public double calculate() {
//		double fahrenheit = this.celcius*9/5+32;
//		return fahrenheit;
//	}
	
	public String toString() {
		//$number celcius =$number fahrenheit
//		double fahrenheit =this.calculate();
		
		this.cal();
		double celcius =this.getCelcius();
		return Math.round(celcius)+"celcius ="+Math.round(this.fahrenheit)+"fahrenheit =";
	}
}
