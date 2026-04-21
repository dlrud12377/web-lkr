package playable;

import nonplayable.Monster;

public interface Character {
	
	static final int NORMAL_ATTACK_DAMAGE = 6;
	static final int NORMAL_DEFENSE_SHIELD = 6;
	
	void attack(Monster monster, int damage);
	
	void defense();
	
	void vulnerable(int vulnerable);
	
	void weakness(int weakness);
	
	void strength(int strength);
	
	void draw(int card);
	
	void discard(int card);

	void exclude();
	
	void delete();
}
