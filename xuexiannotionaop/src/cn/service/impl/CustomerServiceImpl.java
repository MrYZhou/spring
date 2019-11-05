package cn.service.impl;

import org.springframework.stereotype.Service;

import cn.service.CustomerService;

@Service("customerService")
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
