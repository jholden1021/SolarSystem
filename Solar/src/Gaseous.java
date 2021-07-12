
public class Gaseous extends Terrain {
	
	@Override
	public String describe() {
		String description = "The primary atmospheric components are : ";
		for(AtmosphericComponents e : atmosphere){
			description += e.toString() + " ";
		}
		description += "\n";
		return description;
	}

}
