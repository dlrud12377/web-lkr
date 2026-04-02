package ex1_abstract.Example3;

public class DeliveryMain {
	public static void main(String[] args) {
		
		
		Delivery[] delivery = {new RocketDelivery(), new StorePickup()};
		
		for (Delivery d : delivery) { 
			d.printInVoice();
			d.ship();
			d.complete();
			System.out.println("--------------");
		}
		
		
	}
	
}
