
public class Sun extends CelestialBody{
	
	private static final Sun SINGLE_INSTANCE = new Sun();
	
	// Age is days since the year 2000
	double age;
	
    private Sun() {
    	diameter = 864337;
    	age = 0;
    }
    
    public static Sun getInstance() {
    	return SINGLE_INSTANCE;
    }
    
    public void addDays(int days){
    	age += days;
    }
    
    /* Approximate position of orbit in degrees
     * source http://www.stjarnhimlen.se/comp/ppcomp.html */
    public double calculateMeanAnomaly(){
    	double ma = 356.0470 + 0.9856002585 * age;
    	return ma%360;
    }
    
    @Override
    public String describe(){
    	String description = "";
    	description += "The sun is the center of the solar system\n";
    	description += "Diameter: " + diameter + " miles\nSurface Area: " + getSurfaceArea() + " square miles\nVolume: " + getVolume() + " cubic miles\n";
    	description += "Approximate Current Position: " + calculateMeanAnomaly() + " degrees\n\n\n";
		return description;
    }
}
