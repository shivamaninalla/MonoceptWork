package com.monocept.ocp.solution;

import com.monocept.ocp.model.FestivalType;

public class FixedDepositSolution {
	
	private int accountNumber;
	private String name;
	private double principle;
	private int duration;
	
	public FixedDepositSolution(int accountNumber, String name, double principle, int duration) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "FixedDepositSolution [accountNumber=" + accountNumber + ", name=" + name + ", principle=" + principle
				+ ", duration=" + duration + "]";
	}
	

}
