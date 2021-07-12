public class Mars extends Planet<Terrestrial> {
	private static final Mars SINGLE_INSTANCE = new Mars();
	
	private Mars() {
		diameter = 4222 ; 
		
		myTerrain = new Terrestrial(.006);
		myTerrain.addAtmosphericComponent(AtmosphericComponents.CO2);
		myTerrain.addAtmosphericComponent(AtmosphericComponents.N2);
		myTerrain.addAtmosphericComponent(AtmosphericComponents.Ar);
		hasWater = true;
		
		Moon phobos = new Moon("Phobos", 14);
		Moon deimos = new Moon("Deimos", 8);
		moons.add(phobos);
		moons.add(deimos);
	}
	
	public static Mars getInstance() {
		return SINGLE_INSTANCE;
	}
	
	/* Approximate position of orbit in degrees
	 * source http://www.stjarnhimlen.se/comp/ppcomp.html */
	@Override
	public double calculateMeanAnomaly(){
		double ma = 18.6021 + 0.5240207766 * age;
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
		description += "Description:\nMars is the fourth planet from the sun\n";
		description += "\n\n";
		return description;
	}
	
	protected String getName(){
		return "Mars";
	}
}
