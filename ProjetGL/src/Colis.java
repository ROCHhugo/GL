import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colis {
	public enum natureColis {
		BAC, Fag, Mal, Pal
	}

	public enum module {
		Ebase, CompE2
	}

	public enum optionPaysFroidChaud {
		Optionnel, Pfroids, Pchauds
	}

	public enum affectaire {
		DAC, DAMHO
	}

	public enum secteur {
		A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q
	}

	private natureColis mNatureDuColis;
	private int mNumeroColis;
	private double mVolume;
	private String mDesignation;

	public boolean colisFaisable() {
		Set<Map.Entry<Article, Integer>> colisDispo = bdd.articlesDispo.entrySet();
		Iterator<Map.Entry<Article, Integer>> it = colisDispo.iterator();
		while (it.hasNext()) {
			if (it.next().getValue() <= 0) {
				return false;
			}

		}
		return true;
	}

	public natureColis getmNatureDuColis() {
		return mNatureDuColis;
	}

	public void setmNatureDuColis(natureColis mNatureDuColis) {
		this.mNatureDuColis = mNatureDuColis;
	}

	public int getmNumeroColis() {
		return mNumeroColis;
	}

	public void setmNumeroColis(int mNumeroColis) {
		this.mNumeroColis = mNumeroColis;
	}

	public double getmVolume() {
		return mVolume;
	}

	public void setmVolume(double mVolume) {
		this.mVolume = mVolume;
	}

	public String getmDesignation() {
		return mDesignation;
	}

	public void setmDesignation(String mDesignation) {
		this.mDesignation = mDesignation;
	}

	public String getmPrecisions() {
		return mPrecisions;
	}

	public void setmPrecisions(String mPrecisions) {
		this.mPrecisions = mPrecisions;
	}

	public double getmValeurHT() {
		return mValeurHT;
	}

	public void setmValeurHT(double mValeurHT) {
		this.mValeurHT = mValeurHT;
	}

	public module getmModule() {
		return mModule;
	}

	public void setmModule(module mModule) {
		this.mModule = mModule;
	}

	public optionPaysFroidChaud getmOptionPaysFroidChaud() {
		return mOptionPaysFroidChaud;
	}

	public void setmOptionPaysFroidChaud(optionPaysFroidChaud mOptionPaysFroidChaud) {
		this.mOptionPaysFroidChaud = mOptionPaysFroidChaud;
	}

	public String getmLieuAffectation() {
		return mLieuAffectation;
	}

	public void setmLieuAffectation(String mLieuAffectation) {
		this.mLieuAffectation = mLieuAffectation;
	}

	public affectaire getmAffectaire() {
		return mAffectaire;
	}

	public void setmAffectaire(affectaire mAffectaire) {
		this.mAffectaire = mAffectaire;
	}

	public secteur getmSecteur() {
		return mSecteur;
	}

	public void setmSecteur(secteur mSecteur) {
		this.mSecteur = mSecteur;
	}

	public double getmPoids() {
		return mPoids;
	}

	public void setmPoids(double mPoids) {
		this.mPoids = mPoids;
	}

	public Map<Article, Integer> getmArticles() {
		return mArticles;
	}

	public void setmArticles(Map<Article, Integer> mArticles) {
		this.mArticles = mArticles;
	}

	private String mPrecisions;
	private double mValeurHT;
	private module mModule;
	private optionPaysFroidChaud mOptionPaysFroidChaud;
	private String mLieuAffectation;
	private affectaire mAffectaire;
	private secteur mSecteur;
	private double mPoids;
	private Map<Article, Integer> mArticles;

}
