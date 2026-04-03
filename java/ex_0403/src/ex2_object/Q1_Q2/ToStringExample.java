package ex2_object.Q1_Q2;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj = new Object();
		
		System.out.println(obj.toString());
		
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
		
		System.out.println(myPhone); // toString이 붙어있는 것과 같음 -> 오버라이딩을 하면 원하는 대로 출력을 할 수 있음
		// 오버라이딩 후 : (회사 : 삼성전자, 운영 체제 : 안드로이드)
		
		// Q. Product 클래스를, 여러 상품 객체를 배열에 저장한 뒤 전체 상품 정보를 출력하는 프로그램 만들기
		
		// Main에서 Product 객체 3개를 생성하고 배열에 저장하기
		Product[] products = {new Product("키보드", 5000, 10), new Product("마우스", 15000, 20), new Product("모니터", 105000, 100)};
		
		// 반복문으로 모든 상품의 정보 출력하기
		for (Product product : products) {
			System.out.println(product);
		}
		
		
	}
}
