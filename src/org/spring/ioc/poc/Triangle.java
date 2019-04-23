package org.spring.ioc.poc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape, ApplicationContextAware, BeanNameAware/* ,InitializingBean,DisposableBean */{
	
	Point pointa;
	Point pointb;
	Point pointc;
	ApplicationContext ctx=null;
	
	
@Override
	public String toString() {
		return "Triangle [pointa=" + pointa + ", pointb=" + pointb + ", pointc=" + pointc + "]";
	}



public Point getPointa() {
		return pointa;
	}



	public void setPointa(Point pointa) {
		this.pointa = pointa;
	}



	public Point getPointb() {
		return pointb;
	}



	public void setPointb(Point pointb) {
		this.pointb = pointb;
	}



	public Point getPointc() {
		return pointc;
	}



	public void setPointc(Point pointc) {
		this.pointc = pointc;
	}



public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}



public void draw()
{
	System.out.println( toString());
}



@Override
public void setApplicationContext(ApplicationContext ctx) throws BeansException {
	// TODO Auto-generated method stub
	ctx=this.ctx;
	
}



@Override
public void setBeanName(String beanName) {
	System.out.println("bean name is:"+beanName);
	// TODO Auto-generated method stub
	
}

	/*
	 * public void myDestroy() { System.out.println("Destroycalled"); }
	 */
	/*
	 * 
	 * 
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("called on Initialization for Traingle"); // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @Override public void destroy() throws Exception { // TODO Auto-generated
	 * method stub System.out.println("SHutdown Call Traingle"); }
	 */
}
