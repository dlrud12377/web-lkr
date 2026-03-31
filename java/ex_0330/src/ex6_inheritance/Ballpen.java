package ex6_inheritance;

public class Ballpen extends Pen { 

//볼펜
	
//	BallPen클래스
//	- Pen클래스를 상속받는다.
//	- 볼펜의 색을 나타내는 color필드를 가진다.
	

    private String color; //볼펜의 색
    // amount는 상속받음

	

    // getter setter    
    public String getColor(){
    	return color;
    	}
    
    public void setColor(String color){
    	this.color = color;
    	}
    
    // amount의 getter setter는 상속으로 이미 있는 상태
}
