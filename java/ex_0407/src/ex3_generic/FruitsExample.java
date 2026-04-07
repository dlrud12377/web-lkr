package ex3_generic;

class Fruit{
	
}

class Apple extends Fruit{
	
}

class Banana extends Fruit{
	
}

class FruitBox<T> {
	private T [] fruits;
	private int size;
	
	@SuppressWarnings("unchecked")
	public FruitBox() {
		// 제네릭 타입은 런타임시 사라지기 때문에, 직접 배열을 만들 수 없다.
		fruits = (T[])new Object[10]; // 그래서 가장 포괄적인 Object로 만들고, 강제 TypeCasting 진행
	}
	
	public void add(T fruit) {
		fruits[size++] = fruit;
	}
	
	public T get(int index) {
		try {
			return fruits[index];
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int size() {
		return size;
	}
	
	
}

public class FruitsExample {
	public static void main(String[] args) {
		FruitBox<Fruit> box = new FruitBox<>();
		
		// 제네릭 + 다형성 - 상속받은 자식 타입 객체도 추가 가능
		box.add(new Fruit());
		box.add(new Apple());
		box.add(new Banana());
	}
}
