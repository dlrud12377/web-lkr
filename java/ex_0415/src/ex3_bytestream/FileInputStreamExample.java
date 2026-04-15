package ex3_bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 스트림(Stream)
// 데이터가 한 방향으로 흐르는 통로
// 파일에 데이터를 저장하거나, 파일에서 데이터를 읽어올 때
// 자바는 데이터를 한 번에 통째로 다루기보다 흐름처럼 조금씩
// 읽고 쓰는 방식으로 처리함

// 데이터를 1바이트(8비트)로 처리하는 스트림이다.
// 데이터를 앚두 작은 단위인 바이트로 읽고 쓴다.

public class FileInputStreamExample {
	public static void main(String[] args) {
		
		byte[] read = new byte[100];
		
		// 파일에서 바이트 단위로 데이터를 읽어오는 클래스
		// 파일이 없으면 예외가 발생할 수 있기 때문에 예외처리를 해주어야 함
		try {
			FileInputStream fis = new FileInputStream("text.txt");
			
			// read()
			// 파일에서 1바이트를 읽어서 int로 반환
			// int로 반환하는 이유 : 파일의 끝(End OF File)을 표현하기 위해서
			// 파일의 끝 : -1
			
//			data = fis.read(); // 한 번 읽기
			
			// 전부 읽으려면
//			int data;
//			while ((data = fis.read()) != -1) {
//				System.out.print(data + " "); // 유니코드 번호로 나옴
//				// 236 149 136 235 133 149 237 149 152 236 132 184 236 154 148 97 98 99
//				
//			}
			
			//read()메서드는 1바이트씩 읽어들이지만
			//read(byte[] b)는 한번에 읽어와서 배열에 집어넣는다. -> 반복문을 사용할 필요가 없음
			fis.read(read);
			
			String result = new String(read); // byte 문자열을 String으로 규합
			
			System.out.println(result);
			
			// 다 읽으면 stream을 닫아야 함
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
