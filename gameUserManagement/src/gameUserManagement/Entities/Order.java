package gameUserManagement.Entities;
import gameUserManagement.Abstract.*;
public class Order extends Entity {
	private int id;
	private int orderId;
	private String orderName;
	private double orderPrice;
	
	public Order() {
		
	}
	
	public Order(int id, int orderId) {
		this();
		this.id = id;
		this.orderId = orderId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	
}
