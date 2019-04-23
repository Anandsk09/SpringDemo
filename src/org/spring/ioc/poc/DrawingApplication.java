package org.spring.ioc.poc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		//applicationContext.registerShutdownHook();
		//Shape shape=(Triangle) applicationContext.getBean("abc");
		Shape shape2=(Circle) applicationContext.getBean("circle");
		//shape.draw();
		shape2.draw();
		// Getting Beans of Point Class
		/*
		 * Point point=(Point) applicationContext.getBean("point1"); Point
		 * point2=(Point) applicationContext.getBean("point2"); Point point3=(Point)
		 * applicationContext.getBean("point3");
		 * System.out.println("point..."+point+"point2..."+point2+"point3..."+point3);
		 */
			 
		// Triangle triangle1=(Triangle) applicationContext.getBean("triangle2");
		// triangle1.draw();
		
	}

}
