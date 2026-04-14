package ex1_lambda.exam2;

import java.util.List;

public class UserService {
	public UserFilter getFilter(String type) {
		if (type.equals("adult")) {
			return user -> user.getAge() >= 20;
		}
		else if (type.equals("seoul")) {
			return user -> user.getCity() == "서울";
		}
		else if (type.equals("kim")) {
			return user -> user.getName().startsWith("김");
		}
		else {
			return null;
		}
	}
	
	public void filterUsers(List<User> users, UserFilter filter) {
		for (User user : users) {
			if (filter.test(user)) {	
				System.out.println(
						user.getName() + " / " 
						+ user.getAge() + " / "
						+ user.getCity());
			}
		}
	}
}

//System.out.println("성인 목록 ");
//for (User user : users) {
//	
//	if (getFilter("adult").test(user)) {	
//		System.out.println(user.getName());
//	}
//}
//System.out.println("==========");
//
//System.out.println("서울 거주자 목록");
//for (User user : users) {
//	if (getFilter("seoul").test(user)) {
//		System.out.println(user.getName());
//	}
//}
//System.out.println("==========");
//
//System.out.println("김 씨 성을 가진 사람 목록");
//for (User user : users) {	
//	if (getFilter("kim").test(user)) {
//		System.out.println(user.getName());
//	}
//}
//System.out.println("==========");