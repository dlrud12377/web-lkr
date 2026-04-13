package ym;

public class Pet {
	   
	   private String name;
	   private int Hunger;
	   private int Energy;
	   private int beb;
	   public Pet() {
	      this.Energy = 50;
	      this.Hunger = 50;
	      
	   }
	   
	   
	   public void setPet(String name) {
	      this.name = name;
	   }
	   public String toString() {
	      return String.format("== {펫의 수치} ==\n이름: %s "
	            + "\n에너지: %d ("+name+"의 에너지의 기본 값입니다.)"
	                  + "\n배고픔: %d", name, Energy, Hunger);
	   }
	   public void setBeb(int beb) {
	      this.beb = beb;
	   }
	   
	   public String getName() {
	      return name;
	   }
	   public void life() {
	      System.out.println("[1] : 의사표현 ");
	      System.out.println("[2] : 밥 먹기 ");
	      System.out.println("[3] : 산책가기 ");
	      System.err.println("[4] : 잠자기 ");
	      
	      
	   }
	   public void Meal() {
	      if(Hunger < 100) {
	         this.Hunger = Hunger + beb*10; 
	            System.out.println("(배고픔이 " + beb*10 + "이 채워졌습니다.)"); 
	            }
	      else {
	         System.out.println("에너지가 10 채워졌습니다.");
	             this.Energy = Energy + 10;
	             this.Hunger = 0;
	             }
	      
	       if(Energy >= 60) {
	         System.out.println("에너지가 너무 넘칩니다./ 산책을 나가세요!");
	       }
	      
	      }
	   
	         
	      
	   
	   public void walk() {
	      this.Hunger = Hunger - 5;
	      
	      if(Hunger <= 0) {
	         this.Energy = Energy - 10;
	      }
	      
	      if(Energy <= 20) {
	         System.out.println(Energy + "에너지가 많이 없습니다 조심하세요!"); 
	      }
	      
	      else {
	         int j = 1;
	         System.out.println("상태: [에너지]"+Energy+
	               "[배고픔] "+Hunger +
	               "\n"+j*10+"분 지남");  
	      }
	   }
}