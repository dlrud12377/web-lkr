package ex2_charstream.exam;

import java.io.FileReader;

public class Example {
	public static void main(String[] args) {
		// test.txt 파일에 아무 내용이나 적는다.
		// 내용을 읽어와서 영어 대문자와 소문자가 몇 개 있는지 각각 출력하세요.
		
		try(FileReader hamlet = new FileReader("test.txt")) {
			
			int code = 0;
			int UpperCount = 0;
			int LowerCount = 0;
			
			while((code = hamlet.read()) != -1) {
				if (code >= 'A' && code <= 'Z') {
					UpperCount++;
				}
				else if (code >= 'a' && code <= 'z') {
					LowerCount++;
				}
			}
			
			System.out.println("대문자 : " + UpperCount);
			System.out.println("소문자 : " + LowerCount);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		FileConverter fc = new FileConverter();
		
		fc.copy("bridge.jpg", "bridge_copy2.jpg");
		
	
	}
}
