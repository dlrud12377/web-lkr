package ex1_generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericCasting {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		
//		print(list); 
		// 안됨. 타입이 Object로 제한되어있고, 업캐스팅이 되지 않아서 컴파일 에러
	}
	
	public static void print(List<Object> list) {
		for(Object e : list) {
			System.out.println(e);
		}
	}
}
