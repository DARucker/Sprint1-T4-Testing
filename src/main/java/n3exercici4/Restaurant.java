package n3exercici4;

public class Restaurant {

	private String name;
	private String adress;
	private int ranking;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public Restaurant(String name, String adress, int ranking) {
		super();
		this.name = name;
		this.adress = adress;
		this.ranking = ranking;
	}
}
