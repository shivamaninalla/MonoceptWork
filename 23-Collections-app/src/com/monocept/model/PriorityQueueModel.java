package com.monocept.model;

public class PriorityQueueModel {
	
	private String description;
	private int priority;
	
	

	public PriorityQueueModel(String description, int priority) {
		super();
		this.description = description;
		this.priority=priority;
	}



	@Override
	public String toString() {
		return "PriorityQueue [description=" + description + ", priority=" + priority + "]";
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getPriority() {
		return priority;
	}



	public void setPriority(int priority) {
		this.priority = priority;
	}






}
