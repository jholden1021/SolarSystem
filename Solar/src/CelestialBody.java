
public abstract class CelestialBody {
	
	// diameter in miles
	int diameter;
	
	public long getSurfaceArea(){
		int r = diameter/2;
		return (long) (4.0 * 3.14159 * Math.pow(r,2));
	}
	
	public long getVolume(){
		int r = diameter/2;
		return (long) ((4.0/3.0) * 3.14159 * Math.pow(r,3));
	}
	
	public abstract String describe();
}
