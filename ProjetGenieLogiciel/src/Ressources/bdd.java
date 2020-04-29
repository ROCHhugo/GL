package Ressources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class bdd {
	private static bdd instance = null;

protected static List<Colis> colisPossibles = new ArrayList<Colis>();
	public static List<Transport> transportsDispo = new ArrayList<Transport>();
	public static Map<Article, Integer> articlesDispo = null;
	public static List<Colis> mColisChoisis = new ArrayList<Colis>();
	
	public static bdd getInstance() {

		if (instance == null) {
			instance = new bdd();
		}
		return instance;
	}

	public static List<Colis> getColisPossibles() {
		return colisPossibles;
	}

	public static void setColisPossibles(List<Colis> colisPossibles) {
		bdd.colisPossibles = colisPossibles;
	}

	public static List<Transport> getTransportsDispo() {
		return transportsDispo;
	}

	public static void setTransportsDispo(List<Transport> transportsDispo) {
		bdd.transportsDispo = transportsDispo;
	}

	public static Map<Article, Integer> getArticlesDispo() {
		return articlesDispo;
	}

	public static void setArticlesDispo(Map<Article, Integer> articlesDispo) {
		bdd.articlesDispo = articlesDispo;
	}

	public bdd() {
		Colis ouii = new Colis();
		ouii.setDesignation("michel");
		colisPossibles.add(ouii);
		ouii = new Colis();
		ouii.setDesignation("louef");
		colisPossibles.add(ouii);
		ouii = new Colis();
		ouii.setDesignation("lou-ève");
		colisPossibles.add(ouii);ouii = new Colis();
		ouii.setDesignation("louef");
		colisPossibles.add(ouii);
		ouii = new Colis();
		ouii.setDesignation("lou-ève");
		colisPossibles.add(ouii);ouii = new Colis();
		ouii.setDesignation("louef");
		colisPossibles.add(ouii);
		ouii = new Colis();
		ouii.setDesignation("lou-ève");
		colisPossibles.add(ouii);ouii = new Colis();
		ouii.setDesignation("louef");
		colisPossibles.add(ouii);
		ouii = new Colis();
		ouii.setDesignation("lou-ève");
		colisPossibles.add(ouii);ouii = new Colis();
		ouii.setDesignation("louef");
		colisPossibles.add(ouii);
		ouii = new Colis();
		ouii.setDesignation("lou-ève");
		colisPossibles.add(ouii);ouii = new Colis();
		ouii.setDesignation("louef");
		colisPossibles.add(ouii);
		ouii = new Colis();
		ouii.setDesignation("lou-ève");
		colisPossibles.add(ouii);ouii = new Colis();
		ouii.setDesignation("louef");
		colisPossibles.add(ouii);
		ouii = new Colis();
		ouii.setDesignation("lou-ève");
		colisPossibles.add(ouii);ouii = new Colis();
		ouii.setDesignation("louef");
		colisPossibles.add(ouii);
		ouii = new Colis();
		ouii.setDesignation("lou-ève");
		colisPossibles.add(ouii);ouii = new Colis();
		ouii.setDesignation("louef");
		colisPossibles.add(ouii);
		ouii = new Colis();
		ouii.setDesignation("lou-ève");
		colisPossibles.add(ouii);ouii = new Colis();
		ouii.setDesignation("louef");
		colisPossibles.add(ouii);
		ouii = new Colis();
		ouii.setDesignation("lou-ève");
		colisPossibles.add(ouii);
		ouii = new Colis();
		ouii.setDesignation("louef");
		colisPossibles.add(ouii);
		ouii = new Colis();
		ouii.setDesignation("lou-ève");
		colisPossibles.add(ouii);ouii = new Colis();
		ouii.setDesignation("louef");
		colisPossibles.add(ouii);
		ouii = new Colis();
		ouii.setDesignation("lou-ève");
		colisPossibles.add(ouii);ouii = new Colis();
		ouii.setDesignation("louef");
		colisPossibles.add(ouii);
		ouii = new Colis();
		ouii.setDesignation("lou-ève");
		colisPossibles.add(ouii);

	}
}
