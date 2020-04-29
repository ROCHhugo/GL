import java.util.List;
import java.util.Map;

public class bdd {
public static List<Colis> colisPossibles = null;
public static List<Transport> transportsDispo = null;
public static Map<Article,Integer> articlesDispo = null;



public bdd() {
	Colis oui = new Colis();
	oui.setmDesignation("michel");
	colisPossibles.add(oui);
	
	oui = new Colis();
	oui.setmDesignation("louef");
	colisPossibles.add(oui);

	oui = new Colis();
	oui.setmDesignation("lou-ève");
	colisPossibles.add(oui);

	
	
}
}
