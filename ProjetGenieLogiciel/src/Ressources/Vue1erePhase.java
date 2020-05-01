package Ressources;

import java.util.List;

import Vue1ere.MenuDeroulantTransports;
import Vue1ere.menuDeroulantcolis;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Vue1erePhase extends Application {
	Button bValiderChoix = new Button("Valider choix");
	static StackPane root = new StackPane();
	static Scene scene = new Scene(root, 500, 500, Color.RED);
	menuDeroulantcolis menuColis = new menuDeroulantcolis();
	static MenuDeroulantTransports menuTransports = new MenuDeroulantTransports();
	static ScrollPane scroll = new ScrollPane();

	@SuppressWarnings("static-access")
	public void start(Stage stage) {
		bValiderChoix.setTranslateX(100);
		bValiderChoix.setTranslateY(0);
		
		bValiderChoix.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent ke) {
					scroll.setContent(menuTransports);
			}});
		root.setAlignment(Pos.TOP_CENTER);

		scroll.setContent(menuColis);
		root.getChildren().add(scroll);
		this.root.getChildren().add(bValiderChoix);


		stage.setScene(scene);
		stage.show();
	}
	
	

}
