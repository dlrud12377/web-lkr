package ex6_inheritance;

public class FountainPen extends Ballpen {
	
//	FountainPen클래스
//	- BallPen클래스를 상속받는다.
//	- 만년필은 잉크를 다시 채울 수 있으므로 refill(int n)메서드를 작성한다.
//	- refill 메서드는 남은 양을 n으로 변경한다.
    
    // getter setter : 생략(두 정보에 대한 getter setter 모두 상속받음)
    
    // refill
    public void refill(int n){
    	setAmount(n);
    	}
}
