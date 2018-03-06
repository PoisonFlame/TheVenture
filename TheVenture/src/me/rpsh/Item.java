package me.rpsh;

<<<<<<< HEAD
public class Item {

	private String itemName;
	private static int sID;
	private int itemID;
	private int itemCost;
	private int itemDmg;
	private int itemDef;
	
	
	public Item(String itemName, int itemCost, int itemDmg, int itemDef) {
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.itemDmg  = itemDmg;
		this.itemDef  = itemDef;
		sID +=1;
		this.itemID = sID;
	}


	public int getItemID() {
		return itemID;
	}


//	public void setItemID(int itemID) {
//		this.itemID = itemID;
//	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public int getItemCost() {
		return itemCost;
	}


	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}


	public int getItemDmg() {
		return itemDmg;
	}


	public void setItemDmg(int itemDmg) {
		this.itemDmg = itemDmg;
	}


	public int getItemDef() {
		return itemDef;
	}


	public void setItemDef(int itemDef) {
		this.itemDef = itemDef;
	}
	
	
}
