import java.util.Observable;
import java.util.Observer;

public class Tendenz implements Observer{
	int lastTemp;
	int lastFeucht;
	int lastDruck;
	

	public void update(Observable o, Object arg) {
		MessDaten daten = (MessDaten) arg;
		// TODO Auto-generated method stub
		int temp = daten.getTemperatur();
		int feucht = daten.getFeuchtigkeit();
		int druck = daten.getDruck();
		
		System.out.print("Tendenz: ");
		
		if (temp >= lastTemp){
			System.out.print("Temp + ");
		}
		else {
			System.out.print("Temp - ");
		}
		
		if (feucht >= lastFeucht){
			System.out.print("Feucht + ");
		}
		else {
			System.out.print("Feucht - ");
		}
		
		if (druck >= lastDruck){
			System.out.println("Druck + ");
		}
		else {
			System.out.println("Druck - ");
		}
		
		lastTemp = temp;
		lastFeucht = feucht;
		lastDruck = druck;
		
	}
}
