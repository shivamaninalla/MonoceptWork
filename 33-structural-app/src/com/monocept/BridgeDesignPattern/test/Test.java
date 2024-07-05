package com.monocept.BridgeDesignPattern.test;


import com.monocept.BridgeDesignPattern.model.Circle;
import com.monocept.BridgeDesignPattern.model.GreenColour;
import com.monocept.BridgeDesignPattern.model.IColour;
import com.monocept.BridgeDesignPattern.model.RedColour;
import com.monocept.BridgeDesignPattern.model.Shape;
import com.monocept.BridgeDesignPattern.model.Square;

public class Test {

	
		public static void main(String[] args) {
	        IColour red = new RedColour();
	        IColour green = new GreenColour();

	        Shape redCircle = new Circle(red);
	        Shape greenSquare = new Square(green);

	        redCircle.draw();
	        greenSquare.draw();

		}

}
