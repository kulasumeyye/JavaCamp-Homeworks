package Entities;

public class Game implements Entity {

	private int gameId;
	private int categoryId;
	private String gameName;
	private String description;
	private double price;
	
	public Game() {
		super();
	}
	public Game(int gameId, int categoryId, String gameName, String description, double price) {
		super();
		this.gameId = gameId;
		this.categoryId = categoryId;
		this.gameName = gameName;
		this.description = description;
		this.price = price;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
