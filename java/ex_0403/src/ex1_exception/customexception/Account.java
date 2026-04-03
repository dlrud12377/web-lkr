package ex1_exception.customexception;

public class Account {

	private long balance;
	
	public Account() {};
	
	// 잔액을 반환하는 getter()
	public long getBalance() {
		return balance;
	}
	

	
	// 돈을 매개변수로 받아 잔액 추가(입금)를 하는 메서드 deposit() - setter와 유사한 역할
	public void deposit(long money) {
		if (money < 0) {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
		else {
			balance += money;
		}

	}
	
	// 출금
	public void withdraw(int money) throws InsufficientException {
		if (balance < money) {
			// 강제로 예외 발생시키기
			throw new InsufficientException("잔고 부족 : " + (money - balance) + "원 모자람");
		}
		balance -= money; // 오류 발생 시 뒤 코드는 실행이 안되어서 else 필요없음
	}
	
	
}
