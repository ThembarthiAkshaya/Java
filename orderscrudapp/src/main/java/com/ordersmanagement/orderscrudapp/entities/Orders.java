//fields should be mentioned as member variables
package com.ordersmanagement.orderscrudapp.entities;

public class Orders {
	private String productid;
	private String productName;
	private int price;
	private int quantity;
	private String address;

	//parameterized constructor
	public Orders(String productid, String orderName, int price, int quantity, String address) {
		super();
		this.productid = productid;
		this.productName = orderName;
		this.price = price;
		this.quantity = quantity;
		this.address = address;
	}

	//default constructor
	public Orders() {
		super();
	}

	//getter and setter methods
	public String getOrderid() {
		return productid;
	}
	public void setOrderid(String orderid) {
		this.productid = orderid;
	}
	public String getOrderName() {
		return productName;
	}
	public void setOrderName(String orderName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	/*---overriding toString method--*/
	//so object print in string form
	@Override
	public String toString() {
		return "\n Product id:" + productid +
				"\n Student Name:" + productName +
				"\n price" + price + 
				"\n quantity" + quantity +
				"\n address=" + address +
				"\n---------------------------------";
	}

}
