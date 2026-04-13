package ex1_map.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LoginExample {
	public static void main(String[] args) {
		// 아이디와 비밀번호를 저장
		// 둘 다 String
		// 아이디와 비밀번호를 입력해서 로그인을 시도할 때 가능한 반응
		// 1. 아이디가 존재하지 않습니다.
		// 2. 비밀번호 오류입니다.
		// 3. 로그인 성공
		
		// set를 담을 HashMap 생성
	    HashMap<String, String> users = new HashMap<String, String>();
		users.put("admin", "1234");
        users.put("user1", "abcd");
        users.put("guest", "1111");
        
        // Entryset으로 만들어두기
        Set<Map.Entry<String, String>> userSet = users.entrySet();
        
        String id;
        String password;
        
        Scanner sc = new Scanner(System.in);
        // 아이디 비밀번호 입력받기
        
        System.out.print("ID : ");
        id = sc.nextLine();
        
        System.out.print("비밀번호 : ");
        password = sc.nextLine();
        
        // set의 entry값을 그냥 사용하는건 어떻게 하는거지..ㅠ
        
        boolean isIdCorrect = false;
        boolean isPasswordCorrect = false;
        for (Map.Entry<String, String> user : userSet) {
        	if (user.getKey().equals(id)) {
        		if (user.getValue().equals(password)) {
        			isIdCorrect = true;
        			isPasswordCorrect = true;
        		}
        		else {
        			isIdCorrect = true;
        		}
        	}
        }
        
        if (isIdCorrect && isPasswordCorrect) {
        	System.out.println("로그인 성공");
        }
        else if (isIdCorrect && !isPasswordCorrect) {
        	System.out.println("비밀번호 오류입니다.");
        }
        else {
        	System.out.println("아이디가 존재하지 않습니다.");
        }
        
        
        // 좀 복잡함.. 강사님 방법 한번더 확인하기
        
	}
}
