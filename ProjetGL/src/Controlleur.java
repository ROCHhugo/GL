import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Controlleur {
	public List<Colis> mColisChoisis = null;

	@SuppressWarnings("null")
	public void choisirColis(List<Colis> listeColis) {
		List<Colis> colisChoisis = null;

		Scanner input = new Scanner(System.in);

		int number = input.nextInt();
		colisChoisis.add(bdd.colisPossibles.get(number));

		number = input.nextInt();
		colisChoisis.add(bdd.colisPossibles.get(number));

		mColisChoisis = colisChoisis;

	}

	public Map<Article, Integer> afficherContenuColis(Colis colis) {
		return colis.getmArticles();
	}

	public Transport choisirTransport() {
		Double volumeTotal = 0.0;
		Double poidsTotal = 0.0;
		for (Colis colis : mColisChoisis) {
			volumeTotal += colis.getmVolume();
			poidsTotal += colis.getmPoids();
		}

		Scanner input = new Scanner(System.in);

		int number = input.nextInt();

		return bdd.transportsDispo.get(number);

	}

}