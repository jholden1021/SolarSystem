import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Planet<T extends Terrain> extends CelestialBody{
	T myTerrain;
	List<Moon> moons;
	Boolean hasWater  = false;
	
	
	// Age is days since the year 2000
	double age;
	
	public Planet(){
		moons = new ArrayList<Moon>();
	}
	
	public void addDays(int days){
		age += days;
	}
	
	public abstract double calculateMeanAnomaly();
	
	public void addAtmosphericComponent(AtmosphericComponents e){
		myTerrain.addAtmosphericComponent(e);
	}
	
	
	@Override
	public String describe(){
		String description = "";
		description += shortDescribe();
		for(Moon m : moons) {
			description += m.describe();
		}
		description += "Terrain\n";
		description += myTerrain.describe();
		description += "\n";
		return description;
	}
	
	
	public String shortDescribe(){
		String description = "";
		DecimalFormat df = new DecimalFormat( "#,###,###,##0.0" );
		double pos = new Double(df.format(calculateMeanAnomaly())).doubleValue();
		
		description += "________" + getName() + "________\n\n";
		description += "Diameter: " + diameter + " miles\nSurface Area: " + getSurfaceArea() + " square miles\nVolume: " + getVolume() + " cubic miles\n";
		description += "Approximate Current Position: " + pos + " degrees\n";
		description += "Contains water: " + hasWater + "\n";
		description += "Number of Moons:  " + moons.size() + "\n\n\n";
		return description;
	}
	
	protected String getName(){
		return "Unknown Planet";
	}
}
