package cn.cout.utils;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtils {

	public static <T> T getBean(String[] configLocation, String beanName) throws Exception {
		AbstractApplicationContext atx = new ClassPathXmlApplicationContext(configLocation);
		atx.registerShutdownHook();
		return (T) atx.getBean(beanName);
	}
}
