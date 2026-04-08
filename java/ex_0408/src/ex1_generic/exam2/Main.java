package ex1_generic.exam2;

// Main에서 아래 데이터를 사용하여 객체를 생성하고 출력하세요
// 성공여부 : true
// 메시지 : 회원 조회 성공
// 이름 : 홍길동
// 나이 : 27

public class Main {
	public static void main(String[] args) {
		
		MemberResponse<Member> mr1 = new MemberResponse<Member>(true, "회원 조회 성공", new Member("홍길동", 27));
		
		System.out.println("성공여부 : " + mr1.isSuccess());
		System.out.println("메시지 : " + mr1.getMessage());
		System.out.println("이름 : " + mr1.getData().getName());
		System.out.println("나이 : " + mr1.getData().getAge());
	}
}