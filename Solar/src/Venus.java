
public class Venus extends Planet<Terrestrial> {
	private static final Venus SINGLE_INSTANCE = new Venus();
	
    private Venus() {
    	diameter = 7521 ; 
    	
    	myTerrain = new Terrestrial(90);
    	myTerrain.addAtmosphericComponent(AtmosphericComponents.CO2);
    	myTerrain.addAtmosphericComponent(AtmosphericComponents.N2);
    	hasWater = false;
    }
    
    public static Venus getInstance() {
    	return SINGLE_INSTANCE;
    }
    
    /* Approximate position of orbit in degrees
     * source http://www.stjarnhimlen.se/comp/ppcomp.html */
    @Override
    public double calculateMeanAnomaly(){
    	double ma = 48.0052 + 1.6021302244 * age;
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
    	description += "Description:\nVenus is the second planet from the sun\n";
    	description += "\n\n";
		return description;
    }
    
    protected String getName(){
    	return "Venus";
    }
}
