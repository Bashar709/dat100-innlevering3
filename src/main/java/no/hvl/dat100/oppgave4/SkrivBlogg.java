package no.hvl.dat100.oppgave4;

import java.io.File;
import no.hvl.dat100.oppgave3.Blogg;


public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		try {
			File myfile = new File("Skrive blogg.txt");

			if (myfile.createNewFile()) {
				System.out.println("filen er oppretta " + myfile.getName());

			} else {
				System.out.println("filen ekistetere allerede");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return true;
		

	}

}