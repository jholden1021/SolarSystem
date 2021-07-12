import java.util.ArrayList;
import java.util.List;
/* Solar System
 * Implements facade design pattern
 * */
public class SolarSystem {

	private static SolarSystem SINGLE_INSTANCE;
	Sun theSun;
	List<Planet<?>> planets;

	// Age is days the year 2000
	int age;

	public static SolarSystem bigBang() {
		if(SINGLE_INSTANCE == null){
			SINGLE_INSTANCE = new SolarSystem();
		}
		return SINGLE_INSTANCE;
	}

	private SolarSystem(){
		theSun = Sun.getInstance();

		planets = new ArrayList<Planet<?>>();
		planets.add(Mercury.getInstance());
		planets.add(Venus.getInstance());
		planets.add(Earth.getInstance());
		planets.add(Mars.getInstance());
		planets.add(Jupiter.getInstance());
		planets.add(Saturn.getInstance());
		planets.add(Uranus.getInstance());
		planets.add(Neptune.getInstance());

		age = 0;
	}

	public void addDays(int days){
		age += days;

		theSun.addDays(days);

		for(Planet<?> p : planets){
			p.addDays(days);
		}
	}

	public String describe(){
		String description = "";
		description += "==================The Solar System==================\n";
		description += "It has been " + age + " days since Jan 1, 2000\n";
		description += theSun.describe();
		description += "------------------Planets------------------\n\n";
		description += "There are " + planets.size() + " planets\n";
		for(Planet<?> p : planets){
			description += p.describe();
		}
		return description;
	}

	public String shortDescribe(){
		String description = "";
		description += "==================The Solar System==================\n";
		description += "It has been " + age + " days since Jan 1, 2000\n";
		description += theSun.describe();
		description += "------------------Planets------------------\n\n";
		description += "There are " + planets.size() + "planets\n";
		for(Planet<?> p : planets){
			description += p.shortDescribe();
		}
		return description;
	}
}
