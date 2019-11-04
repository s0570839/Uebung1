
public class Einzelzimmer extends Zimmer {

	public Einzelzimmer(String nummer, double price, int capacity) {
		super(nummer, price, capacity);
		super.setDescription("Einzelzimmer");
	}

	@Override
	public void searchRoom() {

	}

	@Override
	public void bookRoom() {

	}
	
	public String tostring() {
		return "Einzelzimmer " + super.toString();
	}

}
