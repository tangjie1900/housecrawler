package cn.cout.entity;

public class HouseInfo {
	private long id;

	private String houseid;

	/**
	 * 房间 1室1厅1卫
	 */
	private String roomsdesc;

	/**
	 * 房间 大小
	 */
	private int size;

	/**
	 * 到地铁站距离
	 */
	private int fromMS;

	/**
	 * 楼层  第几层
	 */
	private int rlevel;

	/**
	 * 装修级别
	 */
	private int zxtype;

	/**
	 * 交房租的方式
	 */
	private int fzpaytype;

	/**
	 *
	 */
	private int cityareaid;

	/**
	 * 出租方式：单间 整租
	 */
	private int chuzutype;

	/**
	 * 中高层
	 */
	private int cengtype;

	/**
	 * 价格级别
	 */
	private int pricelevel;

	/**
	 * 朝向
	 */
	private int orientation;

	/**
	 * 房间几个 ：1 2 3
	 */
	private int rooms;

	/**
	 * 小区名字
	 */
	private String houseareaname;

	private double lons;

	private double lats;

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

	public String getRoomsdesc() {
		return roomsdesc;
	}

	public void setRoomsdesc(String roomsdesc) {
		this.roomsdesc = roomsdesc;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getFromMS() {
		return fromMS;
	}

	public void setFromMS(int fromMS) {
		this.fromMS = fromMS;
	}

	public int getRlevel() {
		return rlevel;
	}

	public void setRlevel(int rlevel) {
		this.rlevel = rlevel;
	}

	public int getZxtype() {
		return zxtype;
	}

	public void setZxtype(int zxtype) {
		this.zxtype = zxtype;
	}

	public int getFzpaytype() {
		return fzpaytype;
	}

	public void setFzpaytype(int fzpaytype) {
		this.fzpaytype = fzpaytype;
	}

	public int getCityareaid() {
		return cityareaid;
	}

	public void setCityareaid(int cityareaid) {
		this.cityareaid = cityareaid;
	}

	public int getChuzutype() {
		return chuzutype;
	}

	public void setChuzutype(int chuzutype) {
		this.chuzutype = chuzutype;
	}

	public int getCengtype() {
		return cengtype;
	}

	public void setCengtype(int cengtype) {
		this.cengtype = cengtype;
	}

	public int getPricelevel() {
		return pricelevel;
	}

	public void setPricelevel(int pricelevel) {
		this.pricelevel = pricelevel;
	}

	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public String getHouseareaname() {
		return houseareaname;
	}

	public void setHouseareaname(String houseareaname) {
		this.houseareaname = houseareaname;
	}

	public double getLons() {
		return lons;
	}

	public void setLons(double lons) {
		this.lons = lons;
	}

	public double getLats() {
		return lats;
	}

	public void setLats(double lats) {
		this.lats = lats;
	}
}
