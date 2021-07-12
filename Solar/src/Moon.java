
public class Moon extends CelestialBody {
	String name;
	
	public Moon(String n, int d){
		name = n;
		diameter = d;
	}
	
	@Override
	public String describe(){
		return "--" + name + "--" + "\nDiameter: " + diameter + "\nSurface Area: " + getSurfaceArea() + "\nVolume: " + getVolume() + "\n";
	}
}
