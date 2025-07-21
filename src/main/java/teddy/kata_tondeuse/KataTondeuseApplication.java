package teddy.kata_tondeuse;


public class KataTondeuseApplication {

	public static void main(String[] args) {

		String filePath = "src/main/input.txt";
		MowItNow manager = new MowItNow();
		manager.manageMowers(filePath);
	}

}
