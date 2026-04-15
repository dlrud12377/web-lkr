package ex2_file.exam;

import java.io.File;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// 1. 폴더가 없으면 생성
		File dir = new File("examfolder");
		
		if(!dir.exists()) {
			boolean created = dir.mkdir();
			if (created) {
				System.out.println("폴더 생성");
			}
			else {
				System.out.println("폴더 생성 실패");
				return; // 아니면 밑의 내용이 진행이 되지 않으니 return으로 종료
			}
		}

		// 2. 폴더인지 확인
		
		if (!dir.isDirectory()) {
			System.out.println("폴더가 아닙니다.");
			return; // 폴더가 아니면 밑의 내용이 성립되지 않으니 종료
		}
		
		
		// 3. 내부 목록 조회
//		String[] examFolderPrograms = dir.list();
//		System.out.println(Arrays.toString(examFolderPrograms));
		
		File[] examFolderPrograms = dir.listFiles();
		
		for (File item : examFolderPrograms) {
			if (item.isDirectory()) {
				System.out.println("[DIR] " + item.getName());
			}
			else if (item.isFile()) {
				System.out.println("[FILE] " + item.getName());
			}
		}
		
		System.out.println("총 항목 수 : " + examFolderPrograms.length);
		
		
		
		
	}
}
