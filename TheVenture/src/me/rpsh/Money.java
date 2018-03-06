package me.rpsh;

public class Money{

	private int money;
	
	public Money(int money) {
		this.money = money;
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
	
	public void removeMoney(int money) {
		this.money -= money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}
