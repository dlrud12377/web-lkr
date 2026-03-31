package ex6_inheritance;

public class PenMain {
	public static void main(String[] args) {
//		필기구 클래스를 상속으로 설계하시오
//		- 여러 종류의 필기구를 관리하는 프로그램
//		- 필기구에는 공통적으로 남은양(amount)가 있고, 종류에 따라 추가 속성이 있을 수 있다.
		FountainPen fp = new FountainPen(); // 다른방법?
		
		fp.setAmount(8);
		fp.setColor("검정색");
		
		System.out.println("잉크의 양 : " + fp.getAmount() + ", 만년필의 색깔 : " + fp.getColor());
	}
}
