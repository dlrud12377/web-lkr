package ex3_collection.exam;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		
		ProductService ps = new ProductService();
		
		List<Product> products = ps.getList();
		
		products.add(new Product("P001", "삼각김밥", 1200, 10));
		products.add(new Product("P002", "콜라", 2000, 0));
		products.add(new Product(" P003 ", "도시락", 4500, 5));
		
		// Function 만들기
		
		Function<Product, Product> priceUp = p -> {p.setPrice((int)(p.getPrice() * 1.1));
		return p;};
		
		Function<Product, Product> stripper = p -> {p.setCode(p.getCode().strip());
		return p;};
		
		Predicate<Product> findIfStockExists = p -> p.getStock() > 0;
		
		
		// 출력
		
		System.out.println("=== 전체 상품 목록 ===");
		ps.printAllProducts();
		
		System.out.println("=== 재고가 있는 상품 ===");
		ps.findProductsByCondition(findIfStockExists);

		
	}
}
