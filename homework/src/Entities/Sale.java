package Entities;

public class Sale {
	private int price;
	private double discount;

	public Sale(int price, double discount) {
		super();
		this.price = price;
		this.discount = discount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
