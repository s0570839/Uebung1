
public class Suite {

	private int raumAnzahl;
	private double price;
	private int capacity;

	public Suite(int raumAnzahl, double price, int capacity) {

		this.raumAnzahl = raumAnzahl;
		this.price = price;
		this.capacity = capacity;

	}

	public int getRaumAnzahl() {
		return raumAnzahl;
	}

	public void setRaumAnzahl(int raumAnzahl) {
		this.raumAnzahl = raumAnzahl;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Suite [raumAnzahl=" + raumAnzahl + ", price=" + price + ", capacity=" + capacity + "]";
	}

}
