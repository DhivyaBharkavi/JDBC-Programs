package exercise13aug19;

public class Fashion {
private String product1,product2;
private int price1,price2;
public Fashion(String product1, int price1, String product2, int price2) {
	super();
	this.product1 = product1;
	this.price1 = price1;
	this.product2 = product2;
	this.price2 = price2;
}
public String getProduct1() {
	return product1;
}
public void setProduct1(String product1) {
	this.product1 = product1;
}
public String getProduct2() {
	return product2;
}
public void setProduct2(String product2) {
	this.product2 = product2;
}
public int getPrice1() {
	return price1;
}
public void setPrice1(int price1) {
	this.price1 = price1;
}
public int getPrice2() {
	return price2;
}
public void setPrice2(int price2) {
	this.price2 = price2;
}
public Fashion() {
	super();
	// TODO Auto-generated constructor stub
}
}
