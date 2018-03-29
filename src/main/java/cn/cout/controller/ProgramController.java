package cn.cout.controller;

import cn.cout.dao.IHouseIDDao;
import cn.cout.entity.*;
import cn.cout.handler.*;
import cn.cout.service.IWebSiteService;
import cn.cout.service.impl.WebSiteServiceImpl;
import cn.cout.utils.ApplicationContextUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 1.读取要抓取的网站配置文件
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

	private static IWebSiteService webSiteService;

	public static Map<String, String> webhandlerHashMap = new HashMap<String, String>();


	private static cn.cout.dao.IHouseIDDao IHouseIDDao;

	public static void main(String[] args) {
		args = new String[]{"classpath:spring/spring.xml", "classpath:spring/spring-dao.xml", "classpath:mapper/HouseIDMapper.xml", "classpath:mybatis.xml"};
		String beanName = "argsEntity";
		try {

			ArgsEntity argsEntity = ApplicationContextUtils.getBean(args, beanName);

			if (argsEntity == null)
				return;

			//城市名字拼音
			String cityname = argsEntity.getCityName();

			//城市中文名字
			String citynameCN = argsEntity.getCityNameCN();

			//城市名字 url 缩写
			String citynameUrlAbb = argsEntity.getCityNameUrlAbb();

			//网站名字
			String[] arrs_Webnames = checkRequestWebNames(argsEntity.getWebNames());

			initHashMap();

			webSiteService = new WebSiteServiceImpl();

			IHouseIDDao= ApplicationContextUtils.getBean(args, "IHouseIDDao");
			HouseID houseID = new HouseID();
			houseID.setCityid(1);
			houseID.setWebid(3);
			houseID.setHouseid("13_325435435");
			try {
				IHouseIDDao.add(houseID);
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}

			for (int i = 0; i < arrs_Webnames.length; i++) {

				IWebHandler webhandler = (IWebHandler) Class.forName(webhandlerHashMap.get(arrs_Webnames[i])).newInstance();
				if (null == webhandler) {
					continue;
				}
				webSiteService.set_Webhandler(webhandler);
				webSiteService.excute(citynameUrlAbb, cityname);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void initHashMap() {
		webhandlerHashMap.put("58同城", "cn.cout.handler.SameCity58WebHandler");
		webhandlerHashMap.put("赶集", "cn.cout.handler.GanjiWebHandler");
		webhandlerHashMap.put("自如", "cn.cout.handler.ZiruWebHandler");
		webhandlerHashMap.put("链家", "cn.cout.handler.LianjiaWebHandler");
	}


	public static String[] checkRequestWebNames(String webnames) {
		if (webnames == null || webnames.length() <= 0)
			webnames = "58同城;赶集;自如;链家";
		return webnames.split(";");
	}


}
