package ym;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("1.동물의 왕 사자");
      System.out.println("2.귀여운 고양이");
      System.out.println("3.멍멍 강아지");

      System.out.println("<입양할 펫을 선택하세요>\n 입력:");
      int choice = sc.nextInt();
      sc.nextLine();

      Pet pet = new Pet();
      switch (choice) {

      case 1:
         System.out.println("== 동물의 왕 사자를 선택하셨습니다! ==");
         System.out.println("입양한 펫의 이름을 선택해주세요: ");
         String name = sc.nextLine();
         pet.setPet(name);
         break;
      case 2:
         System.out.println("== 귀여운 고양이를 선택하셨습니다! ==");
         System.out.println("입양한 펫의 이름을 선택해주세요: ");
         String name1 = sc.nextLine();
         pet.setPet(name1);

         break;
      case 3:
         System.out.println("== 멍멍 강아지를 선택하셨습니다! ==");
         System.out.println("입양한 펫의 이름을 선택해주세요: ");
         String name2 = sc.nextLine();
         pet.setPet(name2);
         break;
      }
      System.out.println("\n\n\n" + pet.toString());
//      Lion lion = new Lion(pet);
//      Cat cat = new Cat(pet);
//      Dog dog = new Dog(pet);
      while (true) {
         pet.life();
         int number = sc.nextInt();
         

//         if (number == 1) {// 의사표현
//            if (choice == 1) {
//               lion.Llion();
//            }
//            if (choice == 2) {
//               cat.Express();
//            }
//            if (choice == 3) {
//               dog.Talent();
//            }
//         }

         if (number == 2) { // 밥 먹기 
            System.out.println("몇 그릇 담을까요? : ");
            int grem = sc.nextInt();
            pet.setBeb(grem);
            pet.Meal();
            
         }
         
         
         if (number == 3) {
            System.out.println("\n\n\n== 산책이 시작됩니다! ==");
            int i = 0;
            while(i < 3) {
               System.out.println("산책을 하려면 걸으세요 '뚜벅뚜벅'을 입력하세요 :");
               String dubug = sc.nextLine();
               if(dubug.equals("뚜벅뚜벅")) {
                  pet.walk();
                  ++i;
               }
               
            }
            
            System.out.println("30분이 지났습니다. 집으로 돌아갑니다.");
         
         }
         

      }
   }
}