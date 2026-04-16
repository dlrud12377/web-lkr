package ex2_charstream.exam2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MainMethod {
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			showMenu();
			
			try {
				
				// 메뉴 선택
				System.out.print("원하는 메뉴 번호를 입력해주세요 : ");
				int choice = sc.nextInt();
				
				// 회원가입
				if (choice == 1) {
					
					System.out.print("아이디를 입력해주세요 : ");
					String id = sc.next();
					
					System.out.print("비밀번호를 입력해주세요 : ");
					String password = sc.next();
					
					recordUsers(id, password);
					System.out.println("정상적으로 기록되었습니다!");
					
				}
				
				// 로그인
				else if (choice == 2) {
					
					System.out.print("아이디를 입력해주세요 : ");
					String id = sc.next();
					
					System.out.print("비밀번호를 입력해주세요 : ");
					String password = sc.next();
					
					tryLogin(id, password);
				}
				
				// 종료
				else if (choice == 3) {
					System.out.println("프로그램을 종료합니다.");
					return; // 메서드 종료(프로그램 종료)
				}
				
				// 1~3이 아닐 경우 : 예외 던지고 예외에서는 continue로 반복문 처음으로 돌아감
				else {
					throw new Exception("잘못된 입력값입니다. 메뉴로 돌아갑니다.");
				}
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void showMenu() {
		System.out.println("=== USER MENU ===");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
	}
	
	public void recordUsers(String id, String password) {
		// id, 비밀번호를 입력받아서 유저 객체에 저장
		// users.txt에 유저 추가
		User user = new User(id, password);
		
		byte[] userByteInfo = user.toByteData();
		
		try(FileOutputStream fos = new FileOutputStream("users.txt", true);) {
			fos.write(userByteInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void tryLogin(String id, String password) {
		
		File f = new File("users.txt");
		
		if (!f.exists()) {
			System.out.println("가입된 회원이 없습니다.");
			return;
		}
		
		byte[] txtInfo = new byte[(int)f.length()];
		
		try(FileInputStream fis = new FileInputStream("users.txt")) {
			
			fis.read(txtInfo);
			
			String txtToString = new String(txtInfo);
			
			if (txtToString.isEmpty()) {
				System.out.println("등록된 회원이 없습니다.");
				return;
			}
			
			String[] idpwPairs = txtToString.split("\n");
			
			
			boolean loginSuccess = false;
			boolean idCorrect = false;
			
			for (String pair : idpwPairs) {
				String[] user = pair.split(":");
				if (user[0].equals(id)) {
					if (user[1].equals(password)) {
						loginSuccess = true;
					}
					else {
						idCorrect = true;
						break;
					}
				}
				else {
					break;
				}
			}
			
			if (loginSuccess) { 
				System.out.println("로그인 성공!");
			}
			else if (idCorrect) {
				System.out.println("비밀번호가 다릅니다.");
			}
			else {
				System.out.println("입력하신 아이디가 없습니다.");
			}
			

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
