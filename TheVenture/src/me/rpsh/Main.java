package me.rpsh;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	static MainController controller;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("GUIMain.fxml"));
			FXMLLoader loader = new FXMLLoader(getClass().getResource("GUIMain.fxml"));
			controller = (MainController)loader.getController();
			Scene scene = new Scene(root,883,666);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.resizableProperty().setValue(Boolean.FALSE);
			primaryStage.setScene(scene);
			primaryStage.setTitle("The Venture");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
