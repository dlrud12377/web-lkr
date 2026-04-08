package ex1_reflection.log;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

// reflection + 설정 파일 읽기
// 설정 파일을 읽고, 리플렉션으로 객체르 생성해서 반환하는 공장 역할

// 개발중에는 콘솔에 출력
// 운영 환경에서는 파일에 저장
// 어떤 시스템에서는 DB에 저장을 원함
// 이를 나중에 상황에 맞게 결정하고 싶을 때 수정하기 편한 코드를 만듦
public class LoggerFactory {
	
	public static Logger getLogger() {
		Properties prop = new Properties();
		Scanner sc = new Scanner(System.in);
		try {
			// load() : 설정파일을 읽어온다
			prop.load(new FileInputStream("config.properties"));
			
			// 클래스 이름 가져오기
			System.out.println("loggerClass : ex1_reflection.log.ConsoleLogger\r\n"
					+ "fileClass : ex1_reflection.log.FileLogger\r\n"
					+ "DBClass : ex1_reflection.log.DBLogger"); // 전체 출력하기(패키지 경로 포함)
			System.out.print("원하는 value에 해당하는 key를 입력하세요 : ");
			String classKey = sc.next();
			
			String className = prop.getProperty(classKey); // key = value 형식으로 문서가 구성되어있고
			// loggerClass는 value값인 ConsoleLogger를 불러오기 위한 key가 된다.
			
			// 리플렉션을 이용하여 클래스를 찾는다.
			Class clazz = Class.forName(className);
			
			// 객체를 만든다.
			// getDeclaredConstructor() : 클래스에 선언된 생성자를 가져오는 기능
			// .newInstance() : 주어진 생성자로 새로운 인스턴스(객체)를 생성
			Object obj = clazz.getDeclaredConstructor().newInstance();
			return (Logger)obj;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException("Logger 생성 실패"); // 어떤 예외든 들어오면 runtimeexception으로 퉁침
		}

	}
}
