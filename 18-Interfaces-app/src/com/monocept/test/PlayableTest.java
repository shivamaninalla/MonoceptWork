package com.monocept.test;

import com.monocept.model.Audio;
import com.monocept.model.Playable;
import com.monocept.model.Video;

public class PlayableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Playable playable=new Audio("Telusa ");
//		
//		playable.play();
//		playable.pause();
//		playable.stop();
//		
//		
//		Playable playable1=new Video("Pushpa",420);
//		playable1.play();
//		playable1.pause();
//		playable1.stop();
		
		//Playable playable2=new Audio();
		//Playable playable3=new Video();
		
		Playable playable;
		
		playable=new Audio("Telusa Manasa");
		playable.play();
		playable.pause();
		playable.stop();
		
		playable=new Video("SuryaVamsham",420);
		playable.play();
		playable.pause();
		playable.stop();
	}

}
