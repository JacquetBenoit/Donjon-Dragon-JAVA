package characters;

public class Weapon extends Weapons {
	
	// Constructeurs
	public Weapon(String spellName, int spellAttack) {
		super(spellName, spellAttack);
	}
	

	// M�thodes
	public String toString() {
		return "Arme : " + super.toString();
	}
	
}

