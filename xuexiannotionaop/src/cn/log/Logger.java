package cn.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("logger")
@Aspect
public class Logger {
/**
 * ������¼�������ں��Ĵ���֮ǰ��
 * 
 * */
	@Before("execution(* *..*.saveCustomer(..))")
	public void logbeforeinvoke() {
		System.out.println("��¼����invoke֮ǰ");
	}
}
