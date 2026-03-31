package ex1_final;

public class Parking {
	
	// 기본요금 : 10,000원(상수)
	static final int BASE_FEE = 10000;
	
	// 추가요금 : 시간당 2,000원(상수)
	static final int ADDITIONAL_TIME_FEE = 2000;
	
	// 기본주차시간 : 1시간
	static final int BASE_TIME = 1;
	
	// 요금 계산 메서드
	public static int finalFee(double time) {
		
		// 올림 적용
		int intTime = (int)time + 1;
		return BASE_FEE + ADDITIONAL_TIME_FEE * (intTime - BASE_TIME);
	}
}
