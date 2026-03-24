package ex3_switch;

import java.util.Scanner;

public class SwitchExpressionExample {
	public static void main(String[] args) {
		// break를 빼먹으면 fall-through가 발생한다.
		// 값을 변수에 넣으면 중복 코드가 많아진다.
		
//		int num = 2;
//		String result;
//		switch(num) {
//		case 1:
//			result = "A";
//			break;
//		case 2:
//			result = "B";
//			break;
//		case 3:
//			result = "C";
//			break;
//		default:
//		}
		
		// 여러 case를 묶기가 불편하다
//		int day = 3;
//		String type;
//		switch(day) {
//		
//		case 1 :
//		case 2 :
//		case 3 :
//		case 4 :
//		case 5 :
//			type = "평일";
//			break;
//		case 6 :
//		case 7 :
//			type = "주말";
//			break;
//		
//		}
		
		// 변수 지정과 동시에 switch를 진행할 수도 있음(최신)
		int num = 2;
		String result = switch(num) {
		case 1 -> "A";
		case 2 -> "B";
		case 3 -> "C";
		default-> "F";
		};
		
		
		int day = 3;
		String type = switch(day) {
		case 1,2,3,4,5 -> "평일";
		case 6,7 -> "주말";
		default -> "잘못된 값"; // 최신 표기법에서는 default가 없으면 오류 발생함
		};
		
		// 화살표 오른쪽에 여러 줄의 로직이 필요하다면 { }를 써야 한다.
		// 이때 최종적으로 반환할 값을 명시하려면 yield 키워드를 사용한다.
		result = switch(num) {
		case 1 -> "하나";
		case 2 -> {
			System.out.println("2가 입력됨");
			yield "둘";
		}
		default -> "기타";
		};
		
		// Q1. 정수형 변수를 하나 만들고 해당 달이 몇일까지 있는지 switch문을 이용하여 작성하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 12월 중 하나를 골라 적어주세요(숫자만) : ");
		int month = sc.nextInt();
		
		result = switch(month) {
		case 1,3,5,7,8,10,12 -> (month + "월은 31일까지 있습니다.");
		case 2 -> (month + "월은 28일까지 있습니다.");
		case 4,6,9,11 -> (month + "월은 30일까지 있습니다.");
		default -> "잘못된 값을 입력하셨습니다. 다시 진행해주세요";
		};
		
		System.out.println(result);
		
		// Q2. 계산기 만들기
		// 두 개의 정수형 변수를 키보드에서 입력받는다.
		// 연산자 기호를 담아줄 무낮열 변수를 만든다.
		// switch문을 이용하여 정수의 연산을 수행하는 코드 작성하기
		
		// scanner 생략
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("사용할 연산자 입력(+, -, *, /)");
		String op = sc.next();
		
//		int result2;
//		
//		switch(op) {
//		case "+" : {
//			result2 = num1 + num2;
//			System.out.printf("%d + %d = %d\n", num1, num2, result2);
//			break;
//			}
//		case "-" : {
//			result2 = num1 - num2;
//			System.out.printf("%d - %d = %d\n", num1, num2, result2);
//			break;
//			}
//		case "*" : {
//			result2 = num1 * num2;
//			System.out.printf("%d - %d = %d\n", num1, num2, result2);
//			break;
//			}
//		case "/" : {
//			double result3 = num1 / (double)num2;
//			System.out.printf("%d / %d = %.2f\n", num1, num2, result3);
//			break;
//			}
//		default : {
//			System.out.println("잘못된 기호입니다.");
//			}
//		}
		
		// 좀더 간단한 버전(계산 결과 저장하지 않고, string째로 저장하기)
		String result2 = switch(op) {
		case "+" -> num1 + " + " + num2 + " =  "+ (num1 + num2);
		case "-" -> num1 + " - " + num2 + " =  "+ (num1 - num2);
		case "*" -> num1 + " * " + num2 + " =  "+ (num1 * num2);
		case "/" -> num1 + " / " + num2 + " =  "+ (num1 / (double)num2);
		default -> "올바른 연산자를 입력하지 않았습니다.";
		};
		System.out.println(result2);
		
		
		
		
	}
}
