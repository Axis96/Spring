package model;

public class Product {
	
	private long id;
	private String title;
	private int PEGI;
	private int price;
	private String category;
	
	
	
	
	public Product() {
		super();
	}

	public Product(long id, String title, int pEGI, int price, String category) {
		super();
		this.id = id;
		this.title = title;
		PEGI = pEGI;
		this.price = price;
		this.category = category;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPEGI() {
		return PEGI;
	}
	public void setPEGI(int pEGI) {
		PEGI = pEGI;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
