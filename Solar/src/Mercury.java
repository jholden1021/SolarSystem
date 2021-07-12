
public class Mercury extends Planet<Terrestrial> {
	private static final Mercury SINGLE_INSTANCE = new Mercury();
	
	private Mercury() {
		diameter = 3031 ; 
		
		myTerrain = new Terrestrial(0);
		myTerrain.addAtmosphericComponent(AtmosphericComponents.O2);
		myTerrain.addAtmosphericComponent(AtmosphericComponents.Na);
		myTerrain.addAtmosphericComponent(AtmosphericComponents.H2);
		hasWater = true;
	}
	
	public static Mercury getInstance() {
		return SINGLE_INSTANCE;
	}
	
	/* Approximate position of orbit in degrees
	 * source http://www.stjarnhimlen.se/comp/ppcomp.html */
	@Override
	public double calculateMeanAnomaly(){
		double ma = 168.6562 + 4.0923344368 * age;
		while(ma<0){ //if age is negative (less than year 2000), angle will be negative. add 360 until positive
			ma += 360;
		}
		ma = ma%360;
		return ma;
	}
	
	@Override
	public String describe(){
		String description = "";
		description += super.describe();
		description += "Description:\nMercury is the closest planet to the sun\n";
		description += "\n\n";
		return description;
	}
	
	protected String getName(){
		return "Mercury";
	}
}
