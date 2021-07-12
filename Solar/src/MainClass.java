public class MainClass {
	public static void main (String[] args) {
		SolarSystem MilkyWay = SolarSystem.bigBang();
		System.out.println(MilkyWay.describe());
		
		MilkyWay.addDays(366);
		
		System.out.println(MilkyWay.shortDescribe());
	}
}