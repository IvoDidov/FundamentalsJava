package Maps;

import java.util.*;

public class SoftUniParking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String,String> users = new LinkedHashMap<>();
		Integer n = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < n; i++) {
			String input = scanner.nextLine();
			String[] command = input.split(" ");
			String user = command[1];
			// command register
			if (command[0].equals("register")) {
				String plate = command[2];
				if (users.containsKey(user)) {
					System.out.println("ERROR: already registered with plate number " + plate);
				} else{
					users.put(user,plate);
					System.out.println(user + " registered " + plate +" successfully");
				}
				// command unregister
			} else {
				if(users.containsKey(user)) {
					users.remove(user);
					System.out.println(user + " unregistered successfully");
				} else {
					System.out.println("ERROR: user " + user + " not found");
				}
			}
		}

		users.forEach((k,v) -> System.out.println(k + " => " + v));

	}
}
