
public class Trippelzimmer extends Zimmer implements IBookable {

	private boolean bookings[] = new boolean[365];

	public Trippelzimmer(String nummer, double price, int capacity) {
		super(nummer, price, capacity);
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

}
