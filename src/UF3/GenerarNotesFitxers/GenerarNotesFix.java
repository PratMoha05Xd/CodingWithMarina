package UF3.GenerarNotesFitxers;

import java.io.File;
import java.util.Scanner;
import java.io.PrintStream;

public class GenerarNotesFix {
	//la paraula fi serveix com a marca de final de fitxer
	public static final String MARCA_FI = "fi";
	public static void main (String[] args) {
		GenerarNotesFix programa = new GenerarNotesFix();
		programa.inici();
	}
	public void inici() {
		try {
			File f = new File("D:\\Packages\\src\\UF3\\GenerarNotesFitxers\\NotesMarca.txt");
			Scanner lector = new Scanner(f);
			boolean llegir = true;
			//add new file in the same path
			PrintStream fileStream = new PrintStream("D:\\Packages\\src\\UF3\\GenerarNotesFitxers\\GenerarNotesFitxers.txt");
			while (llegir) {
				String nom = lector.next();
				if (MARCA_FI.equals(nom)) {
					llegir = false;
				}
				else {
					String cognom = lector.next();
					//print the result inside the file
					fileStream.print("Estudiant: " + nom + " " + cognom);
					//Noteu com un scanner es pot passar com paràmetre
					double mitjana = llegirNotes(lector);
					//print the result inside the file
					fileStream.println("− Mitjana: " + mitjana);
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