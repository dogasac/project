package Entities;

public class Campaing {
	private int id;
	private String campaingName;
	private int discountAmount;

	
	public Campaing(int id, String campaingName, int discountAmount) {
		super();
		this.id = id;
		this.campaingName = campaingName;
		this.discountAmount = discountAmount;
	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaingName() {
		return campaingName;
	}


	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}


	public int getDiscountAmount() {
		return discountAmount;
	}


	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}
	
}
