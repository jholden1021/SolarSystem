
public class Earth extends Planet<Terrestrial> {
	private static final Earth SINGLE_INSTANCE = new Earth();
	
	
    private Earth() {
    	diameter = 7917; 
    	
    	myTerrain = new Terrestrial(1);
    	myTerrain.addAtmosphericComponent(AtmosphericComponents.N2);
    	myTerrain.addAtmosphericComponent(AtmosphericComponents.O2);
    	myTerrain.addAtmosphericComponent(AtmosphericComponents.Ar);
    	hasWater = true;
    	
    	Moon earthsMoon = new Moon("The Moon", 2159);
    	moons.add(earthsMoon);
    }
    
    public static Earth getInstance() {
    	return SINGLE_INSTANCE;
    }
    
    /* Approximate position of orbit in degrees
     * source http://www.stjarnhimlen.se/comp/ppcomp.html */
    @Override
    public double calculateMeanAnomaly(){
    	double ma = (1/365.25) * age;
    	ma = ma * 360;
    	while(ma<0){ //if age is negative (less than year 2000), angle will be negative. add 360 until positive
    		ma += 360;
    	}
    	ma = ma%360;
    	return ma;
    }
    
    @Override
    public String describe(){
    	String description = super.describe();
    	description += "Description:\nThe earth is the third planet from the sun\n";
    	description += "\n\n";
		return description;
    }
    
    protected String getName(){
    	return "Earth";
    }
}
