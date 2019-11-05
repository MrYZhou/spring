package cn.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("logger")
@Aspect
public class Logger {
/**
 * 用来记录操作，在核心代码之前。
 * 
 * */
	@Before("execution(* *..*.saveCustomer(..))")
	public void logbeforeinvoke() {
		System.out.println("记录，在invoke之前");
	}
}
