package it.dstech.gestione;

public class Metodi {
	 
	
	public int contaPalindromia(String testo) {
		int numeroParolePalindrome=0;
		String[] array = testo.split(" ");
		
		for (int i = 0; i < array.length; i++) {
			if(palindromia(array[i])) {
				numeroParolePalindrome++;
			}
		}
		return numeroParolePalindrome;
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
	
	
	public boolean palindromia(String testo) {
			String[] array = testo.split("");
				for (int i = 0; i < array.length/2; i++) {
					int j= array.length-i-1;
					if (!array[i].equalsIgnoreCase(array[j]) ) {
						return false;
					}
				}
		return true;
	}
}
