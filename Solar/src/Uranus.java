
public class Uranus extends Planet<Gaseous> {
	private static final Uranus SINGLE_INSTANCE = new Uranus();
	
    private Uranus() {
    	diameter = 31763; 
    	
    	myTerrain = new Gaseous();
    	myTerrain.addAtmosphericComponent(AtmosphericComponents.H2);
    	myTerrain.addAtmosphericComponent(AtmosphericComponents.He);
    	myTerrain.addAtmosphericComponent(AtmosphericComponents.CH4);
    	hasWater = true;
    	
    	generateMoons();
    }
    
    public static Uranus getInstance() {
    	return SINGLE_INSTANCE;
    }
    
    /* Approximate position of orbit in degrees
     * source http://www.stjarnhimlen.se/comp/ppcomp.html */
    @Override
    public double calculateMeanAnomaly(){
    	double ma = 142.5905 + 0.011725806 * age;
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
    	description += "Description:\nUranus is the seventh planet from the sun\n";
    	description += "\n\n";
		return description;
    }
    
    protected String getName(){
    	return "Uranus";
    }

    private void generateMoons(){
	    moons.add(new Moon("Ariel",719));
	    moons.add(new Moon("Belinda",56));
	    moons.add(new Moon("Bianca",32));
	    moons.add(new Moon("Caliban",45));
	    moons.add(new Moon("Cordelia",25));
	    moons.add(new Moon("Cressida",50));
	    moons.add(new Moon("Cupid",11));
	    moons.add(new Moon("Desdemona",40));
	    moons.add(new Moon("Ferdinand",12));
	    moons.add(new Moon("Francisco",14));
	    moons.add(new Moon("Juliet",58));
	    moons.add(new Moon("Mab",16));
	    moons.add(new Moon("Miranda",293));
	    moons.add(new Moon("Oberon",946));
	    moons.add(new Moon("Ophelia",27));
	    moons.add(new Moon("Perdita",19));
	    moons.add(new Moon("Portia",84));
	    moons.add(new Moon("Prospero",31));
	    moons.add(new Moon("Puck",101));
	    moons.add(new Moon("Rosalind",45));
	    moons.add(new Moon("Setebos",30));
	    moons.add(new Moon("Stephano",20));
	    moons.add(new Moon("Sycorax",10));
	    moons.add(new Moon("Titania",980));
	    moons.add(new Moon("Trinculo",11));
	    moons.add(new Moon("Umbriel",727));
	    moons.add(new Moon("Margaret",12));
    }
}
