package ex1_abstract.Example2;

// 추상메서드
// 1. 기능을 간단히 구현만 해놓음
// 2. 구현한 기능을 상속하여 구체적인 재정의를 해줄 자식 클래스가 필요함

// 추상메서드 vs 인터페이스?



//Transport 추상클래스
//필드
//(생성자를 통해 값을 전달받는다.)
//- String name 
//- int baseFare
//메서드
//- void showName() : "교통수단: 버스"
//- void printFare(int distance)
//ㄴ showName()을 호출
//ㄴ 거리를 출력
//ㄴ 요금 계산 : "총 요금 xx원" 형식으로 출력
//추상메서드
//- int calculatorFare();
abstract class Transport {
	public String name;
	public int baseFare;
	
	// 생성자
	public Transport(String name, int baseFare) {
		this.name = name;
		this.baseFare = baseFare;
	}
	
	// 메서드(구현된 기능) - 추상클래스 안에서도 일반 메서드를 구현 가능
	public void showName() {
		System.out.println("교통수단 : " + name);
	}

	
	// distance때문에 override 하는게 나을듯
	public abstract void printFare();	
	
	public abstract int calculatorFare();
	
}
