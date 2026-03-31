package ex4_getter_setter;

public class UserMain {
	public static void main(String[] args) {
		User user1 = new User();
		
		user1.setAllInfo();
		
		user1.getAllInfo(user1);

	}
}
