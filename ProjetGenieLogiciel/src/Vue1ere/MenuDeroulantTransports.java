package Vue1ere;

import Ressources.Transport;
import Ressources.bdd;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class MenuDeroulantTransports extends Parent {
	
	public MenuDeroulantTransports(){
		Text choisissezLeTransport = new Text("Sélectionnez le mode de transport souhaité:");
		choisissezLeTransport.setFont(new Font(20));
		this.getChildren().add(choisissezLeTransport);
		
		int compteur = 0;
		for(Transport transport : bdd.transportsDispo) {
			if(transport.transportPossible()) {
				
				Rectangle fondTransport = new Rectangle(800,20,Color.MEDIUMPURPLE);
				fondTransport.setTranslateY(+21 * compteur);
				this.getChildren().add(fondTransport);
				
				Text typeTransport = new Text(transport.getNomTransport());
				typeTransport.setTranslateY(15 + 21 * compteur);
				this.getChildren().add(typeTransport);
				compteur ++;
			}
		}
	}

}
