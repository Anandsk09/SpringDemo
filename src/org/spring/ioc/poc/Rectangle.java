package org.spring.ioc.poc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape,ApplicationEventPublisherAware{
	
	private Point a;
	private Point b;
	private ApplicationEventPublisher applicationEventPublisher;
	

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle with coordiantes"+toString());
		applicationEventPublisher.publishEvent(new MyEvent(this));
		
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





	@Override
	public String toString() {
		return "Square [a=" + a + ", b=" + b + "]";
	}
	@PostConstruct
	public void initialize()
	{
		System.out.println("Rectangle Initialization");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Rectangle Destruction");
	}


	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher=applicationEventPublisher;
		
	}
}
