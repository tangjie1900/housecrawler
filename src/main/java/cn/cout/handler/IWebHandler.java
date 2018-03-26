package cn.cout.handler;

public interface IWebHandler {

	String getWebUrl();

	void parseRule(String citynameUrlAbb);

	void parseWebHtml(String webUrl);
}
