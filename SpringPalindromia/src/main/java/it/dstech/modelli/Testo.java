package it.dstech.modelli;

import java.util.ArrayList;
import java.util.List;

public class Testo {

	private int numeroParole ;
	private int numeroParolePalindrome;
	List<String> parolePalindrome = new ArrayList<String>();
	
	
	
	public Testo(int numeroParole, int numeroParolePalindrome, List<String> parolePalindrome) {
		super();
		this.numeroParole = numeroParole;
		this.numeroParolePalindrome = numeroParolePalindrome;
		this.parolePalindrome = parolePalindrome;
	}
	
	
	public int getNumeroParole() {
		return numeroParole;
	}
	public void setNumeroParole(int numeroParole) {
		this.numeroParole = numeroParole;
	}
	public int getNumeroParolePalindrome() {
		return numeroParolePalindrome;
	}
	public void setNumeroParolePalindrome(int numeroParolePalindrome) {
		this.numeroParolePalindrome = numeroParolePalindrome;
	}
	public List<String> getParolePalindrome() {
		return parolePalindrome;
	}
	public void setParolePalindrome(List<String> parolePalindrome) {
		this.parolePalindrome = parolePalindrome;
	}


	@Override
	public String toString() {
		return "Il numero di parole è: "+numeroParole +"\n Il numero di parole palindrome è:  "+ numeroParolePalindrome+
				"\n Le parole palindrome sono:" + parolePalindrome;
	}
	
	
	
}
