package ex3.bufferedstream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExample2 {
	public static void main(String[] args) {
		//Scanner
		// - 속도가 느리다.(코딩테스트나 실무 등에서 불리할 수 있음)
		// - nextInt(), nextDouble() 등 입력과 동시에
		// 데이터 타입을 변환해주는 편의 기능이 많다.
		// 하지만 내부적으로 정규표현식을 사용하여 입력을 분석하기 때문에
		// 속도가 느려지는 원인이 된다.
		
		//BufferedReader
		// - 버퍼를 사용하기 때문에 속도가 빠르다.
		// - 오직 문자열 단위로만 읽는다.
		// - 다른 타입으로 사용하려면 번거롭지만 직접 바꿔주어야 한다.
		// - 보조스트림이기 때문에 기반스트림이 필요하다.
		
		// System.in : 표준 입력 스트림(바이트 기반 스트림)
		// 문자나 문자열을 편하게 읽는 용도가 아니라 바이트 단위로 데이터를 읽는 통로
		// 그래서 InputStreamReader를 사용해서 문자 스트림으로 변환해준다. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name = null;
		int age = 0;
		String info = null;
		
		try {
//			System.out.print("이름을 입력하세요 : ");
//			name = br.readLine();
//			
//			System.out.println(); // 버퍼정리
//			
//			System.out.print("나이를 입력하세요 : ");
//			age = Integer.parseInt(br.readLine());
			
			System.out.print("이름과 나이를 입력하세요(이름 나이) : ");
			info = br.readLine();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
//		System.out.println("입력한 이름 : " + name);
//		System.out.println("입력한 나이 : " + age);
		
		// info에서 한번에 받은 내용 출력하기
		String[] nameAndAge = info.split(" ");
		System.out.println("이름 : " + nameAndAge[0]);
		System.out.println("나이 : " + nameAndAge[1]);
	}
}
