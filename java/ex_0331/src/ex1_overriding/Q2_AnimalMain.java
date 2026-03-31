package ex1_overriding;

public class Q2_AnimalMain {
	public static void main(String[] args) {
		
		// 객체 생성
		Q2_Animal mallangCow = new Q2_Animal();
		Q2_Dog kimDoggy = new Q2_Dog();
		Q2_Cat ddungNyang = new Q2_Cat();
		
		// sound() 메서드 출력
		mallangCow.sound();
		kimDoggy.sound();
		ddungNyang.sound();
		
	}
}
