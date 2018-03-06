package me.rpsh;

public class Health{
	
	private int health = 0;
	
	public Health(int health) {
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void addHealth(int health) {
		this.health += health;
	}
	
	public void removeHealth(int health) {
		this.health -= health;
	}
	
}
