package ex3_bytestream.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Example {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// file.txt를 만들고 아무 내용이나 입력해둔다.
		// FileInputStream을 이용해 내용을 읽어온 뒤
		// 뒤집어도 같은 내용인지 아닌지를 판별하세요.
		
		// 메모장 내용을 담을 배열 미리 준비
		boolean isPalindrome = true;
		
		File f = new File("file.txt");
		byte[] notepad = new byte[(int)f.length()];
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// palindrome 회문
		try {
			FileInputStream fis = new FileInputStream(f);
			fis.read(notepad);
			
			System.out.println(Arrays.toString(notepad));
			// 걍 byte 상태로는 정보 다루기가 불가능한듯
			
			String noteDetail = new String(notepad);
			
			fis.close();
			
			if (noteDetail == null) {
				System.out.println("파일 내용이 없습니다.");
				return;
			}
			

			
			else {
				for (int i = 0; i < noteDetail.length() / 2; i++) {
					if (noteDetail.charAt(i) != noteDetail.charAt((noteDetail.length()-1)-i)) {
						isPalindrome = false;
						break;
					}
				}
			}
			
			if (isPalindrome) {
				System.out.println(noteDetail + "은 회문입니다.");
			}
			else {
				System.out.println(noteDetail + "은 회문이 아닙니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
	}
	
	// 왜 결과가 반대로 나오지? -> 배열이 이상함
}
