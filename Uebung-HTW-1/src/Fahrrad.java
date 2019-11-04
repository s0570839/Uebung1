
public class Fahrrad implements IBookable {

	private String bycicleName;
	private String bycicleCode;
	private String bycicleColor;

	public Fahrrad(String bycicleName, String bycicleCode, String bycicleColor) {

		this.bycicleName = bycicleName;
		this.bycicleCode = bycicleCode;
		this.bycicleColor = bycicleColor;

	}

	@Override
	public boolean book(int day) {

		return false;
	}

}
