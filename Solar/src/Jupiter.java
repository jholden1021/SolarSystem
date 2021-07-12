
public class Jupiter extends Planet<Gaseous> {
	private static final Jupiter SINGLE_INSTANCE = new Jupiter();
		
    private Jupiter() {
    	diameter = 88846 ; 
    	
    	myTerrain = new Gaseous();
    	myTerrain.addAtmosphericComponent(AtmosphericComponents.H2);
    	myTerrain.addAtmosphericComponent(AtmosphericComponents.He);
    	hasWater = true;
    	
    	generateMoons();
    }
    
    public static Jupiter getInstance() {
    	return SINGLE_INSTANCE;
    }
    
    /* Approximate position of orbit in degrees
     * source http://www.stjarnhimlen.se/comp/ppcomp.html */
    @Override
    public double calculateMeanAnomaly(){
    	double ma = 19.8950 + 0.0830853001 * age;
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
    	description += "Description:\nJupiter is the fifth planet from the sun\n";
    	description += "\n\n";
		return description;
    }
    
    protected String getName(){
    	return "Jupiter";
    }
    
    private void generateMoons(){
    	moons.add(new Moon("Adrastea",11));
    	moons.add(new Moon("Aitne",2));
    	moons.add(new Moon("Amalthea",109));
    	moons.add(new Moon("Ananke",17));
    	moons.add(new Moon("Aoede",2));
    	moons.add(new Moon("Arche",2));
    	moons.add(new Moon("Autonoe",2));
    	moons.add(new Moon("Callirrhoe",6));
    	moons.add(new Moon("Callisto",2996));
    	moons.add(new Moon("Carme",29));
    	moons.add(new Moon("Carpo",2));
    	moons.add(new Moon("Chaldene",2));
    	moons.add(new Moon("Cyllene",1));
    	moons.add(new Moon("Dia",2));
    	moons.add(new Moon("Elara",53));
    	moons.add(new Moon("Erinome",2));
    	moons.add(new Moon("Euanthe",2));
    	moons.add(new Moon("Eukelade",2));
    	moons.add(new Moon("Euporie",1));
    	moons.add(new Moon("Europa",1940));
    	moons.add(new Moon("Eurydome",2));
    	moons.add(new Moon("Ganymede",3270));
    	moons.add(new Moon("Harpalyke",2));
    	moons.add(new Moon("Hegemone",2));
    	moons.add(new Moon("Helike",2));
    	moons.add(new Moon("Hermippe",2));
    	moons.add(new Moon("Herse",1));
    	moons.add(new Moon("Himalia",106));
    	moons.add(new Moon("Iocaste",3));
    	moons.add(new Moon("Io",2264));
    	moons.add(new Moon("Isonoe",2));
    	moons.add(new Moon("Kale",1));
    	moons.add(new Moon("Kallichore",1));
    	moons.add(new Moon("Kalyke",3));
    	moons.add(new Moon("Kore",1));
    	moons.add(new Moon("Leda",10));
    	moons.add(new Moon("Lysithea",22));
    	moons.add(new Moon("Megaclite",3));
    	moons.add(new Moon("Metis",28));
    	moons.add(new Moon("Mneme",1));
    	moons.add(new Moon("Orthosie",1));
    	moons.add(new Moon("Pasiphae",37));
    	moons.add(new Moon("Pasithee",1));
    	moons.add(new Moon("Praxidike",4));
    	moons.add(new Moon("S/2003 J10",1));
    	moons.add(new Moon("S/2003 J12",1));
    	moons.add(new Moon("S/2003 J15",1));
    	moons.add(new Moon("S/2003 J16",1));
    	moons.add(new Moon("S/2003 J18",1));
    	moons.add(new Moon("S/2003 J19",1));
    	moons.add(new Moon("S/2003 J23",1));
    	moons.add(new Moon("S/2003 J2",1));
    	moons.add(new Moon("S/2003 J3",1));
    	moons.add(new Moon("S/2003 J4",1));
    	moons.add(new Moon("S/2003 J5",2));
    	moons.add(new Moon("S/2003 J9",1));
    	moons.add(new Moon("S/2010 J1",1));
    	moons.add(new Moon("S/2010 J2",1));
    	moons.add(new Moon("S/2011 J1",1));
    	moons.add(new Moon("S/2011 J2",1));
    	moons.add(new Moon("S/2016 J1",2));
    	moons.add(new Moon("S/2017 J1",1));
    	moons.add(new Moon("S/2017 J2",1));
    	moons.add(new Moon("S/2017 J3",1));
    	moons.add(new Moon("S/2017 J4",1));
    	moons.add(new Moon("S/2017 J5",1));
    	moons.add(new Moon("S/2017 J6",1));
    	moons.add(new Moon("S/2017 J7",1));
    	moons.add(new Moon("S/2017 J8",1));
    	moons.add(new Moon("S/2017 J9",1));
    	moons.add(new Moon("S/2018 J1",1));
    	moons.add(new Moon("Sinope",24));
    	moons.add(new Moon("Sponde",1));
    	moons.add(new Moon("Taygete",3));
    	moons.add(new Moon("Thebe",62));
    	moons.add(new Moon("Thelxinoe",1));
    	moons.add(new Moon("Themisto",5));
    	moons.add(new Moon("Thyone",2));
    	moons.add(new Moon("Valetudo",1));
    }
}
