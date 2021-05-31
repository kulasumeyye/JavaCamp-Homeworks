package Entities;

public class Campaign implements Entity {

	private int campignId;
	private String campignName;
	private int discount;
	
	public Campaign() {
		super();
	}
	
	public Campaign(int campignId, String campignName, int discount) {
		super();
		this.campignId = campignId;
		this.campignName = campignName;
		this.discount = discount;
	}

	public int getCampignId() {
		return campignId;
	}
	public void setCampignId(int campignId) {
		this.campignId = campignId;
	}
	public String getCampignName() {
		return campignName;
	}
	public void setCampignName(String campignName) {
		this.campignName = campignName;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
