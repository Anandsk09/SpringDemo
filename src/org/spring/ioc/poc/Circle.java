package org.spring.ioc.poc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	
	private Point center;
	
	public Point getCenter() {
		return center;
	}
	//@Required
	/*
	 * @Autowired
	 * 
	 * @Qualifier("circleRelatedBean")
	 */
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside draw of Circle ..Point is: "+center.getX() +","+center.getY());
	}
	//JSR Annotation for Initialization
	@PostConstruct
	public void initialize()
	{
		System.out.println("Circle initialization");
	}
	//JSR Annotation for Destruction
	@PreDestroy
	public void destroy()
	{
		System.out.println("Circle Destruction");
	}

}
