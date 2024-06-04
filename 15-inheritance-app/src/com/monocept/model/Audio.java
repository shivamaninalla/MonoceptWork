package com.monocept.model;

public class Audio extends Playable{
	
	private String title;
	

	public Audio() {
		super();
	}

	public Audio(String title) {
		super();
		this.title = title;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Audio is playing: "+title);
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Audio is paused: "+title);
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Audio is stopped: "+title);
		
	}

}
