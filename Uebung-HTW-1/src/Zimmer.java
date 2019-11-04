
public abstract class Zimmer {

	private String nummer;
	private double price;
	private int capacity;
	private String description;

	public Zimmer(String nummer, double price, int capacity) {
		super();
		this.nummer = nummer;
		this.price = price;
		this.capacity = capacity;

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		return "Zimmer [nummer=" + nummer + ", price=" + price + ", capacity=" + capacity + ", description="
				+ description + "]";
	}

}
