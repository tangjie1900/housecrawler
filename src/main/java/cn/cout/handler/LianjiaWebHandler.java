package cn.cout.handler;

public class LianjiaWebHandler implements IWebHandler {

	private static final String webruleTemplate = "https://{cityname}.lianjia.com/zufang/";

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
