package ex2_charstream.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileConverter {
	
	public void copy(String source, String target) {
		// 특정 이미지 파일 복사 후 새 파일 생성
		// 복사된 파일의 크기(byte)를 log.txt에 기록하는 기능
		// 1024바이트씩 읽어서 복사하기
		
		// 읽는 단위가 다른데..흠
		
		int code = 0;
		long totalBytes = 0;
		
		byte[] buffer = new byte[1024];
		
		try(FileInputStream reader = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(target);) {

			while((code = reader.read(buffer)) != -1) {
				fos.write(buffer, 0, code);
				totalBytes += code;
			}
			System.out.println(totalBytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 로그 기록
		
		try (FileOutputStream logFos = new FileOutputStream("log.txt", true);) {
			
			String message = "기록 완료 : " + totalBytes + "Bytes";
			logFos.write(message.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
