
public class Einzelzimmer extends Zimmer implements IBookable {

	private boolean bookings[] = new boolean[365];

	public Einzelzimmer(String nummer, double price, int capacity) {
		super(nummer, price, capacity);
		super.setDescription("Einzelzimmer");
	}

	@Override
	public boolean book(int day) {

		if (bookings[day] == true) {
			return false;
		} else {
			bookings[day] = true;
			return true;
		}
	}

	public String tostring() {
		return "Einzelzimmer " + super.toString();
	}

}
