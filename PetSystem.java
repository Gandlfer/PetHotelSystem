package wmich.edu.cs1120.LA4_Lee;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 * PetSystem that implements PetHotelInterface
 * @author Darryl
 */
public class PetSystem implements PetHotelInterface {

	@Override
	public int populatePetArray(Pet[] petArray) throws IOException {
		// TODO Auto-generated method stub
		Scanner readFile = new Scanner( new File("input.txt"));
		String data = "";
		
		while(readFile.hasNextLine()) {
			data+=readFile.nextLine()+"#";
		}
		readFile.close();
		
		String token[] = data.split("#");
		for(int i=1;i<token.length;i++) {
			String temp[] = token[i].split(";");
			if(token[i].charAt(0)=='D') {
				petArray[i-1] = new Dog( temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), Integer.parseInt(temp[5]));
			}
			else {
				petArray[i-1] = new Cat( temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), temp[5]);
			}
		}
		return Integer.parseInt(token[0]);
	}

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("------------- Menu -------------");
		System.out.println(" 1) Display Pets");
		System.out.println(" 2) Update Pet Feeding Status");
		System.out.println(" 3) Quit");
		System.out.println("--------------------------------");
		System.out.print("Please choose an option: ");
	}
	
	@Override
	public void displayPets(int nrPets, Pet[] petArray) {
		// TODO Auto-generated method stub
		for(int i=0; i<nrPets;i++) {
			System.out.println(petArray[i].toString());
			System.out.println();
		}
	}
	
	@Override
	public void updateFeedingStatus(String petPidToUpdate, int nrPets, Pet[] petArray) {
		// TODO Auto-generated method stub
		boolean found=false;
		for(int i = 0; i< nrPets;i++) {
			if(petArray[i].getPID().equals(petPidToUpdate)){
				found=true;
				if(petArray[i].getFed()==false) {
					petArray[i].setFed(true);
					System.out.println("Updated the Fed status to YES.");
					break;
				}
				else
					System.out.println("Warning: Pet Overfed!");
			}
		}
		if(found==false) {
			System.out.println("Pet not Found");
		}
	}
}
