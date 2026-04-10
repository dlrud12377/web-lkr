package Q3;

public class DiscountCalculator {
	   public static void main(String[] args) {
	       int price = 10000;
	       String grade = "VIP";
	       int discountedPrice = 0;
	 
	       // [A] 아래에 설계서에 맞는 조건문을 작성하시오.

	       if (grade.equals("VIP")) { 
	           discountedPrice = (int)(price * 0.8); 
	       } 

	       // [B] 나머지 로직
	       else if (grade.equals("GOLD")) {
	    	   discountedPrice = (int)(price * 0.9);
	       }
	       
	       else {
	    	   discountedPrice = price;
	       }
	       
	       System.out.println("할인 가격 : " + discountedPrice);
	   }
	}