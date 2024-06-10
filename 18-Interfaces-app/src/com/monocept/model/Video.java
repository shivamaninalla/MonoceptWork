package com.monocept.model;

public class Video implements Playable{
	private String title;

	
	private int resolution;


	public Video(String title, int resolution) {
		super();
		this.title = title;
		this.resolution = resolution;
	}


	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Video is Playing. Resolution is: "+resolution+" Title is: "+title);
	}


	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Video is paused. Resolution is: "+resolution+" Title is: "+title);
	}


	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Video is stopped. Resolution is: "+resolution+" Title is: "+title);
	}
	

}
