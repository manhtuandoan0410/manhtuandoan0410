package Week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Week5.Song;

public class ObjectsSongArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Song> songs = new ArrayList<Song>();
		songs.add(new Song("Easy on Me", "Adele", 2021));
        songs.add(new Song("Shivers", "Ed Sheeran", 2021));
        songs.add(new Song("Holy Ghost Fire", "Larkin Poe", 2020));
		
		System.out.println("=== List of songs ===");
		for (Song song : songs) {
			System.out.println(song.getArtist() + ": " + song.getName() + 
								" (" + song.getYear() + ")");
		}
		

	}

}
