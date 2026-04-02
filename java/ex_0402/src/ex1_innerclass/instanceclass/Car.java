package ex1_innerclass.instanceclass;

// 1. 클래스 내부에서만 쓰는 전용 객체
// 	(1). 외부에 공개할 필요가 없는 경우
//	(2). 강한 결합(항상 같이 움직이는 구조)
// 		- 두 클래스가 절대 분리되지 않을 때

public class Car {
	
	private class Engine {
		void start() {
			System.out.println("엔진 시동");
		}
	}
	
	void run() {
		Engine engine = new Engine();
		engine.start();
		// 엔진의 인스턴스 내부 클래스
	}
}
