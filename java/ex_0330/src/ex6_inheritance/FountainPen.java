package ex6_inheritance;

public class FountainPen extends Ballpen {
	
//	FountainPen클래스
//	- BallPen클래스를 상속받는다.
//	- 만년필은 잉크를 다시 채울 수 있으므로 refill(int n)메서드를 작성한다.
//	- refill 메서드는 남은 양을 n으로 변경한다.
	
	//field
    private int amount; //만년필
    private String color; //볼펜의 색
    
    public FountainPen(int amount, String color) {
    	super(amount, color);
    }
    
    // getter setter
    public int getAmount(){
    	return amount;
    	}
    
    public void setAmount(int amount){
    	this.amount = amount;
    	}
    
    public String getColor(){
    	return color;
    	}
    
    public void setColor(String color){
    	this.color = color;
    	}
    
    // refill
    public void refill(int n){
    	setAmount(n);
    	}
}
