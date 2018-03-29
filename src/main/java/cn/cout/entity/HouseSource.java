package cn.cout.entity;

public class HouseSource {
	private long id;

	private String houseid;

	/**
	 * 经纪人姓名
	 */
	private String pname;

	/**
	 * 经纪人电话
	 */
	private String telnum;

	/**
	 * 公司名字
	 */
	private String company;

	/**
	 * 具体来源地址
	 */
	private String websource;

	/**
	 * 图片地址
	 */
	private String imgeurl;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHouseid() {
		return houseid;
	}

	public void setHouseid(String houseid) {
		this.houseid = houseid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getTelnum() {
		return telnum;
	}

	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getWebsource() {
		return websource;
	}

	public void setWebsource(String websource) {
		this.websource = websource;
	}

	public String getImgeurl() {
		return imgeurl;
	}

	public void setImgeurl(String imgeurl) {
		this.imgeurl = imgeurl;
	}
}
