package Ressources;

import java.util.List;

public class Transport {

	private String nomTransport;
	private double volumeCapacite;
	private double poidsCapacite;
	private boolean disponibilite;
	private List<Integer> numerosColis;
	
	public boolean transportPossible() {
		Double volumeTotal = 0.0;
		Double poidsTotal = 0.0;
		for (Colis colis : bdd.mColisChoisis) {
			volumeTotal += colis.getVolume();
			poidsTotal += colis.getPoids();
		}
		if(this.getPoidsCapacite()>=poidsTotal && 
		   this.getVolumeCapacite()>=volumeTotal) {
			return true;
		}
		return false;

	}
	
	public String getNomTransport() {
		return nomTransport;
	}
	public void setNomTransport(String nomTransport) {
		this.nomTransport = nomTransport;
	}
	public double getVolumeCapacite() {
		return volumeCapacite;
	}
	public void setVolumeCapacite(double volumeCapacite) {
		this.volumeCapacite = volumeCapacite;
	}
	public double getPoidsCapacite() {
		return poidsCapacite;
	}
	public void setPoidsCapacite(double poidsCapacite) {
		this.poidsCapacite = poidsCapacite;
	}
	public boolean isDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}
	public List<Integer> getNumerosColis() {
		return numerosColis;
	}
	public void setNumerosColis(List<Integer> numerosColis) {
		this.numerosColis = numerosColis;
	}

	}
	
