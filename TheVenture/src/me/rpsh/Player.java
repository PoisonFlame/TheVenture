package me.rpsh;


public class Player {
	
	private String name;
	private int healthValue;
	private int moneyValue;
	public Health health;
	public Money money;
	public Items items;
	//private MainController controller;
	
	public Player(String name) {
		this.name = name;
		//controller = Main.controller;
		//controller.getLblName().setText(name);
		System.out.println(name);
		this.healthValue = 100;
		//.getLblHealth().setText(String.valueOf(healthValue));
		this.moneyValue = 500;
		//controller.getLblMoney().setText(String.valueOf(moneyValue));
		health = new Health(healthValue);
		money = new Money(moneyValue);
		items = new Items();
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
