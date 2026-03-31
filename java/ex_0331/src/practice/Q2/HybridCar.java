package practice.Q2;

public class HybridCar extends Car {
	public int electricGauge;
	
	public HybridCar(int gasGauge, int electricGauge) {
		super(gasGauge);
		this.electricGauge = electricGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 전기량 : " + electricGauge);
	}
	
	
}
