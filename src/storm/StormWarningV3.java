package storm;

public class StormWarningV3 {
	//instance variables
	private StormInterface theStorm;

	//constructor
	public StormWarningV3(StormInterface storm) {
		theStorm = storm;

	}

	//other methods
	public double predictDamageLevel() {
			return theStorm.predictDamageInDollars();
	}

	//toString
	public String toString() {
		return "The " + theStorm + " may have damages of " + predictDamageLevel();
	}





}
