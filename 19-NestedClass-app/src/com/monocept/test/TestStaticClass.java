package com.monocept.test;

import com.monocept.model.StaticClass;
import com.monocept.model.StaticClass.StaticInnerClas;


public class TestStaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass staticClass=new StaticClass();
		staticClass.display();
		
		StaticInnerClas innerClass=new StaticInnerClas();
		StaticInnerClas.displayInner();
		
		StaticClass.StaticInnerClas innerClass1=new StaticClass.StaticInnerClas();
		StaticInnerClas.displayInner();
		
		innerClass.displayInner();
		innerClass1.displayInner();
		

	}

}
