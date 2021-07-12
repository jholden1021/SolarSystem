
public class Neptune extends Planet<Gaseous> {
	private static final Neptune SINGLE_INSTANCE = new Neptune();
	
    private Neptune() {
    	diameter = 30779 ; 
    	
    	myTerrain = new Gaseous();
    	myTerrain.addAtmosphericComponent(AtmosphericComponents.H2);
    	myTerrain.addAtmosphericComponent(AtmosphericComponents.He);
    	myTerrain.addAtmosphericComponent(AtmosphericComponents.CH4);
    	hasWater = true;
    	
    	generateMoons();
    }
    
    public static Neptune getInstance() {
    	return SINGLE_INSTANCE;
    }
    
    /* Approximate position of orbit in degrees
     * source http://www.stjarnhimlen.se/comp/ppcomp.html */
    @Override
    public double calculateMeanAnomaly(){
    	double ma = 260.2471 + 0.005995147 * age;
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
    	description += "Description:\nNeptune is the eighth planet from the sun\n";
    	description += "\n\n";
		return description;
    }
    
    protected String getName(){
    	return "Neptune";
    }
    
    private void generateMoons(){
	    moons.add(new Moon("Despina",93));
	    moons.add(new Moon("Galatea",109));
	    moons.add(new Moon("Halimede",39));
	    moons.add(new Moon("Laomedeia",26));
	    moons.add(new Moon("Larissa",121));
	    moons.add(new Moon("Naiad",41));
	    moons.add(new Moon("Nereid",211));
	    moons.add(new Moon("Neso",37));
	    moons.add(new Moon("Proteus",261));
	    moons.add(new Moon("Psamathe",25));
	    moons.add(new Moon("S/2004 N1",11));
	    moons.add(new Moon("Sao",27));
	    moons.add(new Moon("Thalassa",51));
	    moons.add(new Moon("Triton",1681));
    }
}
