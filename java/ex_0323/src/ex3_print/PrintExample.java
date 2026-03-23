package ex3_print;

public class PrintExample {
	public static void main(String[] args) {
		
		// 1. print - 띄어쓰기 없음, 줄바꿈 없음(가장 기본적인 형태)
		// - 줄바꿈하려면 println 또는 \n 사용
		System.out.print("Welcome");
		System.out.print("Java World"); // WelcomeJava World
		
		// 2. println - 문장 끝에 줄바꿈이 있음
		System.out.println("Welcome"); // Welcome(줄바꿈 적용)
		System.out.println("Java World"); // Java World(줄바꿈 적용)
		
		// 3. printf
		// - 문자열 속에서 데이터를 출력할 수 있는 메서드
		// - 데이터는 자료형에 따라 서식문자를 이용해 출력
		// 정수 : %d (decimal)
		// 실수 : %f (float)
		// 문자형 : %c (character, char)
		// 문자열 : %s (String)
		// 논리형 : %b (boolean)
		
		int age = 30;
		String name = "박길동";
		System.out.println("제 이름은 " + name + ", 나이는 " + age + "세 입니다."); // 제 이름은 박길동, 나이는 30세 입니다.
		// 위의 방식보다
		
		System.out.printf("제 이름은 %s, 나이는 %d 세 입니다.\n", name, age);
		// 이 방식이 더 간편할 수도 있음. 다만 줄바꿈 기능을 따로 넣어줘야 함(\n)
		
		// %.xf : 소숫점 x째 자리까지 출력
		double height = 169.5;
		System.out.printf("키는 %.1fcm 입니다.\n", height); // 키는 169.5cm 입니다.
		
		// %xd : x자리 공간을 확보한 채 정수 출력
		int price = 123;
		System.out.printf("상품의 가격 : %6d원\n",price); // 상품의 가격 : ( )( )( )123원
		// %0xd : x자리 공간에 정수 출력, 빈 공간에 0 삽입
		System.out.printf("상품의 가격 : %06d원\n",price); // 상품의 가격 : 000123원
		// System.out.printf("상품의 가격 : %-06d원\n",price); -> 이건 되지 않음
	}
}
