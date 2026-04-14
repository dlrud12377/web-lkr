package ex3_collection.exam;

import java.lang.reflect.Constructor;

public class Product {
	// 필드 - private, 생성자 통해 값을 초기화
	private String code;
	private String name;
	private int price;
	private int stock;
	
	// 생성자
	public Product(String code, String name, int price, int stock) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	// getter setter
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	} 
	
	// toString 오버라이딩
	@Override
	public String toString() {
		return String.format("Product { code = %s,"
				+ " name = %s,"
				+ " price = %d,"
				+ " stock = %d"
				, code, name, price, stock);
	}
	
}
