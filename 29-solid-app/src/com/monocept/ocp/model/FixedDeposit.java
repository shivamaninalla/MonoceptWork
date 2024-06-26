package com.monocept.ocp.model;

public class FixedDeposit {
	
	private int accountNumber;
	private String name;
	private double principle;
	private int duration;
	private FestivalType festivalType;
	public FixedDeposit(int accountNumber, String name, double principle, int duration, FestivalType festivalType) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festivalType = festivalType;
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
	public FestivalType getFestivalType() {
		return festivalType;
	}
	public void setFestivalType(FestivalType festivalType) {
		this.festivalType = festivalType;
	}
	
	public double interestRate() {
		
		if(festivalType==festivalType.NEWYEAR)
			return 8;
		if(festivalType==festivalType.DIWALI)
			return 8.5;
		if(festivalType==festivalType.HOLI)
			return 7.5;
		return 6.5;
		
		
	}
	
	public double calculateSimpleInterest() {
		return principle*duration*interestRate()/100;
	}
	
	
}
