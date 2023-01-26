package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	
	public String getName() {
		return name;
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


	public int getArmor() {
		return armor;
	}


	public void takeDamage (Champion other) {
		if(other.getAttack() <= getArmor()) {
			this.setLife(getLife() - 1);
		} else {
			setLife(getLife() - (other.getAttack() - getArmor()));
		}
		
		if(this.getLife() < 0) {
			this.setLife(0);
		}
	}
	
	public String status() {
		String died = "";
		if (getLife() == 0) {
			died = "(morreu)";
		}
		return name
				+ ": "
				+ getLife()
				+ " de vida "
				+ died;
		
		
	}
	
	
	
}
