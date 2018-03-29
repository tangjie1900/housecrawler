package cn.cout.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtils {

	public static <T> T getBean(String[] configLocation, String beanName) throws Exception {
		ApplicationContext atx = new ClassPathXmlApplicationContext(configLocation);
		return (T) atx.getBean(beanName);
	}
}
