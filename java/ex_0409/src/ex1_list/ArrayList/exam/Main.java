package ex1_list.ArrayList.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Main클래스에서 유저의 정보를 ArrayList에 추가한다.
		// 단, 아이디와 비밀번호는 키보드에서 입력받아 추가한다.
		// 3명을 입력받으면 종료
		
		List<UserInfo> users = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		String id;
		int password;
		
		outer : for (int i = 0; i < 3; i++) {
			
			System.out.print("아이디 입력(문자) : ");
			id = sc.next();
			for (int j = 0; j < i; j++) {
				if (id.equals(users.get(j).getId())) { 
					// index i의 member의 id가 기존에 있던 j 멤버들의 아이디와 같으면0
					// 근데 이거 contains로도 풀수있을듯? id 자체를 저장하는 리스트 하나를 분리해서 짜면 되긴함
					// -> 근데 메모리적으로 비효율적
					System.out.println("기존에 있는 아이디입니다. 다시 입력해주세요.");
					i--;
					continue outer; // i를 한번 줄이고 다시 진행
				}

			}
			System.out.println("비밀번호 입력(숫자) : ");
			password = sc.nextInt();
			
			users.add(new UserInfo());
			users.get(i).setId(id);
			users.get(i).setPassword(password);
			
			System.out.println((i+1) + "명 입력 완료");
			
			System.out.println("------------");
		}
		
		System.out.println("3명을 입력받아 프로그램을 종료합니다.");
		
		for (UserInfo user : users) {
			user.printInfo();
		}
		

	}
}
