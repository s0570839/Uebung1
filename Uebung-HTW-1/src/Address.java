
public class Address {
	
	private String straﬂenName;
	private String ort;
	private String hausNummer;
	private String plz;
	
	public Address(String straﬂenName, String hausNummer, String ort, String plz) {
		
		this.straﬂenName = straﬂenName;
		this.hausNummer = hausNummer;
		this.ort = ort;
		this.plz = plz;
		
	}
	
	public void setStraﬂenName(String straﬂenName) {
		this.straﬂenName = straﬂenName;
	}

	public String getStraﬂenName() {
		return straﬂenName;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public String getOrt() {
		return ort;
	}

	public void setHausNummer(String hausNummer) {
		this.hausNummer = hausNummer;
	}
	
	public String getHausNummer() {
		return hausNummer;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}
	
	public String getPlz() {
		return plz;
	}
	

}
