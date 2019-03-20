package wmich.edu.cs1120.LA4_Lee;
import java.io.*;

public interface PetHotelInterface{	
	// returns nr of pets described in the input file
	public int populatePetArray(Pet[] petArray) throws IOException;   
	public void showMenu();
	public void displayPets(int nrPets, Pet[] petArray);
	public void updateFeedingStatus(String petPidToUpdate, int nrPets, Pet[] petArray); 
} 

