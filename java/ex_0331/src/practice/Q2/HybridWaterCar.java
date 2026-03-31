package practice.Q2;

public class HybridWaterCar extends HybridCar {
	public int waterGauge;
	
	public HybridWaterCar(int gasGauge, int electricGauge, int waterGauge) {
		super(gasGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 물량 : " + waterGauge);
	}

}
