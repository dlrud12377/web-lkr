package ex1_abstract.Example2;

// 2. Bus클래스를 만들고 TransPort클래스를 상속
public class Bus extends Transport {
	
	public int distance = 0;
	
	public Bus(String name, int baseFare) {
		super(name, baseFare);
	}
	
	@Override
	public void printFare() {
		showName();
		System.out.println("해당 탈것은 거리에 상관없이 기본요금만 부과됩니다.");
		System.out.println("총 요금 : " + calculatorFare() + "원");
		}
	
	@Override
	public int calculatorFare() {
		return baseFare;
	}
}
