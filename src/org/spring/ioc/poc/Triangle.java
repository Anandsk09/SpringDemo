package org.spring.ioc.poc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;

public class Triangle implements Shape, ApplicationContextAware, BeanNameAware/* ,InitializingBean,DisposableBean */{
	
	Point pointa;
	Point pointb;
	Point pointc;
	private ApplicationContext ctx;
	//To Declare the MessageSource Interface Reference inside the class
	@Autowired
	private MessageSource messageSource;
	
	
@Override
	public String toString() {
	
		return "";
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
	//System.out.println(" Triangle [pointa=" + pointa + ", pointb=" + pointb + ", pointc=" + pointc + "]");
	System.out.println(this.messageSource.getMessage("triangle.greetings",null,"Default Greet2",null));
	System.out.println(this.messageSource.getMessage("triangle.paint",new Object[] {(pointa),(pointb),(pointc)},"Default Paint",null));
		  
		
}



@Override
public void setApplicationContext(ApplicationContext ctx) throws BeansException {
	// TODO Auto-generated method stub
	ctx=this.ctx;
		
		 // String msg2=ctx.getMessage("greetings2",null,"Default Greet2",null);
		  
		 //System.out.println(msg2);
		 
	
}



@Override
public void setBeanName(String beanName) {
	System.out.println("bean name is:"+beanName);
	// TODO Auto-generated method stub
	
}



public ApplicationContext getCtx() {
	return ctx;
}



public void setCtx(ApplicationContext ctx) {
	this.ctx = ctx;
}



public MessageSource getMessageSource() {
	return messageSource;
}



public void setMessageSource(MessageSource messageSource) {
	this.messageSource = messageSource;
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
