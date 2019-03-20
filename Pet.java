package wmich.edu.cs1120.LA4_Lee;

/**
 * Pet class 
 * @author Darryl
 */
public class Pet{
	private String pID, name, breed;
	private int age;
	boolean fed;
	/**
	 * Constructor for Pets
	 * @param pID :ID for pet
	 * @param name : name of pet
	 * @param breed : breed of pet
	 * @param age : age pet
	 */
	public Pet(String pID, String name, String breed, int age) {
		this.pID=pID;
		this.name=name;
		this.breed=breed;
		this.age=age;
		fed=false;
	}
	/**
	 * setter for fed
	 * @param b boolean
	 */
	public void setFed(boolean b) {fed=b;}
	/**
	 * getter for fed
	 * @return fed
	 */
	public boolean getFed() {return fed;}
	/**
	 * getter for pID
	 * @return pID
	 */
	public String getPID() {return pID;}
	
	/**
	 * to check if fed is true or false and create a string depends 
	 * @return string of message
	 */
	public String fedCheck() {
		if(fed==false)
			return "\n\t\t>>>>> Fed: NO";
		else
			return "\n\t\t>>>>> Fed: YES";
	}
	
	/**
	 *Generate a string with all the data
	 * @return a string of message
	 */
	public String toString() {
		return "PID: " + pID + "\nBreed: " + breed + "\nName: " + name + "\nAge: " + age + fedCheck();
	}
}
