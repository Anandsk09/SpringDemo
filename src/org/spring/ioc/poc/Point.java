package org.spring.ioc.poc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Point implements BeanNameAware/* ,BeanPostProcessor */{

	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public void setBeanName(String arg0) {
		System.out.println("set Bean Name called:  "+arg0);
		// TODO Auto-generated method stub
		
	}
	/*
	 * @Override public Object postProcessAfterInitialization(Object arg0, String
	 * arg1) throws BeansException { // TODO Auto-generated method stub
	 * System.out.println("postprocessor"); return arg1; }
	 * 
	 * @Override public Object postProcessBeforeInitialization(Object arg0, String
	 * arg1) throws BeansException { // TODO Auto-generated method stub
	 * System.out.println("postprocessor3"); return null; }
	 */
	
	
}
