package cn.service.impl;

import cn.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public void saveCustomer(int i) {
		// TODO Auto-generated method stub
		System.out.println("保存了客户"+i);
	}

	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub
		System.out.println("更新了客户");
	}

}
