package Ressources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class BddManager {
	
	private  static BddManager instance = null;
	private  Connection connection = null;
	
	private BddManager() {
		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/Jules/eclipse-workspace/ProjetGenieLogiciel/ESCRIM.db");
		}
		catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		//createDatabase();
	}
	
	public static BddManager getInstance() {
		if (instance == null) {
			instance = new BddManager();
		}
		return instance;
	}
	
	/*private void createDatabase() {
		try {
			Statement stmt = connection.createStatement();
			String sql = "create table if not exists TODO ( ID INTEGER PRIMARY KEY AUTOINCREMENT, TEXTE TEXT NOT NULL, ACTIF BOOLEAN NOT NULL)";
			stmt.executeUpdate(sql);
			stmt.close();
		}
		catch (Exception e) {
			log.severe(e.getClass().getName() + ": " + e.getMessage());
		}
	}*/
	
	public List<Colis> getAllColis() {
		List<Colis> listColis = new ArrayList<Colis>();
		try {
			Statement statement = connection.createStatement();
			if (statement.execute("select NUM_COLIS, AFFECTATAIRE, MODULE, OPTION, SECTEUR, NATURE, DESIGNATION_GENERIQUE, LONGUEUR, LARGEUR, HAUTEUR, VOLUME, POIDS, OBSERVATIONS from COLIS")){
				ResultSet resultSet1 = statement.getResultSet();
				while (resultSet1.next()) {
					Colis colis = new Colis();
					colis.setNumeroColis(resultSet1.getInt("NUM_COLIS"));
					colis.setAffectaire(resultSet1.getString("AFFECTATAIRE"));
					colis.setModule(resultSet1.getString("MODULE"));
					colis.setOption(resultSet1.getString("OPTION"));
					colis.setSecteur(resultSet1.getString("SECTEUR"));
					colis.setNatureColis(resultSet1.getString("NATURE"));
					colis.setDesignation(resultSet1.getString("DESIGNATION_GENERIQUE"));
					colis.setVolume(resultSet1.getInt("VOLUME"));
					colis.setPoids(resultSet1.getInt("POIDS"));
					colis.setObservations(resultSet1.getString("OBSERVATIONS"));
					PreparedStatement preparedStatement = connection.prepareStatement("select distinct ID, NOM, DOSAGE, QUANTITE from COMPOSITION_COLIS where NUM_COLIS = ?");
					preparedStatement.setInt(1, colis.getNumeroColis());
					if (preparedStatement.execute()){
						ResultSet resultSet2 = preparedStatement.getResultSet();
						Map<Article, Integer> articles = new HashMap<Article, Integer>();
						while (resultSet2.next()) {
							Article art = new Article();
							art.setNomArticle(resultSet2.getString("NOM"));
							Integer quantite = resultSet2.getInt("QUANTITE");
							articles.put(art, quantite);
						}
						colis.setArticles(articles);
					}
					listColis.add(colis);
				}
			}
			statement.close();
	    }
		catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
	    }
	    return listColis;
	}
	
	public List<Transport> getAllTransport() {
		List<Transport> listTransport = new ArrayList<Transport>();
		try {
			Statement statement = connection.createStatement();
			if (statement.execute("select NOM, POIDS_CHARGEMENT_MAX, VOLUME_MAX from AVION")){
				ResultSet resultSet = statement.getResultSet();
				while (resultSet.next()) {
					Transport transport = new Transport();
					transport.setNomTransport(resultSet.getString("NOM"));
					transport.setVolumeCapacite(resultSet.getDouble("VOLUME_MAX"));
					transport.setPoidsCapacite(resultSet.getDouble("POIDS_CHARGEMENT_MAX"));
					transport.setDisponibilite(true);
					listTransport.add(transport);
				}
			}
			statement.close();
	    }
		catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
	    }
	    return listTransport;
	}
	
	public Map<Article, Integer> getAllInventaire() {
		Map<Article, Integer> Inventaire = new HashMap<Article, Integer>();
		try {
			Statement statement = connection.createStatement();
			if (statement.execute("select NOM, DLU, QUANTITE from INVENTAIRE")){
				ResultSet resultSet = statement.getResultSet();
				while (resultSet.next()) {
					Article art = new Article();
					art.setNomArticle(resultSet.getString("NOM"));
					Integer quantite = resultSet.getInt("QUANTITE");
					if (resultSet.getString("DLU") == "") {
						art.setPerissable(false);
					}
					else {
						art.setPerissable(true);
					}
					Inventaire.put(art, quantite);
				}
			}
			statement.close();
	    }
		catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
	    }
	    return Inventaire;
	}
	
	

}
