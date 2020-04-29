package Ressources;

import java.util.List;

import Vue1ere.menuDeroulantcolis;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Vue1erePhase extends Application {
	static StackPane root = new StackPane();
	static Scene scene = new Scene(root, 500, 500, Color.RED);
	menuDeroulantcolis menu = new menuDeroulantcolis();
	ScrollPane scroll = new ScrollPane();

	public void start(Stage stage) {
		root.setAlignment(Pos.TOP_CENTER);

		scroll.setContent(menu);
		root.getChildren().add(scroll);

		stage.setScene(scene);
		stage.show();
	}
	
	public static void changerChild(Node e) {
		root.getChildren().remove(0);
		root.getChildren().add(e);
	}

}
