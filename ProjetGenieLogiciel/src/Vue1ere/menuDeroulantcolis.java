package Vue1ere;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Ressources.Article;
import Ressources.BddManager;
import Ressources.Colis;
import Ressources.Controlleur;
import Ressources.bdd;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class menuDeroulantcolis extends Parent {

	public menuDeroulantcolis() {
		
		Text choisissezLesColis = new Text("Sélectionnez les colis à emporter");
		choisissezLesColis.setFont(new Font(20));
		this.getChildren().add(choisissezLesColis);

		bdd.getInstance();

		int compteur = 0;
		for (Colis colis : BddManager.getInstance().getAllColis()) {
			compteur++;

			Button bAfficherContenu = new Button("Afficher contenu");
			Button bSelectionner = new Button("Selectionner");
			Rectangle fondColis = new Rectangle(800, 20, Color.LIGHTBLUE);
			Text texteIcone = new Text(colis.getDesignation());
			Text textArticlesManquants = new Text("Article(s) Manquant(s) pour ce colis");
			
			textArticlesManquants.setFont(new Font(20));
			textArticlesManquants.setFill(Color.RED);
			textArticlesManquants.setTranslateX(320);
			this.getChildren().add(textArticlesManquants);
			textArticlesManquants.setVisible(false);

			fondColis.setTranslateY(+21 * compteur);
			this.getChildren().add(fondColis);

			texteIcone.setTranslateY(15 + 21 * compteur);
			texteIcone.setTranslateX(20);
			this.getChildren().add(texteIcone);

			bAfficherContenu.setTranslateX(300);
			bAfficherContenu.setTranslateY(+21 * compteur);
			this.getChildren().add(bAfficherContenu);

			bSelectionner.setTranslateX(450);
			bSelectionner.setTranslateY(+21 * compteur);
			this.getChildren().add(bSelectionner);
			
			Rectangle fondContenu = new Rectangle(500, 21 * colis.getArticles().size(),Color.LIGHTGREEN); 
			fondContenu.setTranslateX(800); 
			fondContenu.setTranslateY(21); 
			fondContenu.setVisible(false);
			this.getChildren().add(fondContenu);
			
			List<Text> listeTextContenuColis = new ArrayList<>();
			
			
			Set<Map.Entry<Article, Integer>> articlesContenus = colis.getArticles().entrySet();
			  Iterator<Map.Entry<Article, Integer>> it = articlesContenus.iterator(); 
			  int compteurInterne = 0; 
			  while (it.hasNext()) { 
				  Map.Entry<Article, Integer> a = it.next();
				  compteurInterne++; 
				  Text textContenuColis = new Text( "Article: " + a.getKey().getNomArticle() + "     Quantité: " + a.getValue());
				  textContenuColis.setTranslateY(21 + 18 * compteurInterne);
				  textContenuColis.setTranslateX(850);
				  textContenuColis.setVisible(false);
				  listeTextContenuColis.add(textContenuColis);
			  }
			  
			  for(Text t : listeTextContenuColis) {
				  this.getChildren().add(t);
			  }
			   
			
			
			
			
			bAfficherContenu.setOnMouseEntered(new EventHandler<MouseEvent>() {
				public void handle(MouseEvent ke) {
					fondContenu.setVisible(true);
					for(Text t : listeTextContenuColis) {
						t.setVisible(true);
					}
				}
			});
			
			bAfficherContenu.setOnMouseExited(new EventHandler<MouseEvent>() {
				public void handle(MouseEvent ke) {
					fondContenu.setVisible(false);
					for(Text t : listeTextContenuColis) {
						t.setVisible(false);
					}
				}
			});
			bSelectionner.setOnMouseClicked(new EventHandler<MouseEvent>() {
				public void handle(MouseEvent ke) {
					if(!(colis.colisFaisable())) {
						textArticlesManquants.setVisible(true);
					}
					else{
					textArticlesManquants.setVisible(false);
					Controlleur.choisirColis(colis);
					}
				}});
			
			
	}}

	/*
	 * public void afficherContenuIcone(iconeColis ic, int positionY) {
	 * 
	 * 
	 * if (coco.getmArticles() == null) { this.getChildren().add(new
	 * Text("Informations non disponibles"));
	 * 
	 * } else { Rectangle fond = new Rectangle(500, 21 * coco.getmArticles().size(),
	 * Color.LIGHTGREEN); fond.setTranslateX(800); this.getChildren().add(fond);
	 * Set<Map.Entry<Article, Integer>> colisDispo = coco.getmArticles().entrySet();
	 * Iterator<Map.Entry<Article, Integer>> it = colisDispo.iterator(); int
	 * compteur = 0; while (it.hasNext()) { compteur++; Map.Entry<Article, Integer>
	 * a = it.next(); Text textContenuColis = new Text( "Article: " +
	 * a.getKey().getmNomArticle() + "     Quantité: " + a.getValue());
	 * textContenuColis.setTranslateY(18 * compteur);
	 * textContenuColis.setTranslateX(850);
	 * 
	 * this.getChildren().add(textContenuColis);
	 * 
	 * }
	 * 
	 * 
	 * }
	 */
}
