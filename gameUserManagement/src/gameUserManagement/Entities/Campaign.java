package gameUserManagement.Entities;
import gameUserManagement.Abstract.*;
public class Campaign extends Entity{
	private int id;
	private String name;
	private int campaignId;
	private double discount;
	
	public Campaign() {
		
	}
	
	public Campaign(int id,String name, int campaignId, double discount) {
		this();
		this.name=name;
		this.id = id;
		this.campaignId = campaignId;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
