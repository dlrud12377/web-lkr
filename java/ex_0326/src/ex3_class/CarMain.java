package ex3_class;

public class CarMain {
	public static void main(String[] args) {
		// Scanner 변수명 = new Scanner(); - 객체 만드는 법임(스캐너가 객체이기 때문)
		Car k5 = new Car();  // 자동차를 1대 만듦
		
		// 객체를 통해 필드에 접근하는 방법
		// 변수명.필드명;
		// 필드에 들어있던 값을 수정할 수 있다.
		k5.price = 1000000;
		k5.color = "White";
		k5.brand = "KIA";
		k5.wheel = 4; 
		// 정의되지 않은 필드를 사용할 수는 없다. // 자바스크립트는 가능
		//k5.tire = "금호타이어"; (X)
		
		System.out.println("가격 : " + k5.price);
		System.out.println("색상 : " + k5.color);
		System.out.println("상표 : " + k5.brand);
		
		// 두 번째 자동차 객체 만들기
		Car lamborghini = new Car();
		lamborghini.price = 100000000;
		lamborghini.color = "Green";
		lamborghini.brand = "Audi";
		lamborghini.wheel = 4;
		
	}
}
