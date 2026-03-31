package ex2_super_method;

public class SuperSonicAirplane extends Airplane {
	// 상수 선언
	// NORMAL = 1
	// SUPERSONIC = 2
	final static int NORMAL = 1;
	final static int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행을 합니다.");
		}
		else {
			super.fly();
		}
	}
	
	public void flyModeChange(int mode) {
		if (mode == NORMAL) {
			System.out.println("일반 비행으로 변경합니다.");
			flyMode = NORMAL;
		}
		else if (mode == SUPERSONIC) {
			System.out.println("초음속 비행으로 변경합니다.");
			flyMode = SUPERSONIC;
		}
	}
}
