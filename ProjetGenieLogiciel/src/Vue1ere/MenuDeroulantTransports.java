package Vue1ere;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Ressources.Article;
import Ressources.BddManager;
import Ressources.Controlleur;
import Ressources.Transport;
import Ressources.bdd;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class MenuDeroulantTransports extends Parent {

	public MenuDeroulantTransports() {
		Text choisissezLeTransport = new Text("Sélectionnez le mode de transport souhaité:");
		choisissezLeTransport.setFont(new Font(20));
		this.getChildren().add(choisissezLeTransport);

		int compteur = 0;
		for (Transport transport : BddManager.getInstance().getAllTransport()) {
			if (transport.transportPossible()) {

				compteur++;

				Button bAfficherCaractéristiques = new Button("Afficher caractéristiques");
				Button bSelectionner = new Button("Selectionner");
				Rectangle fondColis = new Rectangle(800, 20, Color.MEDIUMPURPLE);
				Text texteIcone = new Text(transport.getNomTransport());

				fondColis.setTranslateY(+21 * compteur);
				this.getChildren().add(fondColis);

				texteIcone.setTranslateY(15 + 21 * compteur);
				texteIcone.setTranslateX(20);
				this.getChildren().add(texteIcone);

				bAfficherCaractéristiques.setTranslateX(300);
				bAfficherCaractéristiques.setTranslateY(+21 * compteur);
				this.getChildren().add(bAfficherCaractéristiques);

				bSelectionner.setTranslateX(450);
				bSelectionner.setTranslateY(+21 * compteur);
				this.getChildren().add(bSelectionner);

				Rectangle fondCaracteristiques = new Rectangle(500, 21 * 2, Color.rgb(255,70,0));
				fondCaracteristiques.setTranslateX(800);
				fondCaracteristiques.setTranslateY(21);
				fondCaracteristiques.setVisible(false);
				this.getChildren().add(fondCaracteristiques);

				Text volumeTransportText = new Text("Volume max: " + String.valueOf(transport.volumeCapacite)+ " m^3");
				Text poidsTransportText = new Text("Poids max:" + String.valueOf(transport.poidsCapacite) + "Tonnes");
				volumeTransportText.setTranslateY(39);
				poidsTransportText.setTranslateY(57);
				volumeTransportText.setTranslateX(850);
				poidsTransportText.setTranslateX(850);
				volumeTransportText.setVisible(false);
				poidsTransportText.setVisible(false);
				this.getChildren().add(volumeTransportText);
				this.getChildren().add(poidsTransportText);

				bAfficherCaractéristiques.setOnMouseEntered(new EventHandler<MouseEvent>() {
					public void handle(MouseEvent ke) {
						fondCaracteristiques.setVisible(true);
						volumeTransportText.setVisible(true);
						poidsTransportText.setVisible(true);
						

					}
				});

				bAfficherCaractéristiques.setOnMouseExited(new EventHandler<MouseEvent>() {
					public void handle(MouseEvent ke) {
						fondCaracteristiques.setVisible(false);
						volumeTransportText.setVisible(false);
						poidsTransportText.setVisible(false);
					}
				});
				bSelectionner.setOnMouseClicked(new EventHandler<MouseEvent>() {
					public void handle(MouseEvent ke) {
						Controlleur.finChoix(transport.getNomTransport());
					}
				});

			}
		}
	}

}
