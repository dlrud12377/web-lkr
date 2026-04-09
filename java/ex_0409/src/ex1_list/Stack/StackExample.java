package ex1_list.Stack;

import java.util.Stack;

// Stack
// LIFO(후입선출 - Last in First out) 구조를 가지는 자료구조

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
	
		// 스택에 데이터 추가 시 push() 사용 - add와 같은 역할
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		// 스택에 들어있는 내용 꺼낼 시 pop() 사용 - remove와 유사하나, 제일 뒤의 내용을 배열에서 지우면서 꺼냄
		
		System.out.println(stack.pop()); // 4
		
		// 현재 맨 위에 있는 값 조회 시 peak() 사용 - get과 유사하나, 맨 위의 값(제일 마지막에 들어온 값)을 볼 수 있음
		
		System.out.println(stack.peek()); // 3 (위에서 4 지웠으니 3이 제일 마지막으로 들어옴)
	}
}
