package ca.sheridancollege.pajaynar.beans;

public class ProductManager {

	public double getPrice(double price) {
        return price;
    }
	
	public double calculateDiscount(double price, double discountPercent) {
        return price - (price * discountPercent / 100);
    }
}
