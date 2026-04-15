package ex2_file.exam;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.function.BiPredicate;

public class LoginExample {
	public static void main(String[] args) {
		
		File f = new File("member.txt");
		
		byte[] memberByte = new byte[(int) f.length()];
		
		if (!f.exists()) {
			System.out.println("파일 확인 실패");
			return;
		}
		
		try {
			FileInputStream fis = new FileInputStream(f);
			
			fis.read(memberByte);
			
			String member = new String(memberByte);
			
			String[] idAndPassword = member.split("\r\n");
			
			BiPredicate<String, String> isSame = (p,q) -> p.equals(q);
			
			fis.close();
			
			System.out.println(Arrays.toString(idAndPassword));
			
			if (isSame.test(idAndPassword[0], "apple")) {
				if (isSame.test(idAndPassword[1], "1234")) {
					System.out.println("로그인 성공");
				}
				else {
					System.out.println("비밀번호 오류");
				}
			}
			else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
		} catch (Exception e) {
			
		}
		
		
		
	}
}
