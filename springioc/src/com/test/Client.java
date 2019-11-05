package com.test;

import javax.swing.text.html.CSS;

import org.springframework.beans.propertyeditors.CharsetEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.inter.CustomerDao;
import com.service.inter.CustomerService;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
		CustomerService cs = (CustomerService) applicationContext.getBean("customerservice");
		//cs.saveCustomer();
		System.out.println(cs);
		CustomerDao cDao=(CustomerDao) applicationContext.getBean("customerdao");
		System.out.println(cDao);
	}
}
