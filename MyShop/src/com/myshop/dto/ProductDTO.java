package com.myshop.dto;

public class ProductDTO {

	private int prodNo;
	private String prodname;
	private int stock;
	private int price;
	private String company;
	
	public int getProdNo() {
		return prodNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "ProductDTO [prodNo=" + prodNo + ", prodname=" + prodname + ", stock=" + stock + ", price=" + price
				+ ", company=" + company + "]";
	}
	
}
