package myproject.beaninstantiation.beans;

public class HelloBean {

	static {
		System.out.println("HelloBean class loading......");
	}
	
	public  HelloBean() {
		System.out.println("HelloBean class Instantiation..........");
	}
	
	public String sayHello() {
		return "Hello User!";
	}
	
	
}
