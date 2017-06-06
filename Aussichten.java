import java.util.Observable;
import java.util.Observer;
import java.util.Random;


public class Aussichten implements Observer{
	private String vorhersage;
	
	private String[] texte = {
			"regnerisch", "tr�b", "neblig", "st�rmisch", "wechselhaft bew�lkt",
			"sonnig", "heiter", "frostig" 
	};
	
	
	private void berechneVorhersage(MessDaten daten){
		Random random = new Random();
		int index1 = random.nextInt(texte.length);
		int index2 = random.nextInt(texte.length);
		while(index2 == index1){
			 index2 = random.nextInt(texte.length);
		}
		vorhersage = texte[index1] + " und " + texte[index2];
	}
	
	public void update(Observable o, Object daten) {
		berechneVorhersage((MessDaten) daten);
		System.out.println("Die weiteren Aussichten: " + vorhersage);
		
	}
	
}
