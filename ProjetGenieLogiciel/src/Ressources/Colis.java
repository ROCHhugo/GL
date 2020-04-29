package Ressources;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Colis{
private int numeroColis;
private String affectaire;
private String module;
private String option;
private String secteur;
private String natureColis;
private String designation;
private double volume;
private double poids;
private String observations;
private Map<Article, Integer> articles;



public boolean colisFaisable() {
	Set<Map.Entry<Article, Integer>> articles = this.articles.entrySet();
	Iterator<Map.Entry<Article, Integer>> it = articles.iterator();
	while (it.hasNext()) {
		Map.Entry<Article, Integer> c = it.next();
		
		
		if (c.getValue() <= bdd.articlesDispo.get(c.getKey())) {
			
			return true;
		}

	}
	return false;
}

public int getNumeroColis() {
	return numeroColis;
}

public void setNumeroColis(int numeroColis) {
	this.numeroColis = numeroColis;
}

public String getAffectaire() {
	return affectaire;
}

public void setAffectaire(String affectaire) {
	this.affectaire = affectaire;
}

public String getModule() {
	return module;
}

public void setModule(String module) {
	this.module = module;
}

public String getOption() {
	return option;
}

public void setOption(String option) {
	this.option = option;
}

public String getSecteur() {
	return secteur;
}

public void setSecteur(String secteur) {
	this.secteur = secteur;
}

public String getNatureColis() {
	return natureColis;
}

public void setNatureColis(String natureColis) {
	this.natureColis = natureColis;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public double getVolume() {
	return volume;
}

public void setVolume(double volume) {
	this.volume = volume;
}

public double getPoids() {
	return poids;
}

public void setPoids(double poids) {
	this.poids = poids;
}

public String getObservations() {
	return observations;
}

public void setObservations(String observations) {
	this.observations = observations;
}

public Map<Article, Integer> getArticles() {
	return articles;
}

public void setArticles(Map<Article, Integer> articles) {
	this.articles = articles;
}


}

