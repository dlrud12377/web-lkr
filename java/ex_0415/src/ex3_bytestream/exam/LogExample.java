package ex3_bytestream.exam;

import java.io.File;
import java.io.FileInputStream;

public class LogExample {
	public static void main(String[] args) {
		// error.log파일을 읽어서 "ERROR"라는 단어가 몇 번 등장하는지 출력하세요
		
		File f = new File("logs\\error.log");
		
		byte[] logByte = new byte[(int) f.length()];
		
		if (!f.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		else {
			try {
				FileInputStream fis = new FileInputStream(f);
				
				fis.read(logByte);
				String log = new String(logByte);
				
				fis.close();
				//
				int count = 0;
				String targetWord = "ERROR";
				
				if (log.startsWith(targetWord)) {
					if (log.endsWith(targetWord)) {
						count += 2;
					}
					else {
						count++;
					}
				}
				
				String[] splByWord = log.split(targetWord);
				count += (splByWord.length-1);
				
				System.out.println("ERROR가 나온 횟수 : " + count);
				//
				
				// 강사님 방식
				int index = 0;
				count = 0;
				
				while((index = log.indexOf("ERROR", index)) != -1) {
					count++;
					index += "ERROR".length();
				}
				
				System.out.println("ERROR가 나온 횟수 : " + count);
				
				

			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
