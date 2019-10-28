
public class Hotel {
	
	private String hotelName;
	private int hotelSterne;
	private Address adress;
	private Guest guests[];
	private Zimmer zimmerList[];
	private Suite suiteList[];
	
	
	public Hotel(String hotelName, int hotelSterne) {
		this.hotelName = hotelName;
		this.hotelSterne = hotelSterne;
		this.guests = guests;
		this.zimmerList = zimmerList;
		this.suiteList = suiteList;
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

	
	
//	public Address getAdress() {
//		return adress;
//	}
//
//	public void setAdress(Address adress) {
//		this.adress = adress;
//	}
	
	
	
	
	
	
	

}
