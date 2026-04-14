package ex1_lambda.exam2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>(Arrays.asList(
				new User("김철수", 25, "서울"),
				new User("이영희", 18, "인천"),
				new User("김민수", 30, "부산"),
				new User("박지은", 22, "서울")));
		
		UserService us = new UserService();
		
		// userservice 내의 getFilter로 filter를 불러오고,
		// filterusers 메서드로 원하는 필터를 불러와서 필터링 진행
		
		System.out.println("성인 목록 ");
		us.filterUsers(users, us.getFilter("adult"));
		System.out.println("==========");
		
		System.out.println("서울 거주자 목록");
		us.filterUsers(users, us.getFilter("seoul"));
		System.out.println("==========");
		
		System.out.println("김 씨 성을 가진 사람 목록");
		us.filterUsers(users, us.getFilter("kim"));
		System.out.println("==========");
			
		
		// 기능 분리 전 코드뭉치
		
		//System.out.println("성인 목록 ");
		//for (User user : users) {
		//	
//			if (getFilter("adult").test(user)) {	
//				System.out.println(user.getName());
//			}
		//}
		//System.out.println("==========");
		//
		//System.out.println("서울 거주자 목록");
		//for (User user : users) {
//			if (getFilter("seoul").test(user)) {
//				System.out.println(user.getName());
//			}
		//}
		//System.out.println("==========");
		//
		//System.out.println("김 씨 성을 가진 사람 목록");
		//for (User user : users) {	
//			if (getFilter("kim").test(user)) {
//				System.out.println(user.getName());
//			}
		//}
		//System.out.println("==========");
	}
		
}

