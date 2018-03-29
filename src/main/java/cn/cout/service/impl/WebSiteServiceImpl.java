package cn.cout.service.impl;

import cn.cout.dao.IHouseIDDao;
import cn.cout.entity.ArgsEntity;
import cn.cout.entity.HouseID;
import cn.cout.handler.IWebHandler;
import cn.cout.service.IWebSiteService;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.springframework.beans.factory.annotation.Autowired;

public class WebSiteServiceImpl implements IWebSiteService {



	private IWebHandler m_webhandler;

	public void set_Webhandler(IWebHandler m_webhandler) {
		this.m_webhandler = m_webhandler;
	}

	public void excute(String citynameUrlAbb, String cityname) {

		m_webhandler.parseRule(citynameUrlAbb);
		String weburl = m_webhandler.getWebUrl();
		m_webhandler.parseWebHtml(weburl);
	}

}
