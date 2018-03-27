package cn.cout.handler;

import cn.cout.utils.WebParseUtil;
import cn.cout.utils.WebRuleUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.UUID;

public class SameCity58WebHandler implements IWebHandler {

	private String webUrl;

	private static final String webrule = "http://{cityname}.58.com/chuzu/pn{page}/?PGTID={pid}&ClickID={cid}";

	private String htmlString;

	public String getWebUrl() {
		return this.webUrl;
	}

	public String getHtmlString() {
		return htmlString;
	}

	public void parseRule(String citynameUrlAbb) {
		String temp__weburl = WebRuleUtils.getWebRule("\\{cityname\\}", webrule, citynameUrlAbb);
		this.webUrl = temp__weburl.replace("{pid}", createGUID()).replace("{cid}", "1");
	}


	/**
	 * 解析web页面
	 *
	 * @param webUrl 网站的地址
	 */
	public void parseWebHtml(String webUrl) {
		for (int i = 1; i < 70; i++) {
			String singleWeburl = webUrl.replace("{page}", "1");
			parseSingleWebHtml(singleWeburl);
		}
	}


	public void parseSingleWebHtml(String singleWeburl) {
		this.htmlString = WebParseUtil.getHtml(singleWeburl);
		parseHtmlString(htmlString);
	}

	public void parseHtmlString(String htmlString) {
		Document doc = Jsoup.parse(htmlString);
		Elements elements = doc.select("ul.listUl");
		Elements childeles = elements.get(0).children();
		//获得list
		int listSize = childeles.size();
		for (int i = 0; i < listSize; i++) {
			try {
				Element ele = childeles.get(i);
				String logrString = ele.attr("logr");
				//房子的id
				String houseid = logrString.split("_")[3];

				Element websourceELe = ele.select("div.img_list>a").get(0);
				String websourceEstring = websourceELe.attr("href");

				Element fisrtele = websourceELe.select("img").get(0);
				String fisrtimageurl = fisrtele.attr("lazy_src");

				Element hpouseroomstype = ele.select("div.des>h2>a").get(0);
				String hpouseroomstypestring = hpouseroomstype.html();
				String hpousesourcetring = hpouseroomstype.attr("href");

				Element roomele = ele.select("p.room").get(0);
				String roomstring = roomele.html();

				String updatestring = ele.select("div.sendTime").get(0).html();
				String price = ele.select("div.money").get(0).html();

				System.out.println(ele);
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}

		System.out.println("end");
	}


	public String createGUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}

}
