package cn.cout.entity;

public class RuleEntity {

	/**
	 * 要爬取的网站规则
	 */
	private String crawlerWebUrl;

	/**
	 * 城市名称 如beijing shanghai shenzhen
	 */
	private String cityName;


	/**
	 * 爬取的类型
	 */
	private String houseType;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public String getCrawlerWebUrl() {
		return crawlerWebUrl;
	}

	public void setCrawlerWebUrl(String crawlerWebUrl) {
		this.crawlerWebUrl = crawlerWebUrl;
	}
}
