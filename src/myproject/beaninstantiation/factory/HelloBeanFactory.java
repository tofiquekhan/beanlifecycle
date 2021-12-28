package myproject.beaninstantiation.factory;

import myproject.beaninstantiation.beans.HelloBean;

public class HelloBeanFactory {

	public HelloBean getHelloBeanInstance() {
		System.out.println("getHelloBeanInstance() - HelloBeanFactory");
		return new HelloBean();
	}
}
