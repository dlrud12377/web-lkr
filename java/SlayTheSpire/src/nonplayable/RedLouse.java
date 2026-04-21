package nonplayable;

public class RedLouse extends Monster {
	
	private String name = "RedLouse";
	private int damage;
	
	
	public RedLouse() {
		
	}
	
	public void attack() {
		damage = (int)(Math.random()*3) + 5;
		System.out.println("적색 공벌레가 " + damage + "의 데미지로 공격해옵니다.");
		// 플레이어의 hp를 sethp를 이용해 조정하기
	}
	
	public void gainStrength() {
		
	}
}
