package ex1_generic.exam3;

public class Main {
	public static void main(String[] args) {
		DeviceManager<TV> tvManager = new DeviceManager<TV>(new TV());
		DeviceManager<Audio> audioManager = new DeviceManager<Audio>(new Audio());
		
		tvManager.powerOn();
		audioManager.powerOn();
	
	}
}
