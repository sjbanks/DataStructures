
/**This is the driver file for the can class
 * @author sjbanks
 *
 */
public class CanTesterBANKS {
	//Steven Banks
	/**The main method of our driver file
	 * Do I have to javadoc the main?
	 * @param args 	pirates?
	 */
	public static void main(String[] args) {
		
		//makes some new cans
		Can CCChix = new Can("Campbell's", "Condensed Chicken Noodle Soup", 12, 0.99);
		Can AmyOrgBroth = new Can("Amy's Organic", "Vegetable Broth");
		Can HyVRoastTom = new Can(12.5, 1.35);
		HyVRoastTom.setCompany("Hy-Vee");
		HyVRoastTom.setContent("Fire Roasted Tomatoes");
		AmyOrgBroth.setSize(32);
		AmyOrgBroth.setPrice(3.99);
		Can SDB = new Can();
		SDB.setCompany("MicroBrewing");
		SDB.setContent("Sweet, Delicious Beer!");
		SDB.setSize(12);
		SDB.setPrice(3.50);
		Can Perriair = new Can("Perri-air", 19.99);
		Perriair.setContent("Naturally Sparkling Salt-Free Air");
		Perriair.setSize(14.5);
		
		//let's print these bad boys
		System.out.println("Can 1: " + CCChix.toString());
		System.out.println("Can 2: " + AmyOrgBroth.toString());
		System.out.println("Can 3: " + HyVRoastTom.toString());
		System.out.println("Can 4: " + SDB.toString());
		System.out.println("Can 4: " + Perriair.toString());
	}
}
