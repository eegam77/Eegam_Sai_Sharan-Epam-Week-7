package com.epam.SaiSharan.DesignPatterns.DesignPatterns;

public class TemplatePattern {

	public static void main(String[] args) {
		Shapes circleDiagram= new CircleShapes();
		circleDiagram.DrawShape();
		Shapes rectangleDiagram= new RectangleShape();
		rectangleDiagram.DrawShape();
	}

}
