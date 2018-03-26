package cn.cout.service;

import cn.cout.entity.ArgsEntity;
import cn.cout.handler.IWebHandler;

public interface IWebSiteService {
	void set_Webhandler(IWebHandler m_webhandler);

	void excute(String citynameUrlAbb, String cityname);
}
