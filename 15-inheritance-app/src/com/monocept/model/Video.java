package com.monocept.model;

public class Video extends Playable{
	
	private int resolution;
	private String title;
	

	public Video() {
		super();
	}

	public Video(int resoltuion, String title) {
		super();
		this.resolution = resoltuion;
		this.title = title;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Video is Playing. Resolution is: "+resolution+"Title is: "+title);
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Video is paused. Resolution is: "+resolution+"Title is: "+title);
		
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Video is stopped. Resolution is: "+resolution+"Title is: "+title);
		
	}
	
	

}
