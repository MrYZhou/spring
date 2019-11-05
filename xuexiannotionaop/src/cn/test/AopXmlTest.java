package cn.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.service.CustomerService;
import cn.springconfig.SpringConfiguration;

public class AopXmlTest {
//	@Test
//	public  void test1() {
//		
//		ApplicationContext aContext=new ClassPathXmlApplicationContext("bean.xml");
//		CustomerService cs=(CustomerService) aContext.getBean("customerService");
//		cs.saveCustomer();
//	}
	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//		CustomerService cs = (CustomerService) ac.getBean("customerService");
		ApplicationContext aContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		CustomerService cs=(CustomerService) aContext.getBean("customerService");
		cs.saveCustomer(4);
	}
	
}
