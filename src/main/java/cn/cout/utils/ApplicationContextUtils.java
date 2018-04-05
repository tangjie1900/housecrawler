package cn.cout.utils;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtils {

	private static AbstractApplicationContext atx;

	public static void initAbstractApplicationContext(String[] configLocation) throws Exception {
		atx = new ClassPathXmlApplicationContext(configLocation);
		atx.registerShutdownHook();
	}

	public static AbstractApplicationContext getAbstractApplicationContext() {
		return atx;
	}

}
