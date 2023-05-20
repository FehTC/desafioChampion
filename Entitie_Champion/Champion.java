package Entitie_Champion;

public class Champion {
	
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion() {
	
	}
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public void takeDamage(Champion other) {
		this.life = life + armor  - other.attack ;
		int lifeB = other.life;
		other.life = other.life + other.armor - attack;
		
		if (other.armor>attack) {
			
			lifeB = other.life-lifeB;
			other.life = (other.life-lifeB)-1;
		}
		
	}
	
	public String status() {
		if (life <=0) {
			return name + ": 0 de vida (morreu)";
		}
		else {
			return name + ": " + life + " de vida";
		}		
	}
	

}
