# \# : 대제목
##  \#\# : 중간제목
### \#\#\# : 소제목

--- : 구분선
 - 목록2
 - 목록3
    - 하위 목록
       -하위의 하위 목록

\`\`\` : 코드 작성가능

 ```java
System.out.println("Hello Java");
 ```

 ```c
 printf("%d",100);
 ```

작성법 youtube : https://www.youtube.com/watch?v=fF8BlWv8W10

---
## 4/08

### 오늘의 애로사항

   1. 와일드카드 사용 시 객체 내 필드 불러오기가 어려움
   ```java
   package ex1_generic.exam6_animal;

   import java.util.List;

   public class AnimalPrint {
      
      public void printAnimals(List<? extends Animal> list) {
         
         System.out.print("[");
         for (Object animal : list) {
            System.out.print(animal);
            if (list.get(list.size()-1) == animal) {
               continue;
            }
            System.out.print(", ");
         }
         System.out.print("]");
         // 주소만 나오는데.. 일단 포기
      }
   }
   ```
   문제점 : 와일드카드 사용으로 인해 클래스 객체인 Animal 내의 정보인 name을 출력할 방법이 없음.
      - 와일드카드 사용 시 실행 전까지 어떤 객체를 쓸지 결정되지 않으므로 메서드를 따로 빼놓으면 안의 정보만으로 진행하기 어려움.
      - 현재 스스로 생각한 해결 방안은 와일드카드를 포기하고, printAnimals를 Animal 객체의 메서드로 편입시키는 방법 뿐인듯함.

   2. 
   ```java
   // 와일드카드를 적용(Number 상한제한)한 리스트 내의 원소들의 값의 합을 구하는 문제
   package ex1_generic.exam7;

   import java.util.Arrays;
   import java.util.List;

   public class Main {
      public static void main(String[] args) {
         List<Integer> a = Arrays.asList(1, 2, 3, 4, 5);
         List<Double> b = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
         
         Main.sum(a);
         Main.sum(b);
         
      }
      
      public static void sum(List<? extends Number> list) {
         
         double sum = 0;
         for (Number num : list) {
            sum = sum + num.doubleValue();
         }
         if (list.get(0) instanceof Integer) {
            System.out.println("총합 : " + (int)sum);
         }
         else if (list.get(0) instanceof Double) {
            System.out.println("총합 : " + sum);
         }	
      }
   }
   ```
    - 문제점 : Number 타입인 상태로는 사칙연산을 진행할 수 없었음.
      -> 따라서 사칙연산을 진행할 수 있는 상태로 반환해주어야 하는데, Number 값을 .doubleValue() 메서드를 이용해 반환하여 실수 범위에서 모든 값의 계산을 가능하게 함.

    - 문제점 2 : 위 내용대로 진행했을 때, 정수의 덧셈임에도 불구하고 합이 실수 상태로 나오게 됨.
      -> 이를 해결하기 위해 list 내 첫번째 값의 타입을 파악하고, 그 타입이 리스트 전체의 타입과 같으므로 정수의 경우 sum의 값을 int로 type-casting 해주었음.
