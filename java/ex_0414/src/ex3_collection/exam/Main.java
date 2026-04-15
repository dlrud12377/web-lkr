package ex3_collection.exam;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		
		ProductService ps = new ProductService();
		
		List<Product> products = ps.getList();
		
		// 제품 추가하기(그냥 추가 x 만든함수 사용하기 - 중복제거도 가능)
		
		ps.addProduct(new Product("P001", "삼각김밥", 1200, 10));
		ps.addProduct(new Product("P002", "콜라", 2000, 0));
		ps.addProduct(new Product(" P003 ", "도시락", 4500, 5));
		ps.addProduct(new Product("P001", "삼각김밥", 1200, 10));
		ps.addProduct(new Product("P004", "보성녹차", 2200, 0));
		
		// Function 만들기
		
		// 1. p001 가격인상
		
//		Function<Product, Product> priceUp = p -> {p.setPrice((int)(p.getPrice() * 1.1));
//		return p;};
//		
//		ps.updateProduct("P001", priceUp);
		
		ps.updateProduct("P001", p -> {p.setPrice((int)(p.getPrice() * 1.1));
		return p;});
		
		// 2. 이름 공백 제거
		
		Function<Product, Product> stripper = p -> {p.setCode(p.getCode().strip());
		return p;};
		
		ps.updateProduct(" P003 ", p -> {p.setCode(p.getCode().strip()); return p;});
		
		// 3. 재고 관련 boolean 생성 - 식 한번에 합치면됨
		
		
		
		// 0보다 작은 값은 0으로 반환되도록 product setter에 설정해둠. 따라서 stock은 0 아니면 0보다 큰 값
		
		// 출력
		
		System.out.println("=== 전체 상품 목록 ===");
		ps.printAllProducts();
		
		System.out.println("=== 재고가 있는 상품 ===");
		ps.findProductsByCondition(p -> p.getStock() > 0);
		
		System.out.println("=== 품절 상품 삭제 후 ===");
		// 0보다 작은 값은 0으로 반환되도록 product setter에 설정해둠. 따라서 stock은 0 아니면 0보다 큰 값
		// -> findIfStockExists를 negate 하면 재고가 0개인 제품 검색가능
		ps.deleteProductsByCondition(p -> p.getStock() == 0);
		ps.printAllProducts();

		
	}
}
