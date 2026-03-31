package ex4_getter_setter;

public class CarMain {
	public static void main(String[] args) {
		Car c = new Car();
		
		// 잘못된 속도로 변경
		c.setSpeed(-50); // 올바르지 못한 값을 입력하여 속도가 0으로 초기화됩니다.
		
		System.out.println("현재 속도 : " + c.getSpeed()); // 현재 속도 : 0
		
		// 올바른 속도로 변경
		c.setSpeed(60); // 변경완료(오류메시지 x)
		
		System.out.println("현재 속도 : " + c.getSpeed()); // 현재 속도 : 60
		
		// 멈춤
		
		if(!c.isStop()) {
			c.setStop(true);
		}
		
		System.out.println("현재 속도 : " + c.getSpeed()); // 현재 속도 : 0
	}
}
