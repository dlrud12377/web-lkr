package ex1_innerclass.practice;

public class RemoteControl {
	
	public String power = "Off";
	
		class Button {
			void press() {
				if (power == "Off") {
					System.out.println("전원을 켭니다");
					power = "On";
					System.out.println("power = " + power);
					
				}
				else if (power == "On") {
					System.out.println("전원을 끕니다");
					power = "Off";
					System.out.println("power = " + power);
				}
			}
		}

}
