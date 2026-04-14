package ex2_function.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Main
//List 만들어서 멤버 데이터 채우기

//Predicate<Member>로 조건을 정의 (20세 이상)

//리스트에서 20세 이상인 회원만 출력하기
public class Main {
	
	public static void main(String[] args) {
		List<Member> members = new ArrayList<>(Arrays.asList(
				new Member("김철수", 25),
				new Member("이영희", 18),
				new Member("김민수", 30),
				new Member("박지은", 22)));
		
		Predicate<Member> over20 = m -> m.getAge() >= 20;
		
		for (Member member : members) {
			if (over20.test(member)) {
				System.out.println("이름 : " + member.getName() + ", 나이 : " + member.getAge());
			}
		}
		
	}
}
