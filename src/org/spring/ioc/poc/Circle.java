package org.spring.ioc.poc;

public class Circle implements Shape {
	
	private Point center;
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside draw of Circle ..Point is: "+center.getX() +","+center.getY());
	}

}
