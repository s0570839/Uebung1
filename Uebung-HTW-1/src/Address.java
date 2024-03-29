
public class Address {
	
	private String straßenName;
	private String ort;
	private String hausNummer;
	private String plz;
	
	public Address(String straßenName, String hausNummer, String ort, String plz) {
		
		this.straßenName = straßenName;
		this.hausNummer = hausNummer;
		this.ort = ort;
		this.plz = plz;
		
	}
	
	public void setStraßenName(String straßenName) {
		this.straßenName = straßenName;
	}

	public String getStraßenName() {
		return straßenName;
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
