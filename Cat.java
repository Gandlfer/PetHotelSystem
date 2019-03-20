package wmich.edu.cs1120.LA4_Lee;
/**
 * Cat class extends Pet class 
 * @author Darryl
 */
public class Cat extends Pet {
	private String algc;
	
	/**
	 * Constructor for Dogs
	 * @param pID :ID for pet
	 * @param name : name of pet
	 * @param breed : breed of pet
	 * @param age : age pet
	 * @param algc : true if pet is allergic
	 */
	public Cat(String pID, String name, String breed, int age, String algc) {
		super(pID, name, breed, age);
		this.algc=algc;
	}
	
	/**
	 * @return true if pet is allergic
	 */
	public boolean allergic() {
		if(algc.equalsIgnoreCase("Allergic")) 
			return true;
		else
			return false;
	}
	
	/**
	 *Generate a string with all the data
	 * @return a string of message
	 */
	public String toString() {
		return super.toString() + "\nAllergic: " + allergic();
	}
}
