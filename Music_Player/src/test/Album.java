package test;

import java.util.*;

public class Album {
	public String name;
	public String artist;
	public ArrayList<Song> Songs;

	public Album(String name, String artist) {

		this.name = name;
		this.artist = artist;
		this.Songs = new ArrayList<Song>();
	}

	public Album() {

	}
	
	public Song findSong(String title) {
		for (Song checkedSong : Songs) {
			if (checkedSong.getTitle().equals(title)) {
			}
		}
		return null;

	}

	public boolean addSong(String title, double duration) {
		if (findSong(title) == null) {
			Songs.add(new Song(title, duration));
			// System.out.println(title+"Succesfully Added to the List");
			return true;
		} else {
			// System.out.println("Song with name "+title+"already exits in the list");
			return false;
		}
	}

	public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
		int index = trackNumber - 1;
		if (index > 0 && index <= this.Songs.size()) {
			playList.add(this.Songs.get(index));
			return true;
		} else {
			// System.out.println("this album does not have song with
			// trackNumber"+trackNumber);
			return false;

		}
	}

	public boolean addToPlayList(String title, LinkedList<Song> playList) {
		for (Song checkedSong : Songs) {
			if (checkedSong.getTitle().equals(title)) {
				playList.add(checkedSong);
				return true;
			}
		}
		// System.out.println(title+"there is no much in album");
		return false;
	}

}
