package ex1_reflection.log;

public class Main {
	public static void main(String[] args) {
		// 기존에 우리가 사용하던 방식(객체 생성)
		// 출력 방식을 바꾸려면 자바 코드를 직접 수정을 해야 한다.
		
		// -> 프로그램의 동작 방식이 소스코드에 고정되어 있다는 뜻
//		Logger logger = new ConsoleLogger(); -> Logger logger = new FileLogger();
//		logger.log("테스트");
		
		// 설정파일 방식
		// 프로그램이 실행될 때 설정 파일을 읽어봐야 방법을 알 수 있다.
		Logger logger = LoggerFactory.getLogger();
		logger.log("테스트 메시지");

	}
}
