package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	
	public Innlegg() {
		likes = 7;
		
	}
	
	public Innlegg(int id, String bruker, String dato) {
		this.id = id;
		this.bruker = bruker; 
		this.dato = dato;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this(id,bruker,dato);
		this.likes = likes;
	}
	
	public String getBruker() {
		return bruker;
	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;
	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		int antall = 1;
		if(this.getLikes() < antall) {
			likes++;
		}
	}
	
	public boolean erLik(Innlegg innlegg) {
		return this.getId() == innlegg.getId();
	}
	
	public String toString() {
		return this.getId() + "\n" + this.getBruker() +  "\n" + this.getDato() + "\n" + this.getLikes() + "\n";
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
