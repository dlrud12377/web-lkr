package ex1_list;

import java.util.ArrayList; // ArrayList 쓰기 전 ctrl shift o로 임포트
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ArrayListAndHashMap {

	public static void main(String[] args) {		
		
		// 1. 컬렉션 프레임워크 - ArrayList 사용해보기
		// ArrayList 사용 선언을 해야함. (객체 생성)
		// ex ) 스캐너 - Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>(); // ArrayList 선언
		
		// 동적으로 배열을 만들어주는 ArrayList 선언 후 값 대입
		// .add() : 값을 넣는 함수
		
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(7);
		
		// ArrayList는 같은 값의 중복을 허용한다.
		// 순차적으로 0번부터 계속 작성을 하는데,
		// 3번째 인덱스에 숫자 10을 넣을 것 - (인덱스, 값) 형식으로 진행
		list.add(3, 10);
		
		System.out.println("삭제 전 크기 : " + list.size()); // 5
		System.out.println("삭제 전 요소 : " + list); // [1, 2, 2, 10, 7]
		
		// 배열을 문자로 출력해주는 Arrays.toString() 기능이 없이 출력이 바로 됨
		// ArrayList는 해당 기능이 자체적으로 내포되어 있음
		
		// 리스트 내 요소 삭제
		
		list.remove(1);
		
		System.out.println("삭제 후 크기 : " + list.size()); // 4
		System.out.println("삭제 후 요소 : " + list); // [1, 2, 10, 7] - 1번 인덱스(2번째 숫자) 사라짐
		
		// 새로운 ArrayList 선언
		
		List<Integer> list2 = new ArrayList<>();
		// ctrl shift o 사용(List)
		
		list2.add(50);
		list2.add(2);
		list2.add(2);
		list2.add(2);
		
		// list의 내용을 list2로 붙여넣기
		
		list2.addAll(list);
		System.out.println("list2의 내용은 다음과 같습니다." + list2);
		// 사용된 list는 변화가 없고, 이어붙여진 list2는 변화함
		
		
		// removeAll : 일치하는 내용을 삭제해주는 함수
		list2.removeAll(list);
		System.out.println("일치하는 데이터를 지웠을 경우 : " + list2);
		
		
		
		ArrayList<Integer> list3 = new ArrayList<>();
		for (int i = 1; 6*i <= 200; i++ ) {
				list3.add(6*i);
		}
		System.out.println(list3); 
		
		// for (int i = 1; i <= 200; i++ ) {
		// if (i % 6 == 0) {
		//	list.add(i);
		//	} 요렇게 쓰는 게 코드 이해가 명확할 수 있음.
		//}
		
		// 1-2 학생 정보를 저장하기 위한 ArrayList 생성하기
		
		// 1. 프로그램은 사용자로부터 아래와 같은 메뉴를 입력받아 제공함 ( 학생 추가, 학생 목록 출력, 종료)
		// 1번 입력 시 사용자로부터 학생의 이름을 입력받고, ArrayList에 추가
		// 2번 입력 시 ArrayList에 저장된 모든 학생의 이름을 출력
		// 3번 입력 시 프로그램 종료 ( break 활용 )
		
		
		ArrayList<String> students = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean booleanFlag = true;
		int choice;
		
		System.out.println("학생 정보 관리 프로그램에 오신 것을 환영합니다.");
		
		while (booleanFlag) {

			System.out.println("--------------");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 목록 출력");
			System.out.println("3. 프로그램 종료");
			System.out.println("원하는 메뉴의 번호를 선택해주세요 : ");
			
			choice = sc.nextInt();
			sc.nextLine(); // 버퍼정리
			// 스트링, 입력 스트링, 출력 스트링에 대한 응답 속도와 같은 부분을 알아야 하므로 Pass
			// 사용 목적 : 가끔 입력이 씹히는 경우가 있어서 두는 안전장치
			
			
			switch(choice) {
			
			case 1 : 
				System.out.println("학생 이름을 적어주세요 : ");
				String studentName = sc.nextLine();
				students.add(studentName);
				System.out.println("이름 추가가 성공적으로 완료되었습니다.");
				break;
			
			case 2 : 
				System.out.println("현재 학생 목록 : " + students);
				break;
				
				// 향상된 for문 사용하면
				// System.out.println("현재 학생 목록 : ");
				// for (String st : student) {
				// 	System.out.println(st)
				// 	}
			
			case 3 : 
				System.out.println("관리 프로그램을 종료합니다.");
				booleanFlag = false; // while문 탈출을 위해 return을 사용할 수 있음. 8단원에서 학습 얘정
				break;
				
			default : 
				System.out.println("잘못된 값을 입력하셨습니다. 다시 진행해주세요.");
				break;
			
			}
		
		}
		
		// 2. HashMap 사용해보기
		// HaspMap 선언하기 ( 객체 생성 )
		HashMap<String, Integer> map = new HashMap<>();
		// 코드 입력 후 임포트하기( ctrl shift o )
		// 기존에는 Integer 또는 String 등 하나만 받았으나 Map은 Key / Value에 해당하는 두 개를 모두 받아야함
		
		// 값 넣어보기
		
		map.put("키1", 10);
		map.put("키2", 20);
		map.put("키3", 30);
		map.put("키4", 40);
		
		// keySet으로 key 출력 ( 배열 형태로 출력됨 )
		System.out.println(map.keySet());
		
		// Key 하나를 삭제하고 출력해보기
		
		map.remove("키2"); // 삭제하는 기준도 key
		
		System.out.println(map.keySet());
		
		// Key와 Value 모두 출력하기
		// 향상된 for문 사용(for-each)
		for (String item : map.keySet()) {
			System.out.println("Key : " + item + ", Value : " + map.get(item)); // item : 키 / get(item) : get(key)이므로 Value
		}
		
		// Q4. 회원 ID 중복 검사 시스템( HashMap )
		// 사이트에서 회원 가입을 받고 있음
		// 회원 ID와 나이를 함께 저장(String, Integer)
		
		HashMap<String, Integer> member = new HashMap<>();
		
		String[] ids = {"hong", "kim", "lee", "hong"};
		int[] ages = {20, 25, 30, 22};
		
		for (int i = 0; i < ids.length; i++) {
			
			System.out.println((i+1) + "번째 인원 추가중입니다.");
			
			if (member.containsKey(ids[i])) {
				System.out.println("이미 존재하는 ID입니다. 동명이인의 뒤에 숫자를 추가하겠습니다.");
				member.put(ids[i]+"I", ages[i]);
				System.out.println(ids[i] + " 회원 등록이 완료되었습니다.");
				System.out.println("----------------------");
			}
			else {
				member.put(ids[i], ages[i]);
				System.out.println(ids[i] + " 회원 등록이 완료되었습니다.");
				System.out.println("----------------------");
			}
			
			
		}
		
		for (String id : member.keySet()) {
			System.out.println("회원명 : " + id + ", Value : " + member.get(id));
		}
	}
	


}