package ex1_bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyExample {
	public static void main(String[] args) {
		// 상대경로에 있는 이미지 파일을 바이트기반 스트림으로 읽어오기
		// 읽어서 복사본 만들기
		// 복사본 이름 : bridge_copy.jpg
		// 복사하면서 걸리는 시간을 currentTimeMillis(); 측정하기
		
		File f = new File("bridge.jpg");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		long start=0;
		long end=0;
		
		if (!f.exists()) {
			System.out.println("사진 없음");
			return;
		}
		
		byte[] picture = new byte[512];
		
		try {
			
			start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			
			// 파일 읽어 바이트배열에 저장
			fis = new FileInputStream(f);
			fos = new FileOutputStream("bridge_copy.jpg");
			
//			fis.read(picture);, fos.write(picture); 두 과정 한번에
			
			// 1. 1바이트씩 읽으면서 바로 쓰기
//			int data = 0;
//			
//			while ((data = fis.read()) != -1) {
//				fos.write(data);
//			}
			
			// 2. 바이트 배열 이용하여 한번에 읽고 한번에 쓰기
			
			int data = 0;
			
			while ((data = fis.read(picture)) != -1) {
				fos.write(picture, 0, data);
				
				// 파일은 4메가이지만, 우리가 전달한 배열은 512바이트
				// 우리가 전달한 파일을 512바이트씩 잘라서 여러번 읽고 쓰는 방식
			}
			
//			
			
			end = System.currentTimeMillis();

			System.out.println("이미지 읽기 종료");
			
			long processTime = end - start;
			
			System.out.println("작업에 걸린 시간 : " + processTime + "ms");
			// 작업에 걸린 시간
			// 1. 1바이트씩 읽고 쓰기 - 10733ms (거의 10초. 그냥 배열이 훨씬 빠르겠는데?)
			// 2. 512바이트씩 읽고 쓰기 - 32ms (걍 개빠름)
			
		} catch (Exception e) {
			
		}
		finally {
			try {
				// 닫을 때는 역순으로 닫기
				
				if(fos != null) {
					fos.close();
				}
				
				if(fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
