package ea04;


/**
 * Klasse zum Testen das Labyrinth.
 *
 * @author Mohanad Alzeyadi
 */

public class Testklasse {
/**
* Main-Methode zum Starten und Testen der Klasse.
* @param args , Uebergabeparameter für das Programm.
* 
*/
	public static void main(String[] args) {
		Labyrinth m = new Labyrinth();
		m.lab[0][2] = 'z';
		
		m.start(9, 3);
		System.out.println(m);
		
		System.out.println("--------------------\n");
		
		Labyrinth n = new Labyrinth();
        n.lab[0][8] = 'z';
		
		n.start(5, 8);
		System.out.println(n);
		
		
		
	}

}
