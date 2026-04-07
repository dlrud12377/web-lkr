package ex1_reflection;

public class GetClassExample {
	public static void main(String[] args) throws ClassNotFoundException { // main에 예외 throw
		
		// Class클래스
		// 클래스의 정보 자체를 담고 있는 클래스. 메타데이터형 객체에 해당함
		
		// 1~3 중 하나만 선택해서 활성화
		
		// 1. 직접 얻어오기
		// 클래스명.class : 클래스의 정보 가져오기
		//Class clazz = Car.class;
		
		// 2. forName() 활용
		// 경로를 찾아갔는데 클래스가 없을수도 있기 때문에
		// ClassNotFoundException 예외가 발생할 수 있는 코드가 된다. 따라서 try문에 넣어야 함
		// 또는 throw 활용
//		try {
//			Class clazz = Class.forName("ex1_reflection.Car");
//		}
//		catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
//		// main에 던지기
//		Class clazz = Class.forName("ex1_reflection.Car");
		
		// 3. getClass() 메서드 활용
		// 객체를 만들고 해당 메서드로 정보를 얻어옴
		Car car = new Car();
		Class clazz = car.getClass();
		
		
		
		// getPackage() : 패키지 정보 읽기
		System.out.println("패키지 : " + clazz.getPackage().getName());
		// getSimpleName() : 패키지를 제외한 클래스 이름
		System.out.println("클래스 간단 이름 : " + clazz.getSimpleName()); 
		// getName() : 패키지를 포함한 전체 클래스명(패키지명.클래스명)
		System.out.println("클래스 간단 이름 : " + clazz.getName());
	}
}
