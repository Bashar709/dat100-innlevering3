package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
	private Innlegg[] tabell;
	private int nesteLedige;

	public Blogg() {
		tabell = new Innlegg[20];
		nesteLedige = 0;
	}

	public Blogg(int lengde) {
		tabell = new Innlegg[lengde];
		nesteLedige = 0;
	}

	public int getAntall() {
		return nesteLedige;
	}

	public Innlegg[] getSamling() {
		return tabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		for(int i =0; i < getAntall(); i++) {
			if(getSamling()[i].erLik(innlegg)) {
				return i;	
			}
		}
		return -1;
	}
	public boolean finnes(Innlegg innlegg) {
		for(int i =0; i < getAntall(); i++) {
		if(getSamling()[i].erLik(innlegg)) {
			return true;
		}
		
		}
		return false;

	}

	public boolean ledigPlass() {
		if(nesteLedige < tabell.length) {
			return true;
		}
		return false;
	}

	public boolean leggTil(Innlegg innlegg) {

		if(nesteLedige < tabell.length) {
			tabell[nesteLedige]=innlegg;
			nesteLedige++;
			return true;
		}
		return false;
	}

	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}