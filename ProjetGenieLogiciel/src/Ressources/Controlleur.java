package Ressources;

import java.util.Map;
import java.util.Scanner;

import javafx.scene.Node;

public class Controlleur {

	@SuppressWarnings("null")
	public static void choisirColis(Colis colisSelectionne) {


		bdd.mColisChoisis.add(colisSelectionne);
		for (Colis colis: bdd.mColisChoisis) {
			System.out.println(colis.getDesignation());
		}

	}

	public Map<Article, Integer> afficherContenuColis(Colis colis) {
		return colis.getArticles();
	}

	public static void finChoix(String nomTransportChoisi) {
		// TODO Auto-generated method stub
		
	}
	
	

	

}