package ex1_stream.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QuizMain {
	public static void main(String[] args) {
		
//		Q1. 주문 금액이 50000원 이상인 주문의 개수를 구하시오.
//
		List<Integer> orders = Arrays.asList(12000, 80000, 45000, 50000, 99000, 30000);
		
		long count = orders.stream()
		.filter(x -> x >= 50000)
		.count();
		System.out.println("50000원 이상 : " + count);
		
//		Q2. 회원 나이 목록이 있을 때 아래를 각각 구하시오.

		List<Integer> ages = Arrays.asList(21, 35, 17, 42, 63, 15);
		
//		미성년자가 한 명이라도 있는지
		boolean isAnyMinor = ages.stream()
		.anyMatch(x -> x < 20);
		System.out.println("미성년자 여부 : " + isAnyMinor);
		
//		전원이 성인인지
		boolean isAllAdult = ages.stream()
				.allMatch(x -> x >= 20);
		System.out.println("전부 성인인지 여부 : " + isAllAdult);
		
//		100세 초과 회원이 없는지
		boolean noneOver100 = ages.stream()
				.noneMatch(x -> x > 100);
		System.out.println("나이가 100세 초과인 사람이 없는지 여부 : " + noneOver100);
		
		
//		Q3.	정수 리스트에서 짝수만 골라 제곱한 값들의 총합을 구하시오.

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		int sum = numbers.stream()
		.filter(x -> x % 2 == 0)
		.map(x -> (int)Math.pow(x, 2))
		.reduce(0, (a,b) -> a+b);
		
		System.out.println("짝수만 골라 제곱한 결과 : " + sum);
		
		
//		Q4. 학생 점수 목록에서 80점 이상인 점수만 내림차순 정렬하여 새로운 리스트로 만드시오. // collector.tolist

		List<Integer> scores = Arrays.asList(55, 90, 82, 67, 99, 80, 73);
		
		List<Integer> over80 = scores.stream()
		.filter(x -> x >= 80)
		.collect(Collectors.toList());
		
		System.out.println(over80);
		
//		문제
//
//		다음 Product 객체 "리스트"를 이용하여
//		상품명(name)을 key, 가격(price)을 value로 가지는 Map을 생성하시오.
//
//		단, 가격이 10000원 이상인 상품만 포함하시오.

		List<Product> products = new ArrayList<>(Arrays.asList(
				new Product("마우스", 8000),
				new Product("키보드", 30000),
				new Product("모니터", 150000),
				new Product("노트", 2000)));
		
		
		Map<String, Integer> productMap = products.stream()
				.filter(x -> x.getPrice() >= 10000)
				.collect(Collectors.toMap((x) -> x.getName(), (y) -> y.getPrice()));
		// toMap의 반환타입이 Map이기 때문에, HashMap으로 타입을 줘버리면 자식타입 = 부모타입이 되어버려 미스매치가 일어난다.
		// 반대의 경우인 부모타임 = 자식타입은 상속 관계로 인해 자동 형변환이 일어난다.
		
		System.out.println(productMap);

	}
}
