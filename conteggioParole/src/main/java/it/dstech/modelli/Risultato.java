package it.dstech.modelli;

public class Risultato {

	private int numeroVocali;
	private int numeroConsonanti;
	private int numeroParole;
	
	
	
	
	public Risultato(int numeroVocali, int numeroConsonanti, int numeroParole) {
		super();
		this.numeroVocali = numeroVocali;
		this.numeroConsonanti = numeroConsonanti;
		this.numeroParole = numeroParole;
	}
	
	public int getNumeroVocali() {
		return numeroVocali;
	}
	public void setNumeroVocali(int numeroVocali) {
		this.numeroVocali = numeroVocali;
	}
	public int getNumeroConsonanti() {
		return numeroConsonanti;
	}
	public void setNumeroConsonanti(int numeroConsonanti) {
		this.numeroConsonanti = numeroConsonanti;
	}
	public int getNumeroParole() {
		return numeroParole;
	}
	public void setNumeroParole(int numeroParole) {
		this.numeroParole = numeroParole;
	}
	
	
}
