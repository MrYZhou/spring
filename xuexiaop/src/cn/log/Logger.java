package cn.log;

public class Logger {
/**
 * 用来记录操作，在核心代码之前。
 * 
 * */
	public void logbeforeinvoke() {
		System.out.println("记录，在invoke之前");
	}
}
