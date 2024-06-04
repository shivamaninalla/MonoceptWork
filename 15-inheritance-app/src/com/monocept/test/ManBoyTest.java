package com.monocept.test;

import com.monocept.model.Boy;
import com.monocept.model.Man;

public class ManBoyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy boy=new Boy();
		
		boy.eat();
		boy.sleep();
		boy.play();
		boy.work();
		
		Man man=new Man();
		man.eat();
		man.play();
		man.work();
		
		Man bigMan=new Boy();
		bigMan.eat();
		bigMan.play();
		bigMan.work();

	}

}
