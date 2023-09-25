package maccess;

import test.*;
import java.util.*;


public class Main {
	public static ArrayList<Album> albums = new ArrayList<>();

	public static void main(String[] args) {
		Album album = new Album("Album", "AC/DC");

		album.addSong("TNt", 4.5);
		album.addSong("Highway to hell", 3.5);
		album.addSong("ThunderStruck", 5.9);

		albums.add(album);

		album = new Album("Album2", "Eminum");

		album.addSong("rap god", 4.5);
		album.addSong("Love yourslef", 4.5);

		albums.add(album);

		LinkedList<Song> playList = new LinkedList<>();

		albums.get(0).addToPlayList("TNT", playList);
		albums.get(0).addToPlayList("Highway to hell", playList);
		albums.get(1).addToPlayList("rap god", playList);
		albums.get(1).addToPlayList("Lose yourself", playList);

		play(playList);

	}

	public  static void play(LinkedList<Song> playList) {
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;

		ListIterator<Song> listIterator = playList.listIterator();

		if (playList.size() == 0) {
			System.out.println("This playList have to Song");

		} else {
			System.out.println("now Playing" + listIterator.next());
		}
		listIterator.next().toString();
		
		while (!quit) {
			int action = sc.nextInt();
			sc.nextLine();
			switch (action) {
			case 0:
				System.out.println("PlayList complete..!");
				quit = true;
				break;
			case 1:
				if (!forward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if (listIterator.hasNext()) {
					System.out.println("Now playing" + listIterator.next().toString());

				} else {
					System.out.println("is no song is avilable,reached to the end of the list");
					forward = false;
				}
				break;
			case 2:
				if (forward) {
					if (listIterator.hasPrevious()) {
						System.out.println("now playing" + listIterator.next().toString());

					}
					forward = false;

					if (listIterator.hasPrevious()) {
						System.out.println("now playing" + listIterator.next().toString());

					} else {
						System.out.println("we are the first song");
						forward = false;
					}
					break;

				}
			case 3:
				if (forward) {
					if (listIterator.hasPrevious()) {
						System.out.println("Now playing" + listIterator.next().toString());
						forward = false;

					} else {
						System.out.println("we are at start of the list");
					}
				} else {
					if (listIterator.hasNext()) {
						System.out.println("now playing" + listIterator.next().toString());
					}
				}
				break;
			case 4:
				play(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if (playList.size() > 0) {
					listIterator.remove();
					if (listIterator.hasNext()) {
						System.out.println("now playing" + listIterator.next().toString());

					} else {
						if (listIterator.hasPrevious()) {
							System.out.println("now playoing" + listIterator.next().toString());
						}
					}
				}
			}
		}

	}

	public static void printMenu() {
		System.out.println("Available options\n press");
		System.out.println("0 - to quit\n" + "1 - to play next song\n" + "2 - to play previous song\n"
				+ "3 - to replay the current song\n" + "4 - list of all songs \n" + "5 - print all available options\n"
				+ "6 - delete current song");

	}

	public void prinList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("------------");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("--------------");
	}
}
