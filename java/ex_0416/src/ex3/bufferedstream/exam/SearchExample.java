package ex3.bufferedstream.exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//사용자로부터 검색할 단어를 입력받고, stroy.txt파일에서
//해당 단어가 포함된 줄을 출력하세요

//실행 예시
//검색어 입력 : 자바
//자바는 객체지향 언어이다.
//오늘 자바 공부를 했다.

//파일은 한줄씩읽는다.

//권장 스트림
//BufferedReader

public class SearchExample {
	public static void main(String[] args) {
		
		List<String> lines = new ArrayList<>();
		String line = null;
		String target = null;
		File f = new File("story.txt");

	
		
		// source : 파일을 받아올 스트림과 보조스트림
		try (
				// BufferedReader 객체 생성(보조스트림) + InputStreamReader(보조스트림) 객체 생성(메인스트림)
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				// 파일을 읽어오는 데 필요한 reader 메인스트림과 buffer 보조스트림
				FileReader fr = new FileReader("story.txt");
				BufferedReader br2 = new BufferedReader(fr);
				) {
		
			// 1. 검색할 단어 체크하기
			System.out.print("검색어 입력 : ");
			target = br.readLine();
			
			System.out.println(); // 버퍼 정리
			
			// 2. 파일 읽어와 문장 저장하기
			
			if (!f.exists()) {
				System.out.println("파일이 없습니다.");
				return;
			}
			
				while((line = br2.readLine()) != null) {
					lines.add(line);
			}
				
			// for문으로 target word 들어간 문장 출력
				for (String lineTxt : lines) {
					if (lineTxt.contains(target)) {
						System.out.println(lineTxt);
					}
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
