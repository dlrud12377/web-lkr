package ex3_generic;

public class DataSampleExample {
	public static void main(String[] args) throws NullPointerException {
		// 데이터리스트 객체 만들기
		// 제네릭 타입에 전달할 수 있는 것은 클래스밖에 안 된다. -> 기본형 변수타입은 Wrapper 클래스를 활용
		DataList<Integer> list = new DataList<Integer>(); // <>(); 로 생략도 가능
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
//		list.add("문자열");
//		list.add(3.14);
		
//		// 배열에 들어있는 내용을 출력
//		for (int i = 0; i < list.getSize(); i++) {
//			Object data = list.get(i);
//			
//			// 저장 데이터 타입이 Object이므로 어떤 타입의 데이터라도 저장할 수 있지만
//			// 데이터를 사용할 때는 타입 변환을 위한 검사를 해야 하는 번거로움이 있다.
//			if (data instanceof Integer) {
//				System.out.println("정수 : " + (int)(data));
//			}
//			else if (data instanceof Double) {
//				System.out.println("실수 : " + (double)data);
//			}
//			else if (data instanceof String) {
//				System.out.println("문자열 : " + (String)data);
//			}
//		}
		
		// 제네릭 데이터 합 구한 후 출력
		int sum = 0;
		
		for (int i = 0; i < list.getSize(); i++) {
			sum += list.get(i);
		}
		
		System.out.println(sum);
		
		// 실수 타입 객체를 만들고 데이터 3개를 넣은 후 출력하기
		
		DataList<Double> list2 = new DataList<>();
		list2.add(3.5);
		list2.add(4.3);
		list2.add(3.9);
		
	
		for (int i = 0; i < list2.getSize(); i++) {
			System.out.println(list2.get(i));
		}
		


	}
}
