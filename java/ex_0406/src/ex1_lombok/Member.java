package ex1_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 어노테이션
// 자바 코드에 붙이는 표식
// 컴파일러에게 "이 코드는 어떤 의미가 있다" 라고 알려주는 정도
//@Setter // setter 자동생성
//@Getter // getter 자동생성
@AllArgsConstructor // 모든 변수를 담은 생성자 자동생성
@NoArgsConstructor // 기본 생성자 자동생성(생성자 오버로딩)
// @RequiredArgsConstructor // final 또는 @NonNull이 붙은 필드만 매개변수로 갖는 생성자
// Noargs와 RequiredArgs 생성자는 같이 사용 불가
// 기본생성자는 final값을 초기화할 수 없어서 미리 초기화해야 하는데, requiredArgs는 반대이기 때문
//@ToString // toString 자동 오버라이딩
@Data // getter setter hashcode equals tostring 메서드를 자동생성 - wow~

public class Member {
	
	private String id = "1"; // final을 붙여보기
	private String name;
	private int age;
	
	// < private 변수 초기화하는 방법 >
	// 1. 생성자를 이용하여 초기화
	// 롬복 어노테이션으로 자동으로 했음
	
	// 2. getter / setter 사용하기
	// 롬복 어노테이션으로 자동으로 했음
	
	// 코드가 없음 신세계ㅋㅋ
}

// https://yoonseon.tistory.com/152