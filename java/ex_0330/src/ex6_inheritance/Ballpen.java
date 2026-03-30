package ex6_inheritance;

public class Ballpen extends Pen { 

//볼펜
	
//	BallPen클래스
//	- Pen클래스를 상속받는다.
//	- 볼펜의 색을 나타내는 color필드를 가진다.
	


	// field
    private int amount; //남은 양
    private String color; //볼펜의 색
    
	public Ballpen(int amount, String color) {
		super(amount);
		this.color = color;
	}
	

    // getter setter    
    public String getColor(){
    	return color;
    	}
    
    public void setColor(String color){
    	this.color = color;
    	}
}
