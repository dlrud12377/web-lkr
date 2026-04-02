package ex1_innerclass.staticclass;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 단점
		// 매개변수가 많아서 순서를 헷갈리기 쉽다
		// 어떤 값이 필수인지 한눈에 안보인다.
		// 생성자가 너무 많아 오버로딩 될 수 있다.
		Scanner sc = new Scanner(System.in);
		
//		User user = new User("hong", "1234", "홍길동", "hong@email.com", 20, "서울", "010-1111-2222");
		// 이걸 순서가 헷갈리지 않게 다 친다? 너무 비효율적이다 -> 객체 생성 책임 분리
		
		// 정적 내부클래스의 객체 생성 방법
		Outer.Inner inner = new Outer.Inner();
		
		// 같은 방식으로 User와 Builder도 진행
		User user = new User.Builder()
				.id("hong")
				.password("1234")
				.name("홍길동")
				.age(20) // 모든 값의 반환값이 builder이기 때문에 가능(setter를 연쇄적으로 쓰는느낌?)
				.build(); // 마지막 반환은 위 내용이 담긴 user 객체로 반환
		
	}
}

// https://inpa.tistory.com/entry/GOF-%F0%9F%92%A0-%EB%B9%8C%EB%8D%94Builder-%ED%8C%A8%ED%84%B4-%EB%81%9D%ED%8C%90%EC%99%95-%EC%A0%95%EB%A6%AC
// setter에 체이닝 시스템을 달아준 빌더 패턴