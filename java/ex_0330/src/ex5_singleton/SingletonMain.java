package ex5_singleton;

public class SingletonMain {
	public static void main(String[] args) {
		// 생성자가 private로 정의되어 있기 때문에
		// 다른 클래스에서 호출하는 게 불가능하다.
		// Singleton obj = new Singleton(); X
		
		Singleton obj1 = Singleton.getInstance();
		
		Singleton obj2 = Singleton.getInstance();
		// 다른 객체 2개를 생성한 것으로 보이지만, 내부에서 생성한 동일한 singleton 객체를 두 번 불러온 것임
		
		// obj1과 obj2가 같은 객체인지 증명하기
		// 같은 객체면 "같은 객체입니다."
		// 아니면 "같은 객체가 아닙니다."
		
		boolean isSame = (obj1 == obj2);
		
		boolean isSame2 = obj1.equals(obj2);
		
		System.out.println(isSame + ", " + isSame2);
		
	}
}
