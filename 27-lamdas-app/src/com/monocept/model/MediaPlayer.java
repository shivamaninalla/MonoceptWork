package com.monocept.model;

public interface MediaPlayer {
	
	void start();
	default void stop() {
		System.out.println("Media stopped");
		
	}
	static void supportedFiles() {
		 
			System.out.println("Supported files: .mp3, .mp4");
			
		
	}

}
