package cn.cout.entity;

public class ArgsEntity {

	/**
	 * 爬取的城市名字
	 */
	private String cityName;

	/**
	 * 要爬取的网站名字
	 */
	private String webNames;

	/**
	 * 城市在汉语的写法
	 */
	private String cityNameCN;

	/**
	 * 城市在url里的缩写
	 */
	private String cityNameUrlAbb;

	/**
	 * 爬取数据的方式
	 */
	private String houseType;


	public String getCityNameCN() {
		return cityNameCN;
	}

	public void setCityNameCN(String cityNameCN) {
		this.cityNameCN = cityNameCN;
	}

	public String getCityNameUrlAbb() {
		return cityNameUrlAbb;
	}

	public void setCityNameUrlAbb(String cityNameUrlAbb) {
		this.cityNameUrlAbb = cityNameUrlAbb;
	}

	public String getWebNames() {
		return webNames;
	}

	public void setWebNames(String webNames) {
		this.webNames = webNames;
	}

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

}
