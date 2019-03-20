package wmich.edu.cs1120.LA4_Lee;
import java.io.*;
import java.util.Scanner;
/**
 * Main class that test the class
 * @author Darryl
 */
public class LA4Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PetSystem sys= new PetSystem();
		Pet[] petArray = new Pet[100];
		boolean quitFlag = false;
		int nrPets = sys.populatePetArray(petArray);
        Scanner scan = new Scanner(System.in);
        
        petArray = new Pet[nrPets];
		sys.populatePetArray(petArray);
		
        while (!quitFlag) {
            sys.showMenu();
            String response= scan.nextLine();
            switch (response) {
                case "1":
                    sys.displayPets(nrPets, petArray);;
                    break;
                case "2":
                	System.out.print("Please enter the ID of the pet :");
                	String petPidToUpdate = scan.nextLine();
                    sys.updateFeedingStatus(petPidToUpdate, nrPets, petArray);
                    break;
                case "3":
                    quitFlag = true;
                    break;
                default :
                	System.out.println("Input must be 1, 2 or 3!");
            }
        }
        scan.close();
        System.out.println("\nGoodbye!");
	}
}
