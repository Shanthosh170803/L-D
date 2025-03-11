package com.mph.model;

import java.io.Serializable;

//POJO CLASS -> Plain Old Java Object
public class Salary2 extends Salary implements Serializable {
	private int basic;
	private int hrs;
	private int days;
	private int hrswages;
	private int daywages;

	public Salary2() {
		super();	
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public int getHrswages() {
		return hrswages;
	}
	public void setHrswages() {
		this.hrswages = this.daywages*this.hrs;
	}
	public int getDaywages() {
		return daywages;
	}
	public void setDaywages() {
		this.daywages = this.basic*this.days;
	}

	@Override
	public String toString() {
		return "Salary2 [basic=" + basic +", hrs=" + hrs + ", days=" + days + ", hrswages="
				+ hrswages + ", daywages=" + daywages + "]";
	}

}
