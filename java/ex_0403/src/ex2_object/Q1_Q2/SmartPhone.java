package ex2_object.Q1_Q2;

public class SmartPhone {

	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	// getter
	public String getCompany() {
		return company;
	}
	
	public String getOs() {
		return os;
	}
	
	@Override
	public String toString() { // 주소값이 아니라 회사와 운영체제가 출력되도록 오버라이드
		return "회사 : " + company + ", 운영 체제 : " + os;
	}
}
