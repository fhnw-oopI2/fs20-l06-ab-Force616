package ch.fhnw.module06.ab2;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ApplicationUI extends StackPane{
	
	private Button button;
	private TextField textField1;
	private TextField textField2;

	
	public ApplicationUI() {
		initalizeControls();
		layoutControls();
	}
	
	private void initalizeControls() {
		button = new Button();
		textField1 = new TextField("Title");
		textField2 = new TextField("Description");

		
	}
	
	private void layoutControls() {
		VBox rootPane = new VBox();
		rootPane.setPadding(new Insets(10,10,10,10));
		rootPane.getChildren().add(textField1);
		rootPane.getChildren().add(textField2);
		rootPane.getChildren().add(button);
	}
	
}
