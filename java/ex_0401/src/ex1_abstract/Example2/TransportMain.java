package ex1_abstract.Example2;

public class TransportMain {
	public static void main(String[] args) {
		
		// 부모 배열에 2개의 객체 지정
		Transport[] tp = {new Bus("버스", 1200), new Taxi("택시", 3000, 10, 100)};
		
		// 향상된 for문 활용하여 출력
		for(Transport vehicle : tp) {
			vehicle.printFare();
		}
	}
}
