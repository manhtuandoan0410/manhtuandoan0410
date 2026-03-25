package Week5;

public class ObjectsSongArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song[] listOfSongs = new Song[3];
		
		listOfSongs[0] = new Song("Easy On Me", "Adele", 2021);
		listOfSongs[1] = new Song("Shivers", "Ed Sheeran", 2021);
		listOfSongs[2] = new Song("Holy Ghost Fire", "Larkin Poe", 2020);
		
		System.out.println("=== List of songs ===");
		for (int i = 0; i < listOfSongs.length; i++) {
			System.out.println(listOfSongs[i].getArtist() + ": " + listOfSongs[i].getName() + " (" + listOfSongs[i].getYear() + ")");
		}
		
	}

}