package com.demo.test.test;

import com.demo.test.test.Circle.Draw;

public class ClaTest {

	public static void main(String[] args) {
//		Draw d = new Draw();
		Circle c = new Circle();
//		double radius = c.radius;
		
//		System.out.println(radius);
		System.out.println(c.radius);
		Draw draw = c.new Draw();
		draw.drawSahpe();
		
	}
}
