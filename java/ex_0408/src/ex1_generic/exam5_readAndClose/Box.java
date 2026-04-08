package ex1_generic.exam5_readAndClose;

import java.util.ArrayList;
import java.util.List;

// 해당 Interface들을 동시에 구현한 클래스만 제네릭 타입의 대상이 된다.
public class Box<T extends Readable & Closeable> {
	// 데이터를 담을 수 있는 자료구조
	List<T> list = new ArrayList<>();
	
	public void add(T item) {
		list.add(item);
	}
	
}
