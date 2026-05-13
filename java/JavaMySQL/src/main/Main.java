package main;

import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class Main {
	public static void main(String[] args) {
		// 1. member 테이블의 모든 내용 조회하기
		MemberDAO dao = new MemberDAO();
		
		dao.findAll();
		
//		2. member table에 행 추가하기
		
//		System.out.println();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름 : ");
//		String name = sc.next();
//		
//		sc.nextLine();
//		
//		System.out.print("이메일 : ");
//		String email = sc.nextLine();
//		
//		System.out.println();
//		
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		
//		System.out.println();
//		
//		
//		MemberDTO newMember = new MemberDTO(name, email, age);
//		
//		dao.insertMember(newMember);
		
		// 3. 수정
//		dao.updateMemberAge(memberid, age);
		
		
		// 4. 삭제
//		MemberDTO newMember = new MemberDTO(memberid, name, email, age);
//		dao.deleteMember(newMember);
	}
}
