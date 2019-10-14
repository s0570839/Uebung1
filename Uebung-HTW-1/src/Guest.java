
public class Guest {
	
	private String gastVorname;
	private String gastNachname;
	private String anreiseDatum;
	private String abreiseDatum;
	private Reservation reservation;
	private Address privateAddress;
	private Address businessAddress;
	
	
	public Guest(String gastVorname, String gastNachname, String anreiseDatum, String abreiseDatum, Address privateAddress) {
		
		this.gastVorname = gastVorname;
		this.gastNachname = gastNachname;
		this.anreiseDatum = anreiseDatum;
		this.abreiseDatum = abreiseDatum;
		this.privateAddress = privateAddress;
		
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Address getPrivateAddress() {
		return privateAddress;
	}

	public void setPrivateAddress(Address privateAddress) {
		this.privateAddress = privateAddress;
	}

	public Address getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(Address businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getGastVorname() {
		return gastVorname;
	}

	public void setGastVorname(String gastVorname) {
		this.gastVorname = gastVorname;
	}

	public String getGastNachname() {
		return gastNachname;
	}

	public void setGastNachname(String gastNachname) {
		this.gastNachname = gastNachname;
	}

	public String getAnreiseDatum() {
		return anreiseDatum;
	}

	public void setAnreiseDatum(String anreiseDatum) {
		this.anreiseDatum = anreiseDatum;
	}

	public String getAbreiseDatum() {
		return abreiseDatum;
	}

	public void setAbreiseDatum(String abreiseDatum) {
		this.abreiseDatum = abreiseDatum;
	}
	
	
	
	

}
