package org.spring.ioc.poc;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent{

	public MyEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n Custom Event Occured";
	}
	

}
