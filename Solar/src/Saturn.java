
public class Saturn extends Planet<Gaseous> {
	private static final Saturn SINGLE_INSTANCE = new Saturn();
	
    private Saturn() {
    	diameter = 74900  ; 
    	
    	myTerrain = new Gaseous();
    	myTerrain.addAtmosphericComponent(AtmosphericComponents.H2);
    	myTerrain.addAtmosphericComponent(AtmosphericComponents.He);
    	hasWater = true;
    	
    	generateMoons();
    }
    
    public static Saturn getInstance() {
    	return SINGLE_INSTANCE;
    }
    
    /* Approximate position of orbit in degrees
     * source http://www.stjarnhimlen.se/comp/ppcomp.html */
    @Override
    public double calculateMeanAnomaly(){
    	double ma = 316.9670 + 0.0334442282 * age;
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
    	description += "Description:\nSaturn is the sixth planet from the sun\nSaturn's ring system extends up to 175,000 miles from the planet\n";
    	description += "\n\n";
		return description;
    }
    
    protected String getName(){
    	return "Saturn";
    }
    
    private void generateMoons(){
    	moons.add(new Moon("Aegaeon",0));
    	moons.add(new Moon("Aegir",4));
    	moons.add(new Moon("Albiorix",20));
    	moons.add(new Moon("Anthe",1));
    	moons.add(new Moon("Atlas",19));
    	moons.add(new Moon("Bebhionn",4));
    	moons.add(new Moon("Bergelmir",4));
    	moons.add(new Moon("Bestla",4));
    	moons.add(new Moon("Calypso",13));
    	moons.add(new Moon("Daphnis",5));
    	moons.add(new Moon("Dione",698));
    	moons.add(new Moon("Enceladus",313));
    	moons.add(new Moon("Epimetheus",72));
    	moons.add(new Moon("Erriapus",6));
    	moons.add(new Moon("Farbauti",3));
    	moons.add(new Moon("Fenrir",2));
    	moons.add(new Moon("Fornjot",4));
    	moons.add(new Moon("Greip",4));
    	moons.add(new Moon("Hati",4));
    	moons.add(new Moon("Helene",22));
    	moons.add(new Moon("Hyperion",168));
    	moons.add(new Moon("Hyrrokkin",5));
    	moons.add(new Moon("Iapetus",913));
    	moons.add(new Moon("Ijiraq",7));
    	moons.add(new Moon("Janus",111));
    	moons.add(new Moon("Jarnsaxa",4));
    	moons.add(new Moon("Kari",4));
    	moons.add(new Moon("Kiviuq",10));
    	moons.add(new Moon("Loge",4));
    	moons.add(new Moon("Methone",2));
    	moons.add(new Moon("Mimas",246));
    	moons.add(new Moon("Mundilfari",4));
    	moons.add(new Moon("Narvi",4));
    	moons.add(new Moon("Paaliaq",14));
    	moons.add(new Moon("Pallene",3));
    	moons.add(new Moon("Pan",18));
    	moons.add(new Moon("Pandora",51));
    	moons.add(new Moon("Phoebe",132));
    	moons.add(new Moon("Polydeuces",2));
    	moons.add(new Moon("Prometheus",54));
    	moons.add(new Moon("Rhea",949));
    	moons.add(new Moon("S/2004 S12",3));
    	moons.add(new Moon("S/2004 S13",4));
    	moons.add(new Moon("S/2004 S17",2));
    	moons.add(new Moon("S/2007 S2",4));
    	moons.add(new Moon("S/2007 S3",3));
    	moons.add(new Moon("S/2004 S7",4));
    	moons.add(new Moon("S/2009 S1",0));
    	moons.add(new Moon("Siarnaq",25));
    	moons.add(new Moon("Skathi",5));
    	moons.add(new Moon("Skoll",4));
    	moons.add(new Moon("Surtur",4));
    	moons.add(new Moon("Suttungr",4));
    	moons.add(new Moon("Tarqeq",4));
    	moons.add(new Moon("Tarvos",9));
    	moons.add(new Moon("Telesto",15));
    	moons.add(new Moon("Tethys",660));
    	moons.add(new Moon("Thrymr",4));
    	moons.add(new Moon("Titan",3200));
    	moons.add(new Moon("Ymir",11));
    	moons.add(new Moon("S/2006 S1",4));
    	moons.add(new Moon("S/2006 S3",4));
    }
    
}
