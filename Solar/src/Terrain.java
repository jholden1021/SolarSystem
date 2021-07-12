import java.util.ArrayList;
import java.util.List;

public abstract class Terrain {
	protected List<AtmosphericComponents> atmosphere;
	
	public abstract String describe();
	
	public Terrain(){
		atmosphere = new ArrayList<AtmosphericComponents>();
	}
	
	public void addAtmosphericComponent(AtmosphericComponents e){
		atmosphere.add(e);
	}
}
