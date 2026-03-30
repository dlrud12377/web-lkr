package ex4_getter_setter;

public class Car {
	
	// private로 선언된 필드는 외부에서 접근이 안된다.
	private int speed;
	private boolean stop;
	
	// setter & getter
	// - private로 선언된 필드에 접근할 수 있도록 해주는 메서드
	
	// speed의 값을 세팅해주는 setSpeed 메서드 만들기
	// 속도값은 호출할 때 받아온다.
	// 속도가 0보다 작은 경우 0으로 만든다.
	// 0보다 크면 필드에 세팅한다.
	
	public void setSpeed(int speed) {
		if (speed < 0) {
			System.out.println("올바르지 못한 값을 입력하여 속도가 0으로 초기화됩니다.");
			this.speed = 0;
			return;
		}
		else {
			this.speed = speed;
		}
	}
	
	// speed의 값을 반환하는 getSpeed 메서드 만들기
	public int getSpeed()
	{
		return this.speed;
	}
	
	// stop에 대해서도 getter/setter 작성
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop == true) {
			this.speed = 0;
		}
	}
	
	public boolean isStop() {
		return this.stop;
	}
	
	
}
