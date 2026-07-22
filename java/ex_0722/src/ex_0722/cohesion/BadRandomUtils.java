package ex_0722.cohesion;

// 우연적 응집도
// 연관성이 전혀 없는 코드들이 무작위로 모여있는 것
// - 모듈화로서의 장점이 전혀 없음
// - 코드를 수정해야 할 때 어디서 어떤 부작용이 터질지 예측할 수 없음
// - 가독성이 최악이며, 단위 테스트 작성이 매우 곤란함.
// - 코드의 중복과 혼란을 극대화하여 유지보수 비용을 폭증시킴.
public class BadRandomUtils {
	
	// 하나의 모듈에 전혀 상관없는 코드들이 모여 있음
	public void doRandomThings() {
		calculateTax(); // 세금계산
		playAlarmSound(); // 알람 실행
		checkPrinterPaper(); // 종이 개수 확인하기
	}

	private void calculateTax() {
		// TODO Auto-generated method stub
		
	}

	private void playAlarmSound() {
		// TODO Auto-generated method stub
		
	}

	private void checkPrinterPaper() {
		// TODO Auto-generated method stub
		
	}
	
}
