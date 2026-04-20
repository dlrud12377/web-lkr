package playable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IronCled implements Character {
	
	int maxHp = 80;
	List<String> cardDeck = new ArrayList<>(Arrays.asList("타격", "타격", "타격", "타격", "타격", "수비", "수비", "수비", "수비", "수비", "강타"));
	// 필요한 요소 필드로 만들기
	
	@Override
	public void attack(NonPlayable monster, int damage) {
		monster.setHp(monster.getHp() - 6);
	}
	
	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}@Override
	public void discard(int card) {
		// TODO Auto-generated method stub
		
	}@Override
	public void draw(int card) {
		// TODO Auto-generated method stub
		
	}@Override
	public void exclude() {
		// TODO Auto-generated method stub
		
	}@Override
	public void strength(int strength) {
		// TODO Auto-generated method stub
		
	}@Override
	public void vulnerable(int vulnerable) {
		// TODO Auto-generated method stub
		
	}@Override
	public void weekness(int weekness) {
		// TODO Auto-generated method stub
		
	}public IronCled() {
		
	}
}
