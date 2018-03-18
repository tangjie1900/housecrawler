package cn.cout.controller;

import cn.cout.entity.*;
import cn.cout.service.IWebSiteService;
import cn.cout.utils.ApplicationContextUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 1.读取要抓取的网站配置文件 rule.properties
 * 2.args 中传入的是要抓取的城市的名字
 * 3.根据城市的handler 以及 要抓去的网站 rule 生成  url
 * 4.抓取数据，入库
 * <p>
 * <p>
 * 以上海为例子:
 * 58同城： http://sh.58.com/chuzu/?PGTID=0d100000-0000-286f-d203-2df4d2e37c9a&ClickID=2
 * 赶集：   http://sh.ganji.com/fang1/
 * 自如：   http://sh.ziroom.com/z/nl/z2.html
 * 链家：   https://sh.lianjia.com/zufang/
 */


public class ProgramController {

	@Autowired
	private static IWebSiteService webSiteService;

	public static void main(String[] args) {
		args = new String[]{"classpath:spring/spring.xml"};
		String beanName = "argsEntity";
		try {
			ArgsEntity argsEntity = ApplicationContextUtils.getBean(args, beanName);

			System.out.println(1);

		} catch (Exception e) {

		}
		//argsdao

		System.out.println(1);
//		String cityname = argsDao.getCityName();
//		String webnames = argsDao.getWebNames();
//
//		if (cityname.length() <= 0 || cityname == null)
//			return;
//		if (webnames.length() <= 0 || webnames == null)
//			webnames = "58同城;赶集;自如;链家";
//
//		String[] arrs_webnames = webnames.split(";");

	}


}
