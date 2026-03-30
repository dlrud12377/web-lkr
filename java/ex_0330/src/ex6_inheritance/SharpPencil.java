package ex6_inheritance;

public class SharpPencil extends Pen {
	 //샤프펜
	
//	SharpPen클래스
//	- Pen을 상속받는다.
//	- 샤프심의 굵기를 나타내는 width 필드를 가진다.
	
		//field
	    private int width; //펜의 굵기
	    private int amount; //남은 량
	    
	    public SharpPencil(int amount, int width) {
	    	super(amount);
	    	this.width = width;
	    }
	    
	    // getter setter
	    public int getAmount(){
	    	return amount;
	    	}
	    
	    public void setAmount(int amount){
	    	this.amount = amount;
	    	}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}
	    
	    
	}

