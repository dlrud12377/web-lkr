package ex3_CollectionsExample.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Bingo {
	
	public HashSet<Integer> bingo = new HashSet<>();
	public static Scanner sc = new Scanner(System.in);
	public List<Integer> bingoList;
	
	public Bingo() {
		createBoard();
	}
	
	public void createBoard() {
		// 1 ~ 50 사이의 난수가 있다.
		// 5 X 5의 빙고판에 25개의 숫자를 채운다.
		// 겹치면 안됨
		
		// 만약 숫자가 연속되게 들어간다면 섞어주기
		
		int ranNum;
		
		while(bingo.size() < 25) {
			ranNum = (int)(Math.random() * 50) + 1;
			bingo.add(ranNum);
		}
		
		bingoList = new ArrayList<>(bingo);
		Collections.shuffle(bingoList); 
		
		showBoard();
	}
	
	public void showBoard() {
		
		System.out.println("=== 현재 빙고판 ===");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (bingoList.get(5*i+j) == 0) {
					System.out.print("XX ");
				}
				else {
					System.out.printf("%02d ", bingoList.get(5*i+j));
				}
			}
			System.out.println();
		}
	}
	
	public boolean markNumber(int number) {
		for (int i = 0; i < 25; i++) {
			if (bingoList.get(i) == number) {
				bingoList.set(i, 0);
				showBoard();
				return true;
			}
		}
		System.out.println("해당하는 값이 빙고판에 없습니다.");
		showBoard();
		return false;
	}
	
	public int checkBoard() {
		int count = 0;
		boolean flag = false;
		
		// 1. 가로 빙고 : 0 1 2 3 4 / 5 6 7 8 9 / 10 11 12 13 14.. 5개씩 끊어서 전부 값이 0인지 확인
		// 2. 세로 빙고 : 0 5 10 15 20 / 1 6 11 16 21 / ... 5개씩 끊어서 전부 값이 0인지 확인
		// 3. 대각선 빙고 : 0 6 12 18 24 / 4 
		
		// 가로
		
		for (int i = 0; i < 5; i++) {
			
			flag = true;
			
			
			for (int j = 0; j < 5; j++) {
				if (bingoList.get(5*i + j) == 0) {
					continue;
				}
				else {
					flag = false;
					break;
				}
			}
			
			if (flag == false) {
				continue;
			}
			else {
				count++;
			}
			
		}
		
		// 가로 끝
		
		// 세로
		
		for (int i = 0; i < 5; i++) {
			
			flag = true;
			
			
			for (int j = 0; j < 5; j++) {
				if (bingoList.get(i + 5 * j) == 0) {
					continue;
				}
				else {
					flag = false;
					break;
				}
			}
			
			if (flag == false) {
				continue;
			}
			else {
				count++;
			}
			
		}
		
		// 세로 끝
		
		// 대각선 (6의 배수가 전부 0, or 4의 배수 전부 0)
		
		// 6의 배수
		
		for (int i = 0; i < 5; i++) {
			
			flag = true;
			
			if (bingoList.get(6 * i) == 0) {
				continue;
			}
			else {
				flag = false;
				break;
			}
		}
		
		if (flag == true) {
			count++;
		}
		
		// 6의 배수 끝
		
		// 4의 배수
		
		for (int i = 0; i < 5; i++) {
			
			flag = true;
			
			if (bingoList.get(4 * i) == 0) {
				continue;
			}
			else {
				flag = false;
				break;
			}
		}
		
		if (flag == true) {
			count++;
		}
		
		// 4의 배수 끝
		
		// count 반환하여 빙고 개수 알려주기
		
		System.out.println("현재 빙고 개수 : " + count);
		return count;
	}
	
	public void start() {
		
		int targetNum;
		int bingoCount;
		
		while (true) {
			
			
			
			System.out.println("종료를 원하시면 -1을 입력해주세요");
			System.out.print("숫자를 입력해주세요 : ");
			targetNum = sc.nextInt();
			
			if (targetNum == -1) {
				System.out.println("게임을 강제 종료합니다.");
				break;
			}
			else {
				markNumber(targetNum);
			}
			
			bingoCount = checkBoard();
			
			if (bingoCount >= 3) {
				System.out.println("게임에서 승리했습니다!!");
				break;
			}
		}
	
	}
}

 // 강사님은 이중리스트 / iterator 사용 / createBoard 따로 메서드로 빼고 Bingo class에 생성자로 createBoard로 만들어버림

 // 숫자를 체크하는 메서드
 // 매개변수 : int number
 // 메서드명 : markNumber
 // 숫자를 넘겨받으면 해당 빙고판의 숫자를 0으로 바꾸고 true를 반환
 // 아니면 false를 반환
