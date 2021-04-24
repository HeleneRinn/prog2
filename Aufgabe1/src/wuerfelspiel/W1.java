package wuerfelspiel;
import java.util.Random; 
import javax.swing.*;

public class W1 {
	Spieler [] spieler;
	boolean abbruch = false;
	
	public W1(int anzahlSpieler)
	{
		this.spieler = new Spieler [anzahlSpieler];
		for (int i=0; i< anzahlSpieler; i++)
		{
			String spielerName = JOptionPane.showInputDialog(null, "Geben Sie einen Namen der Spieler:in ein");
			this.spieler[i] = new Spieler(spielerName);
		}
		for (int i=0; i<this.spieler.length; i++)
		{
			System.out.println(spieler[i].name);
		}
	}
	
	public void spiel()
	{
		while (abbruch == false)
		{
			for (int i= 0; i< spieler.length ; i++)
			{
				wuerfeln(this.spieler[i]);
			}
		}
		
	}
	
	public void wuerfeln(Spieler spieler)
	{
		Random wuerfel = new Random();
		int wurf = wuerfel.nextInt(6)+1;
		int aktuellerpunktestand = 0;
		int yesno = 0;
		
		while (yesno == 0)
		{
			if (wurf == 6) break;
			aktuellerpunktestand = aktuellerpunktestand + wurf;
			if (aktuellerpunktestand > 19)
			{
				JOptionPane.showConfirmDialog
					(null,
					"Herzlichen Glueckwunsch " + spieler.name+ ", du hast gewonnen, dein Punktestand betraegt: "+ spieler.punktestand,
					"Juhu",
					JOptionPane.OK_OPTION);
				
				abbruch = true;
				return;
			}
			yesno = JOptionPane.showConfirmDialog
					(null,
					spieler.name+ ", du hast eine " + wurf + " gewuerfelt, dein aktueller Rundenpunktestand betraegt: "+ aktuellerpunktestand+ ", dein Gesamtpunktestand betraegt: " + spieler.punktestand + aktuellerpunktestand + " . Moechtest du noch einmal Wuerfeln?", 
					"Wurf", 
					JOptionPane.YES_NO_OPTION );
			if (yesno == 1)
			{
				break;
			}
			wurf = wuerfel.nextInt(6)+1;
		}
		if (wurf == 6)
		{
			JOptionPane.showConfirmDialog
			(null,
			spieler.name+ ", du hast eine 6 gewürfelt, deine Runde in beendet, dein Punktestand betraegt: "+ spieler.punktestand, 
			"Oh no",
			JOptionPane.OK_OPTION);
		}
		else
		{
			spieler.punktestand = spieler.punktestand + aktuellerpunktestand;
			JOptionPane.showConfirmDialog
			(null,
			"Dein Gesamtpunktestand betraegt: "+ spieler.punktestand, 
			"Gutes Spiel!",
			JOptionPane.OK_OPTION);
		}
		
	}
}
