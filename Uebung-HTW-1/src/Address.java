
public class Address {
	
	private String stra�enName;
	private String ort;
	private String hausNummer;
	private String plz;
	
	public Address(String stra�enName, String hausNummer, String ort, String plz) {
		
		this.stra�enName = stra�enName;
		this.hausNummer = hausNummer;
		this.ort = ort;
		this.plz = plz;
		
	}
	
	public void setStra�enName(String stra�enName) {
		this.stra�enName = stra�enName;
	}

	public String getStra�enName() {
		return stra�enName;
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
