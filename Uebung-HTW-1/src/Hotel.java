import java.util.Arrays;

public class Hotel {

	private String hotelName;
	private int hotelSterne;
	private Address adress;
	private Guest guests[];
	private Zimmer zimmerList[];
	private Suite suiteList[];
	private int capacity;

	public Hotel(String hotelName, int hotelSterne) {
		this.hotelName = hotelName;
		this.hotelSterne = hotelSterne;
		this.guests = new Guest[this.capacity];
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getHotelSterne() {
		return hotelSterne;
	}

	public void setHotelSterne(int hotelSterne) {
		this.hotelSterne = hotelSterne;
	}

	public boolean addGuest(Guest guest) {
		for (int i = 0; i < this.guests.length; i++) {
			if (this.guests[i] == null) {
				this.guests[i] = guest;
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", hotelSterne=" + hotelSterne + ", adress=" + adress + ", guests="
				+ Arrays.toString(guests) + ", capacity=" + capacity + "]";
	}

}
