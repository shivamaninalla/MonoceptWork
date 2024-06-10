package com.monocept.test;

import com.monocept.model.OuterClass;
import com.monocept.model.OuterClass.InnerClass;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outerClass=new OuterClass();
		outerClass.display();
		OuterClass.InnerClass innerClass=outerClass.new InnerClass();
        innerClass.displayInner();
        //innerClass.display();
        //outerClass.displayInner();
        }

}
