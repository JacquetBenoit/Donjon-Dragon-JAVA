package characters;

public class Spell extends Weapons {
	
	// Constructeurs
	public Spell(String spellName, int spellAttack) {
		super(spellName, spellAttack);
	}
	

	// M�thodes
	public String toString() {
		return "Sort : " + super.toString();
	}
		
}

