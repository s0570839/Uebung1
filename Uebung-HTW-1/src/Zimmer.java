
public abstract class Zimmer {

	private String nummer;
	private double price;
	private int capacity;

	public Zimmer() {

	}

	public Zimmer(String nummer, double price, int capacity) {

		this.nummer = nummer;
		this.price = price;
		this.capacity = capacity;

	}

	public String getNummer() {
		return nummer;
	}

	public void setNummer(String nummer) {
		this.nummer = nummer;
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

	public abstract void searchRoom();

	public abstract void bookRoom();

	@Override
	public String toString() {
		return "Zimmer [nummer=" + nummer + ", price=" + price + ", capacity=" + capacity + "]";
	}

}
