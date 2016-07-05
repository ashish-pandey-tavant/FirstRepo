package com.test.structuraldesignpattern.facade;

public class ShapeMaker {

	CircleShape circleShape;
	RectangleShape rectangleShape;
	SquareShape squareShape;
	ShapeMaker(){
		circleShape = new CircleShape();
		rectangleShape = new RectangleShape();
		squareShape = new SquareShape();
	}
	
     	public void drawCircle(){
     		circleShape.draw();
	   }
	   public void drawRectangle(){
		   rectangleShape.draw();
	   }
	   public void drawSquare(){
		   squareShape.draw();
	   }
}
