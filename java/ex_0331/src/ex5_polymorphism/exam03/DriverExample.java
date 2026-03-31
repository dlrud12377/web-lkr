package ex5_polymorphism.exam03;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Vehicle()); // 차량이 달립니다.
		driver.drive(new Bus()); // 버스가 달립니다.
		driver.drive(new Taxi()); // 택시가 달립니다.
	}
}
