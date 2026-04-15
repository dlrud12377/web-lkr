package ex2_file.exam;

import java.io.File;
import java.util.function.Predicate;

public class LogExample {
	public static void main(String[] args) {
		
		// logs 폴더를 나타내는 File객체 만들기
		
		File dir = new File("logs");
		
		if (!dir.exists()) {
			boolean created = dir.mkdir();
			if (created) {
				System.out.println("생성 완료");
			}
			// 폴더가 존재하지 않으면 "logs폴더가 없습니다." 출력하고 종료
			else {
				System.out.println("logs폴더가 없습니다.");
				return; // 종료
			}
		}
		
		// predicate 이용하여 확장자 .log인 파일만 찾기
		// predicate 그대로 쓰면 어케되는거지?
//		Predicate<File> hasLog = name -> name.endsWith(".log");
		
		File[] logFiles = dir.listFiles((d, name) -> name.endsWith(".log"));
		
		// logFiles 내 요소가 없다면 바로 종료
		if (logFiles == null) {
			System.out.println("해당하는 파일이 없습니다.");
			return; // 종료
		}
		
		// .log파일의 이름과 크기를 바이트 단위로 출력하기
		
		// 출력 예시
		// error.log - 1200byte
		// access.log - 3400byte
		// system.log - 800byte
		
		int byteTotal = 0;
		
		for (File file : logFiles) {
			System.out.println(String.format("%s - %dbyte", file.getName(), file.length()));
			byteTotal += file.length();
		}
		
		// 마지막에 .log파일 개수와 전체 용량 합계를 출력하기.
		
		System.out.println("log파일 개수 : " + logFiles.length);
		System.out.println("전체 용량 : " + byteTotal + "byte");
		

		// .log파일 개수 : 3
		// 전체 용량 : 5400byte
		
	}
}
