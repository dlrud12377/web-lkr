package ex1_exception.throwsexample;

public class ThrowsExample2 {
	public static void main(String[] args) throws Exception { // 2차로 예외 넘겨받음
		// 2차로 떠넘긴 예외는 결국 JVM이 최종적으로 처리를 진행함
		// JVM은 예외의 내용을 콘솔에 출력하는 것으로 예외 처리를 함
			findClass(); // 1차로 예외 넘겨받음
	}
	
	// 나열해야 하는 예외 클래스가 많은 경우 throws Exception이나 throw Throwable만으로
	// 모든 예외를 간단히 넘길 수 있다.
	
	public static void findClass() throws ClassNotFoundException
	{
		// java.lang.String2 클래스를 찾아서 메모리에 올리는 기능
		Class.forName("java.lang.String2");
	}
}
