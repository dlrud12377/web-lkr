package ex2_file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExample {
	public static void main(String[] args) {
		// 메모장까지의 경로
		String path = "C:\\Users\\adminn\\Desktop\\web-lkr\\test.txt";
		
		// 준비된 경로로 File 객체를 생성
		// File 클래스
		// 자바에서 파일과 디렉터리(폴더)를 다루기 위한 클래스
		
		File f = new File(path);
		
		// getName();
		// 파일명 또는 마지막 경로명을 반환한다.

		System.out.println(f.getName()); // web-lkr
		
		// getPath();
		// 생성할 때 넣은 경로를 반환
		System.out.println(f.getPath()); // C:\Users\adminn\Desktop\web-lkr\test.txt
		
		// getAbsolutePath();
		// 절대 경로로 반환
		System.out.println(f.getAbsolutePath()); // 위와 동일하게 나옴(위 경로가 절대경로이기 때문)
		
		// 절대경로 vs 상대경로
		
		// 절대경로 : 운영체제 기준으로 전체 위치가 명확한 경로
		
		// 상대경로 : 현재 프로그램 실행 위치를 기준으로 한 경로
		// 상대경로는 편하지만, 프로그램을 어디서 실행하느냐에 따라 기준위치가 달라질 수 있다.
		// File f2 = new File("../test.txt");
		
		// exist()
		// 파일이나 폴더가 실제로 존재하는지 확인
		
		if(f.exists()) {
			System.out.println("파일이 존재합니다.");
		}
		else {
			System.out.println("존재하지 않습니다.");
		}
		// 파일이 존재합니다.
		
		// isFile() 
		// 최종 목적지가 파일인지 확인
		if(f.isFile()) {
			System.out.println("파일입니다.");
		}
		else {
			System.out.println("파일이 아닙니다.");
		}
		// 파일입니다.
		
		// isDirectory();
		// 최종 목적지가 폴더인지 확인
		if(f.isDirectory()) {
			System.out.println("폴더입니다.");
		}
		else {
			System.out.println("폴더가 아닙니다.");
		}
		// 폴더가 아닙니다.
		
		// length()
		// 파일 크기를 바이트 단위로 반환한다.
		System.out.println(f.length());
		
		// lastModified()
		// 마지막 수정 시간을 밀리초(long)로 반환한다.
		System.out.println(f.lastModified());
		
		// createNewFile()
		// 실제 빈 파일을 생성한다.
		// 프로젝트 root 경로에 만들어짐
		// 이미 있으면 false를 반환한다.
		
		File f2 = new File("text.txt");
		try {
			boolean result = f2.createNewFile();
			System.out.println(result ? "파일 생성 성공" : "파일이 이미 존재함");
			// f : 파일이 이미 존재함(만들어뒀으니) / f2 : 파일 생성 성공
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// mkdir()
		// 폴더를 생성해준다.
		File dir = new File("myFolder");
		boolean result = dir.mkdir();
		if(result) {
			System.out.println("폴더 생성");
		}
		else {
			System.out.println("이미 폴더가 존재합니다.");
		}
		
		// mkdirs()
		// 필요한 상위 폴더를 포함한 모든 폴더를 생성해준다.
		dir = new File("a/b/c");
		result = dir.mkdirs();
		if(result) {
			System.out.println("폴더들 생성");
		}
		else {
			System.out.println("이미 폴더가 존재합니다.");
		}
		
		// mkdirs()는 폴더 1개만 만드는 것도 가능
		// mkdir()은 폴더를 여러개 만드는 것은 불가능
		
		// delete()
		// 파일 또는 빈 폴더를 삭제한다.
		result = f2.delete();
		
		if(result) {
			System.out.println("삭제 완료");
		}
		else {
			System.out.println("삭제 실패");
		}
		
		// 폴더는 내부가 비어있어야 삭제 가능
		// 안에 파일이 있는 폴더는 바로 삭제되지 않는다.
		
		// list()
		// 이름 목록을 문자열 배열로 반환한다.
		dir = new File("C:\\Users\\adminn\\Desktop\\web-lkr\\java\\ex_0415");
		String[] names = dir.list();
		
		if (names != null) {
			System.out.println(Arrays.toString(names));
		}
		// [.classpath, .gitignore, .project, .settings, a, bin, myFolder, src]
		
		// listFiles()
		// File[] 배열로 반환
		File[] files = dir.listFiles((d, name) -> name.endsWith(".txt"));
		// predicate 함수를 이용해 boolean값을 넣어 필터링 가능
		
		for (File file : files) {
			System.out.println(file.getName());
		}
		
		// File로는 파일 안에 쓰여진 내용을 읽고 쓸 수는 없다는 점
		// 파일 자체가 아니라 파일의 위치정보와 상태정보를 담당한다.
	}
}
