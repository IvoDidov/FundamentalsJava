package Songs;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		List<Song> songs = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String input = scanner.nextLine();

			String[] songData = input.split("_");
			String list = songData[0];
			String name = songData[1];
			String time = songData[2];

			Song song = new Song(list, name, time);
			songs.add(song);

		}

		String filter = scanner.nextLine();

		if (filter.equals("all")) {
			for (Song song : songs) {
					System.out.printf("%s", song.getName());
					System.out.println();
			}
		} else {
			for (Song song : songs) {
				if (song.getTypeList().equals(filter)) {
					System.out.printf("%s", song.getName());
					System.out.println();
				}
			}
		}

	}
}
