package service;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import member.Member;

public class MemberService {
	
	
	public void register(Member member) {
		System.out.println("회원 등록을 시작합니다.");
		System.out.println("회원 이름 : " + member.getName());
		System.out.println("회원 나이 : " + member.getAge());
		
		// 최상위 폴더에 파일 만들기
		Path path = Paths.get("MemberInfo.txt");
		
		// BufferedWriter(문자 데이터를 버퍼로 보아서 파일로 쓰는 스트림 클래스)
		
		BufferedWriter writer = null;
		try {
			// UTF-8 인코딩 방식으로 저장하기
			writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
			writer.write(member.getName() + " " + member.getAge());
			System.out.println("회원 등록이 완료되었습니다.");
			// 아니 왜 저장 하나만 됨ㅠ
			
			// 예외발생 : IOException(파일 입출력 과정에서 발생하는 예외)
		} 
		catch(IOException e) {
			// 예외 발생 위치/원인 출력
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	} // method end
	
	// 성인인지 아닌지 판단하는 checkAdult() 메서드 만들기
	// 20살 이상이면 "성인 회원입니다."
	// 아니면 "미성년 회원입니다."
	public void checkAdult(Member member) {
		if (member.getAge() >= 20) {
			System.out.println("성인 회원입니다.");
		}
		else {
			System.out.println("미성년 회원입니다.");
		}
	}
}
