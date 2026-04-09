package ex1_list.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		List<Integer> ages = new ArrayList<Integer>();
		
		names.add("홍길동");
		ages.add(30);
		// 너무 번거롭고, 각각 관리하기가 힘듬
		// -> 객체를 만들어 객체 자체를 관리하는 것이 편하다!
		
		List<Member> members = new ArrayList<>();
		
		Member m1 = new Member();
		m1.setName("홍길동");
		m1.setAge(30);
		
		// 나이가 현재 등록되지 않은 상태입니다. 그대로 등록하시겠습니까?
		// yes -> 일단 넣기 / no -> 나이 다시 받기 -> 제대로 된 값 들어왔으면 넣기 아니면 또 오류던져
		members.add(m1);
		
//		Member m2 = new Member(); // 생성자 안쓰고 빌더패턴 써서 바로 new Member로 슥삭 하고싶은데 m2안쓰고
//		// 흠 흠 흠
		
		// 꺼내면 되는군..

		members.add(new Member());
		
		members.get(1).setName("박민수");
		members.get(1).setAge(40);
		
		// 이번에야말로 진짜 빌더패턴을..
		// 김민수, 25
		members.add(new MemberBuilder()
				.name("김민수")
				.age(25)
				.build());
		
		// 홍길동 정보
		System.out.println(members.get(0).getName());
		System.out.println(members.get(0).getAge());
		
		// 김철수 정보
		System.out.println(members.get(1).getName());
		System.out.println(members.get(1).getAge());
		
		// 김민수 정보
		System.out.println(members.get(2).getName());
		System.out.println(members.get(2).getAge());
		
		System.out.println(members);
	}
}
