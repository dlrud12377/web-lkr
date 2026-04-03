package ex1_abstract.Example2;

// 2. Taxi클래스를 만들고 TransPort클래스를 상속
public class Taxi extends Transport {
	public int distance;
	public int farePerKm;
	
	public Taxi(String name, int baseFare, int distance, int farePerKm) {
		super(name, baseFare);
		this.distance = distance;
		this.farePerKm = farePerKm;
	}
	
	@Override
	public void printFare() {
		showName(); // 메서드 내에 메서드를 호출 가능(showName은 부모 클래스에 있음)
		if (distance <= 0) {
			System.out.println("잘못된 값을 입력하여 거리가 0으로 설정됩니다.");
		}
		else {
			System.out.println("거리(km) : " + distance);
		}
		System.out.println("총 요금 : " + calculatorFare() + "원");
		}
	
	@Override
	public int calculatorFare() {
		return baseFare + distance * farePerKm;
	}
}
