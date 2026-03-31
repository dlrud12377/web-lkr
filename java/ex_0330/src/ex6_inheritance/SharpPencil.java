package ex6_inheritance;

public class SharpPencil extends Pen {
	 //샤프펜
	
//	SharpPen클래스
//	- Pen을 상속받는다.
//	- 샤프심의 굵기를 나타내는 width 필드를 가진다.
	
		//field
	    private int width; //펜의 굵기
	    // amount 필드 상속
	    
	    // getter setter
	    // amount의 getter setter는 상속

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}
	    
	    
	}

