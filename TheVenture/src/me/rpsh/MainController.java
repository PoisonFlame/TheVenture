package me.rpsh;

import java.util.List;


import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class MainController {

	@FXML
	private Label lblMap;

	@FXML
	private Label lblPlayerInfo;

	@FXML
	private ImageView imgMap;

	@FXML
	private Label lblHealthLabel;

	@FXML
	private Label lblMoneyLabel;

	@FXML
	private Label lblMoney;

	@FXML
	private Label lblHealth;

	@FXML
	private Label lblNameLabel;

	@FXML
	private Label lblName;

	@FXML
	private Label lblPlayerInventory;

	@FXML
	private ListView<String> lstInventory;

	@FXML
	private TextArea txtConsole;

	@FXML
	private TextField txtInput;

	@FXML
	private Label lblAttackDmgLabel;

	@FXML
	private Label lblAttackDmg;

	@FXML
	private Label lblDefense;

	@FXML
	private Label lblDefenseLabel;

	// Globals
	boolean gameState = false;
	String inputType;
	String name;
	Player player;
	String separator = "========================================================================\n";

	@FXML
	private void initialize() {
		lblHealth.setText("-");
		lblName.setText("-");
		lblAttackDmg.setText("-");
		lblDefense.setText("-");
		lblMoney.setText("0");
		List<String> introArray = StaticMethods.introduction();

		for (int i = 0; i < introArray.size(); i++) {
			txtConsole.appendText(introArray.get(i));
		}

		
		
		
	}
	

	
	
	@FXML
	public void onInputEnter(ActionEvent ae) {

		if (gameState == false) {
			if (txtInput.getText().equals("begin")) {
				txtConsole.appendText("You: begin\n");
				txtInput.setText("");
				txtConsole.appendText(separator);
				txtConsole.appendText("You have made a good decision adventurer! \n");
				txtConsole.appendText("Hey hood, my name is James. I am the big shot around here. I see value in you. Join me I'll show you the way!\n");
				txtConsole.appendText("You agree to join James, he asks for your name. Please type your name.\n");
				inputType="insertName";
				txtInput.setPromptText("Enter your name here");
				gameState = true;
				return;
			} else {
				txtConsole.appendText("Game will exit in 2 seconds\n");
				System.exit(0);
			}
		}
		
		if(inputType.equals("insertName")) {
			txtConsole.appendText("You: " + txtInput.getText() + "\n" + separator);
			txtConsole.appendText("James: Your name is " + txtInput.getText() + " huh?\nType yes or no to continue.\n");
			name=txtInput.getText();
			txtInput.setPromptText("Type yes or no to continue");
			txtInput.setText("");
			inputType="confirmName";
			return;
		}
		
		if(inputType.equals("confirmName")) {
			txtConsole.appendText("You: " + txtInput.getText() + "\n" + separator);
			if(txtInput.getText().equals("yes")) {
				lblName.setText(name);
				txtInput.setText("");
				txtConsole.appendText(name + "! What a fiesty name. Come join me " + name + ". Time to meet your new friends.\n");
				player = new Player(name.toString());
				lblHealth.setText(player.health.getHealth() + "");
				lblMoney.setText(player.money.getMoney() + "");
				lstInventory.setItems((ObservableList<String>) player.items.getAllItemNames());
				//ADD CRAP HERE TO MOVE TO NEXT ACTIVITYs
				//DEAL WITH TrYING TO GET PLAYER.JAVA TO OUTPUT TO THE LABELS AFTER PLAYER CONSTRUCTOR.
				return;
			}else {
				txtConsole.appendText("James: What is your name then hood? Enter your name below.\n");
				txtInput.setPromptText("Enter your name here");
				inputType="insertName";
			}
		}
		
		txtInput.setText("");
	}

	public Label getLblMap() {
		return lblMap;
	}

	public Label getLblPlayerInfo() {
		return lblPlayerInfo;
	}

	public ImageView getImgMap() {
		return imgMap;
	}

	public Label getLblHealthLabel() {
		return lblHealthLabel;
	}

	public Label getLblMoneyLabel() {
		return lblMoneyLabel;
	}

	public Label getLblMoney() {
		return lblMoney;
	}

	public Label getLblHealth() {
		return lblHealth;
	}

	public Label getLblNameLabel() {
		return lblNameLabel;
	}

	public Label getLblName() {
		return lblName;
	}

	public Label getLblPlayerInventory() {
		return lblPlayerInventory;
	}

	public ListView<String> getLstInventory() {
		return lstInventory;
	}

	public TextArea getTxtConsole() {
		return txtConsole;
	}

	public TextField getTxtInput() {
		return txtInput;
	}

	public Label getLblAttackDmgLabel() {
		return lblAttackDmgLabel;
	}

	public Label getLblAttackDmg() {
		return lblAttackDmg;
	}

	public Label getLblDefense() {
		return lblDefense;
	}

	public Label getLblDefenseLabel() {
		return lblDefenseLabel;
	}

}
