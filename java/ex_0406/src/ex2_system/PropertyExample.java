package ex2_system;

import java.util.Properties;
import java.util.Set;

public class PropertyExample {
	public static void main(String[] args) {
		// 운영체제와 사용자 정보 출력
		String osName = System.getProperty("os.name"); // 운영체제 이름
		String userName = System.getProperty("user.name"); // 사용자 이름
		
		System.out.println(osName);
		System.out.println(userName);
		
		// 사용자 홈 디렉토리 경로
		String userHome = System.getProperty("user.home");
		
		System.out.println(userHome);
		
		
		// System 클래스로부터 속성들의 목록을 가져와 변수에 저장
		Properties props = System.getProperties();
		
		// 키 : 값의 나열 형식으로 저장되어있음
		
		// 속성들에서 key들만 뽑아서 변수에 저장하기
		Set keys = props.keySet();
		
		// 향상된 for문으로 key에 해당하는 value를 가져와 출력하기
		for(Object objkey : keys) {
			String key = (String) objkey;
			String value = System.getProperty(key); // key값에 해당(대응)하는 property값을 value로 저장
			System.out.printf("%-40s: %s\n", key, value);
		}
	}
}
