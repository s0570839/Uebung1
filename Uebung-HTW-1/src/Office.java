
public class Office extends Zimmer {

	private double betriebsKosten;

	public Office(String nummer, double price, int capacity) {
		super(nummer, price, capacity);
		this.setPrice(betriebsKosten);
	}

}
