package org.spring.ioc.poc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape{
	
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	

	@Override
	public void draw() {
		System.out.println("Drawing squre with coordiantes"+toString());
		
	}


	public Point getA() {
		return a;
	}

@Resource(name="point1")
	public void setA(Point a) {
		this.a = a;
	}


	public Point getB() {
		return b;
	}

	@Resource(name="point2")
	public void setB(Point b) {
		this.b = b;
	}


	public Point getC() {
		return c;
	}

	@Resource(name="point3")
	public void setC(Point c) {
		this.c = c;
	}


	public Point getD() {
		return d;
	}

	@Resource(name="center")
	public void setD(Point d) {
		this.d = d;
	}


	@Override
	public String toString() {
		return "Square [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	@PostConstruct
	public void initialize()
	{
		System.out.println("Square Initialization");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Square Destruction");
	}
}
