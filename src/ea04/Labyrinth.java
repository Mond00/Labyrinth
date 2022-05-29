package ea04;

import java.io.IOException;

/**
 * Klasse zum Entwerfen 10 * 10 Testlabyrinthe auf der Basis eines rekursiven Algorithmus 
 * 
 * @author Mohanad Alzeyadi 
 */
public class Labyrinth {
	
	public char[][] lab =
		      {{'X', 'X', ' ', 'X', 'X', 'X', ' ', 'X', ' ', 'X'},
			   {'X', ' ', ' ', ' ', 'X', 'X', ' ', 'X', ' ', 'X'},
			   {'X', 'X', ' ', ' ', 'X', ' ', 'X', ' ', ' ', 'X'},
		       {'X', ' ', 'X', ' ', 'X', 'X', 'X', ' ', 'X', 'X'},
			   {'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', 'X'},
			   {'X', 'X', 'X', 'X', ' ', ' ', 'X', 'X', ' ', 'X'},
			   {'X', ' ', ' ', ' ', ' ', 'X', 'X', 'X', 'X', ' '},
			   {'X', ' ', 'X', 'X', ' ', ' ', 'X', ' ', 'X', 'X'},
			   {'X', 'X', 'X', ' ', ' ', ' ', 'X', ' ', ' ', 'X'},
			   {'X', ' ', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X'},};
	
	

	
/**
 * Die Ausgangsposition des Bewegen (x,y) in dem Labyrinth
 * 
 * @param x
 * @param y
 */
	
	public void start(int x, int y) {
		if (findeWeg(x,y)) {
			lab[x][y] = 'S';
		}
	}
	
/**
 * Prüefen den Weg, das Bewegen ist nur waagerecht oder senkrecht zu benachbarten Positionen möglich.
 * 
 * @param x
 * @param y
 */
	
	public boolean findeWeg (int x, int y) {
		
		//Aussteig gefunden
		if (lab[x][y] == 'z') {
			return true;
		}
		
		//wenn es sich um eine Wand oder einen Weg handelt 
		if (lab[x][y] == 'X' || lab[x][y] == '*') {
			return false;
		}
		
		//Der Weg aus dem Labyrinth wird mit dem Symbol * gekennzeichnet 
		lab[x][y] = '*';
		boolean result;	
		
		// Versuche nach rechts zu gehen
		result = findeWeg(x, y+1);
		if (result) { return true;}
		
		// Versuche nach oben zu gehe
		result = findeWeg(x-1, y);
		if (result) { return true;}
		
		// Versuche nach links zu gehen
		result = findeWeg(x, y-1);
		if (result) { return true;}		
		
		// Versuche nach unten zu gehen
		result = findeWeg(x+1, y);
		if (result) { return true;}		
		
		lab[x][y] = ' ';
		return false;
	}
	
	public String toString() {
		String output = "";
		for (int x=0; x<10; x++) {
			for (int y=0; y<10; y++) {
				output += lab[x][y] + " ";
			}
			output += "\n";
		}
		return output;
	}

}
