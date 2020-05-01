package Ressources;

import java.util.Map;
import java.util.Scanner;

import javafx.scene.Node;

public class Controlleur {

	@SuppressWarnings("null")
	public static void choisirColis(Colis colisSelectionne) {

		BddManager.getInstance().ajouterColis(colisSelectionne);
		

	}

	public Map<Article, Integer> afficherContenuColis(Colis colis) {
		return colis.getArticles();
	}

	public static void finChoix(String nomTransportChoisi) {
		// TODO Auto-generated method stub
		
	}
	
	

	

}