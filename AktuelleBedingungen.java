import java.util.Observable;
import java.util.Observer;

public class AktuelleBedingungen implements Observer{

	public void update(Observable o, Object arg) {
		MessDaten daten = (MessDaten) arg;
		// TODO Auto-generated method stub
		System.out.println("\naktuell: " 
				+ daten.getTemperatur() + " C " 
				+ daten.getFeuchtigkeit() + "% "
				+ daten.getDruck() + " hPa ");
		
	}
}
