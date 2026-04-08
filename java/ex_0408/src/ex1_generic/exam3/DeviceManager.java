package ex1_generic.exam3;

// RemoteControl 인터페이스를 구현한 타입만 들어올 수 있다.
public class DeviceManager<T extends RemoteControl> { // Interface의 경우에도 extend 사용
	
	private T device;
	
	public DeviceManager(T device) {
		this.device = device;
	}
	
	public void powerOn() {
		device.turnOn();
	}
}
