package entities;

public class Campaign {
	private int id;
	private String campaignId;
	private double discountRate;
	public Campaign() {};
	public Campaign(int id, String campaignId, double discountRate) {
		super();
		this.id = id;
		this.campaignId = campaignId;
		this.discountRate = discountRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	
	

}
