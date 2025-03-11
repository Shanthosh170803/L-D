package com.mph.model;

import java.io.Serializable;

//POJO CLASS -> Plain Old Java Object
public class Salary1 extends Salary implements Serializable{
	private int basic;
	private double hra;
	private double pf;
	private double gross;
	private double net;

	public Salary1() {
		super();	
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public double getHra() {
		return hra;
	}
	public void setHra() {
		this.hra = basic * 0.01;
	}
	public double getPf() {
		return pf;
	}
	public void setPf() {
		this.pf = basic * 0.05;
	}
	public double getGross() {
		return gross;
	}
	public void setGross() {
		this.gross = basic + hra + pf;
	}
	public double getNet() {
		return net;
	}
	public void setNet() {
		this.net = gross -pf;
	}

	@Override
	public String toString() {
		return "Salary1 [basic=" + basic +", hra=" + hra + ", pf=" + pf + ", gross=" + gross
				+ ", net=" + net + "]";
	}

}
