package FxBtnWithImg;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FxBtnWithImg extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("A button with an image");
		stage.setWidth(200);
		stage.setHeight(200);
		BorderPane root = new BorderPane();
		Label lbl = new Label("Ready!");
		Image img = new Image(getClass().getResourceAsStream("ok.png")); 
		Button btn = new Button("", new ImageView(img));
		btn.setOnMouseEntered((MouseEvent e) -> {
			lbl.setText("Mouse enter!");
			lbl.setFont(Font.font(12));
		});
		btn.setOnMouseExited((MouseEvent e) -> {
			lbl.setText("Mouse exit!");
			lbl.setFont(Font.font(12));
		});
		btn.setOnAction((ActionEvent e) -> {
			lbl.setText("Mouse Clicked!"); 
			lbl.setFont(Font.font(14));
		});
		root.setCenter(btn);
		root.setBottom(lbl);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show(); 
	}

}
