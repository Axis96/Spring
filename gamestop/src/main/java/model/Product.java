package model;

public class Product {
	
	private String titolo;
	private String classificazione;
	private int PEGI;
	private int prezzo;
	private String categoria;
	
	
	
	
	
	public Product() {
		super();
	}


	public Product(String titolo, String classificazione, int pEGI, int prezzo, String categoria) {
		super();
		this.titolo = titolo;
		this.classificazione = classificazione;
		PEGI = pEGI;
		this.prezzo = prezzo;
		this.categoria = categoria;
	}
	
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getClassificazione() {
		return classificazione;
	}
	
	public void setClassificazione(String classificazione) {
		this.classificazione = classificazione;
	}
	
	public int getPEGI() {
		return PEGI;
	}
	
	public void setPEGI(int pEGI) {
		PEGI = pEGI;
	}
	
	public int getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
