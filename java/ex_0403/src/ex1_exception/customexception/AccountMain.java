package ex1_exception.customexception;

public class AccountMain {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(100000);
		System.out.println("예금액 : " + account.getBalance());
		
		// 15만원 출금하기
		try {
			account.withdraw(150000);
		} 
		catch (InsufficientException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("예상 범위 외의 예외 발생 : " +  e.getMessage());
		}
		
	}
}
