package ex1_generic.exam5_readAndClose;

public class BoxMain {
	public static void main(String[] args) {
		
		// Readable과 Closeable을 동시 구현하는 클래스만 타입 할당 가능
		Box<BoxType> box = new Box<>();
		
//		Box<Object> box2 = new Box<>();
		// Bound mismatch: The type Object is not a valid substitute for the bounded parameter 
		// <T extends Readable & Closeable> of the type Box<T>
	}
}
