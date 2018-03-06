package me.rpsh;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Items {

	private ObservableList<String> itemList;
	
	public Items() {
		this.itemList = FXCollections.observableArrayList();
		itemList.add("Basic Sword");
		itemList.add("Basic Shield");
	}
	
	public String getItem(int index) {
		return itemList.get(index);
	}
	
	public ObservableList<String> getAllItems(){
		return itemList;
	}
	
	public void addItem(String item) {
		itemList.add(item);
	}
	
	public void removeItem(String item) {
		itemList.remove(item);
	}
}
