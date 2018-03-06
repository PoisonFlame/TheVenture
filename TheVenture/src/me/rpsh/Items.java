package me.rpsh;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Items {

	private ObservableList<Item> itemList;
	private ObservableList<String> nameList;
	
	public Items() {
		this.itemList = FXCollections.observableArrayList();
		this.nameList = FXCollections.observableArrayList();
		itemList.add(new Item("Basic Sword",0,5,0));
		nameList.add("Basic Sword");
		itemList.add(new Item("Basic Shield",0,0,5));
		nameList.add("Basic Shield");
	}
	
	public Item getItem(int index) {
		return itemList.get(index);
	}
	
	public ObservableList<Item> getAllItems(){
		return itemList;
	}
	
	public void addItem(Item item) {
		itemList.add(item);
		nameList.add(item.getItemName());
	}
	
	public ObservableList<String> getAllItemNames(){
		return nameList;
	}
	
	public void removeItem(int id) {
		for(Item i : itemList) {
			if(i.getItemID() == id) {
			itemList.remove(i);
			nameList.remove(i.getItemName());
			}
		}
	}
}
