package it.dstech.gestione;

import it.dstech.modelli.Risultato;

public class Service {

	
	public Risultato conteggio(String testo) {
		int numeroVocali=0;
		int numeroConsonanti=0;
		String[] caratteri = testo.split("");
		
		for (int i = 0; i < caratteri.length; i++) {
			if(caratteri[i].equalsIgnoreCase("a") || caratteri[i].equalsIgnoreCase("e") || caratteri[i].equalsIgnoreCase("i") || caratteri[i].equalsIgnoreCase("o") || caratteri[i].equalsIgnoreCase("u")) {
				numeroVocali++;
			} else if (caratteri[i].equals(" ") || caratteri[i].equals(".") || caratteri[i].equals(",") || caratteri[i].equals(";") || caratteri[i].equals(":")){
				
			} else { numeroConsonanti++;}
		}
	
		Risultato risultato = new Risultato(numeroVocali, numeroConsonanti, contaParole(testo));
		return risultato;
	}
	
	
	public int contaParole(String testo) {
	    String temp = testo.trim();
	    int nc = temp.length();
	    int indice = 0, numeroParole = 0;
	    	while (indice < nc) {
	    		while ((indice < nc) && (temp.charAt(indice) == ' ')) {
	    			indice++;
	    		}
	    		while ((indice < nc) && (temp.charAt(indice) != ' ')) {
	    			indice++;
	    		}
	    		numeroParole++;
	    	}
	    return numeroParole;
	  }
		
}
