package com.monocept.test;

import com.monocept.model.Audio;
import com.monocept.model.Playable;
import com.monocept.model.Video;

public class TestPlayable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Audio audio=new Audio("Shivamani");
		//Video video=new Video(420,"Hi");
		
		Playable playable=new Audio("Telusa Manasa");
		
		playable.play();
		playable.pause();
		playable.stop();
		
		
		Playable playable1=new Video(420,"Pushpa");
		playable1.play();
		playable1.pause();
		playable1.stop();
		
		Playable playable2=new Audio();
		Playable playable3=new Video();
		
		

	}

}
