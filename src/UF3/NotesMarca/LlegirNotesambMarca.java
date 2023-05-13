package UF3.NotesMarca;
import java.io.File;
import java.util.Scanner;

public class LlegirNotesambMarca {
	//la paraula fi serveix com a marca de final de fitxer
	public static final String MARCA_FI = "fi";
	public static void main (String[] args) {
		LlegirNotesambMarca programa = new LlegirNotesambMarca();
		programa.inici();
	}
	public void inici() {
		try {
			File f = new File("D:\\Packages\\src\\UF3\\NotesMarca\\NotesMarca.txt");
			Scanner lector = new Scanner(f);
			boolean llegir = true;
			while (llegir) {
				String nom = lector.next();
				if (MARCA_FI.equals(nom)) {
					llegir = false;
				}
				else {
					String cognom = lector.next();
					System.out.print("Estudiant: " + nom + " " + cognom);
					//Noteu com un scanner es pot passar com paràmetre
					double mitjana = llegirNotes(lector);
					System.out.println("− Mitjana: " + mitjana);
				}
			}
			//Cal tancar el fitxer
			lector.close();
		}
		catch(Exception e) {
			//Excepció!
			System.out.println("Error llegint estudiants: " + e);
		}
	}

	/** Donat un Scanner en un fitxer quan l’apuntador es troba sobre l’inici
	 * de les notes, s’extreuen i es calcula la mitjana.
	 *
	 * @param lector Scanner a processar
	 * @return Mitjana de notes
	 */
	public double llegirNotes(Scanner lector) {
		double res = 0;
		try {
			double leer = lector.nextDouble();
			int NomNotes = 0;
			while(leer !=-1) {
				NomNotes++;
				res = res + leer;
				leer = lector.nextDouble();
			}

			res = res / NomNotes;
		}
		catch (Exception e) {
			//Excepció!
			System.out.println("Error llegint notes: " + e);
		}
		return res;
	}
}