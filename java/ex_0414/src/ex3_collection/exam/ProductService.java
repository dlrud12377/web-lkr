package ex3_collection.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProductService {
	
	private List<Product> list = new ArrayList<>();
	
	public List<Product> getList() {
		return list;
	}
	
//	1) 상품 등록
//	public void addProduct(Product product)
//	상품을 등록한다.
//	같은 code가 이미 존재하면 "이미 존재하는 상품 코드입니다."를 출력한다.
	
	BiPredicate<Product, String> isSame = (p,q) -> p.getCode().equals(q);
	
	public void addProduct(Product product) {
		if (findByCode(product.getCode()) != null) { // list 내 코드가 매개변수 product의 code와 겹치면
			System.out.println("이미 존재하는 상품 코드입니다.");
			return; // 추가하지 않고 종료
		}
		list.add(product); // 종료가 안됐으면 추가
		System.out.println("상품이 추가되었습니다!");

	}
	
//	2) 전체 상품 조회
//	public void printAllProducts()
	
	public void printAllProducts() {
		list.forEach(p -> System.out.println(p.toString()));
	}
	
//	3) 상품 코드로 조회
//	public Product findByCode(String code)
	
	public Product findByCode(String code) {
		for (Product p : list) {
			if (isSame.test(p, code)) {
				return p;
			}
		}
		return null;
	}
	
//	4) 상품 정보 수정
//	public void updateProduct(String code, Function<Product, Product> updater)
//	상품을 찾아서 updater를 적용한다.
//	없으면 "상품이 존재하지 않습니다."를 출력한다.
	
	public void updateProduct(String code, Function<Product, Product> updater) {
		Product p = findByCode(code); // 찾은 product 객체임. 어케쓸까? -> product에 적용하기 위해 객체 생성
		
		// 없으면 존재하지 않습니다 출력해야함
		
		if (p == null) {
			System.out.println("상품이 존재하지 않습니다.");
			return; // 상품이 없는데 적용시키면 안되니 강제로 메서드 종료
		}
		
		// 코드로 정상적으로 찾았으면 updater 적용시키기
		updater.apply(p);
	}
	
//	5) 조건에 맞는 상품 조회
	public void findProductsByCondition(Predicate<Product> predicate) {
		for (Product product : list) {
			if (predicate.test(product)) {
				System.out.println(product.toString());
			}
		}

	}
	
//	6) 조건에 맞는 상품 삭제
	public void deleteProductsByCondition(Predicate<Product> predicate) {
		list.removeIf(predicate);
	}
}
