
public class main {
	public static void main(String[] args) {

		Address privateAddress = new Address("Gartenfelder Straﬂe", "Berlin", "56", "13599");
//		Address businessAddress = new Address();
		Guest Matt = new Guest("Matt", "Damon", "03.10.2019", "10.10.2019", privateAddress);
		Hotel motelOne = new Hotel("Waldorf Astoria", 5);
		motelOne.addGuest(Matt);
		Zimmer einzel = new Einzelzimmer("00A2", 65, 1);
//		einzel.setDescription("EinzelSuperZimmer");
		System.out.println(einzel);
		System.out.println(motelOne);

	}

}
