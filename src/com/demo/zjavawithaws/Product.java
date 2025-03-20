package com.demo.zjavawithaws;

 public class Product implements Comparable<Product>{
	
	private int ProductId;
	private String productName;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Product(int productId, String productName) {
		super();
		ProductId = productId;
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", productName=" + productName + "]";
	}
	@Override
	public int compareTo(Product o) {
		
		return this.productName.compareTo(o.productName);
	}
	
}
 
 

