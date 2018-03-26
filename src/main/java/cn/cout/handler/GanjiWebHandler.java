package cn.cout.handler;

public class GanjiWebHandler implements IWebHandler {

	private static final String webrule = "http://{cityname}.ganji.com/fang1";

	private String  webUrl="";

	public String getWebUrl() {
		return this.webUrl;
	}

	public void parseRule(String citynameUrlAbb) {


	}

	/**
	 * 解析web页面
	 *
	 * @param webUrl 网站的地址
	 */
	public void parseWebHtml(String webUrl) {

	}

}
