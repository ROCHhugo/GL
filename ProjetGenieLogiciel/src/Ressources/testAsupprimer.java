package Ressources;

import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class testAsupprimer extends Parent{ //On fait h�riter la classe de Parent car il s'agit d'un noeud graphique
	
	public testAsupprimer(){
		
		TextField affichage = new TextField("hello world"); //On cr�e une zone d'affichage et on lui demande d'afficher la valeur du r�sultat en cours de l'accumulateur

		affichage.setFont(new Font(30)); //On d�finit la taille de cette zone d'affichage
		affichage.setTranslateX(65.0); //On la positionne suivant l'axe X
		affichage.setTranslateY(110.0); //On la positionne suivant l'axe Y
		
		 //On lie la propri�t� resultatEnCours � affichage gr�ce � un bind pour un affichage dynamique
		
		this.getChildren().add(affichage); //On ajoute la zone de texte au noeud graphique Ecran	
	}
}