package wmich.edu.cs1120.LA4_Lee;
/**
 * Dog class extends Pet Class
 * @author Darryl
 */
public class Dog extends Pet {
	private int walkTime;
	/**
	 * Constructor for Dogs
	 * @param pID :ID for pet
	 * @param name : name of pet
	 * @param breed : breed of pet
	 * @param age : age pet
	 * @param walkTime : the time of pet walked
	 */
	public Dog(String pID, String name, String breed, int age, int walkTime) {
		super(pID, name, breed, age);
		this.walkTime=walkTime;
	}
	/**
	 *Generate a string with all the data
	 * @return a string of message
	 */
	public String toString() {
		return super.toString() + "\nWalkTime: " + walkTime;
	}
}
