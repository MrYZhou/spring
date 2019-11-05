package com.service.impl;

import com.dao.impl.CustomerDaoImpl;
import com.dao.inter.CustomerDao;
import com.service.inter.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	CustomerDao c=new CustomerDaoImpl();
	@Override
	public void saveCustomer() {
		// TODO Auto-generated method stub
		c.saveCustomer();
	}

}
