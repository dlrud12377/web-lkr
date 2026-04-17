package Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		//Main 클래스에서 ArrayList<Member>를 생성하고 회원 3명을 저장하시오.
		 List<Member> members = new ArrayList<>(Arrays.asList(
				 new Member("chulsu@naver.com", "김철수", 20),
				 new Member("younghee@gmail.com", "이영희", 17),
				 new Member("misunBong@daum.net", "봉미선", 32)
				 ));
		
		//- 향상된 for문을 사용하여 전체 회원 정보를 출력하시오.
		 
		 System.out.println("=== 전체 회원 정보 ===");
		 for (Member member : members) {
			 member.printInfo();
		 }
		//- 나이가 20세 이상인 회원 수를 출력하시오.
		 int adult = 0;
		 for (Member member : members) {
			 if (member.getAge() >= 20) {
				 adult++;
			 }
		 }
		 System.out.println("20세 이상 회원 수 : " + adult);
	}
}
