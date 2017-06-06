import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.Timer;


public class Wetterstation extends Observable {
	MessDaten daten = new MessDaten();

	
	
	// wird aufgerufen, wenn neue Messwerte da sind
	public void messwerteGeaendert(){
		setChanged();
		notifyObservers(daten);
	}
	
	// Simulation der Wetterdaten ...
	public void messungSimulieren(){
		Thread thread = new Thread(new Runnable(){
			public void run(){
				while (true){
					daten.messen();
					messwerteGeaendert();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		thread.start();
	}

	public Wetterstation(){
		addObserver(new Tendenz());
		addObserver(new AktuelleBedingungen());
		messungSimulieren();
	}

	public static void main(String [] arg){
		new Wetterstation();
	}
}
