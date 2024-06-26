package com.monocept.test;

import com.monocept.model.AudioPlayer;
import com.monocept.model.MediaPlayer;
import com.monocept.model.PodcastPlayer;
import com.monocept.model.VideoPlayer;

public class MediaPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediaPlayer mediaPlayer=new AudioPlayer();
		mediaPlayer.start();
		mediaPlayer.stop();
		MediaPlayer.supportedFiles();
		
		mediaPlayer=new VideoPlayer();
		mediaPlayer.start();
		mediaPlayer.stop();
		MediaPlayer.supportedFiles();
		
		mediaPlayer=new PodcastPlayer();
		mediaPlayer.start();
		mediaPlayer.stop();
		MediaPlayer.supportedFiles();
		
		

	}

}
