package cn.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.service.CustomerService;

public class AopXmlTest {
//	@Test
//	public  void test1() {
//		
//		ApplicationContext aContext=new ClassPathXmlApplicationContext("bean.xml");
//		CustomerService cs=(CustomerService) aContext.getBean("customerService");
//		cs.saveCustomer();
//	}
	public static void main(String[] args) {
		ApplicationContext aContext=new ClassPathXmlApplicationContext("bean.xml");
		CustomerService cs=(CustomerService) aContext.getBean("customerService");
		cs.saveCustomer(2);
	}
	
}
