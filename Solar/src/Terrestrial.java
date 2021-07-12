import java.util.ArrayList;

public class Terrestrial extends Terrain {
	private double surfacePressure;
	
	public Terrestrial(double sp){
		surfacePressure = sp;
		atmosphere = new ArrayList<AtmosphericComponents>();
	}
	
	@Override
	public String describe() {
		String description = "The surface pressure is " + surfacePressure + "\n";
		description += "The primary atmospheric components are : ";
		for(AtmosphericComponents e : atmosphere){
			description += e.toString() + " ";
		}
		description += "\n";
		return description;
	}
	
	public double getSurfacePressure(){
		return surfacePressure;
	}

}
