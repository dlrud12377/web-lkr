package ex2_annotation.standard;

public class DeprecatedExample {
	
	@Deprecated // 더 이상 사용을 권장하지 않는 기능에 붙임
	public static void oldMethod() {
		System.out.println("오래된 메서드");	
	}
	
	public static void main(String[] args) {
		oldMethod(); // 사용할 때도 취소선이 그려짐
	}
}
