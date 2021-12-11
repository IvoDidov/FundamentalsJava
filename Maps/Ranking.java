package Maps;

import java.util.*;

public class Ranking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String,String> passes = new HashMap<>();
		Map<String, Map<String,Integer>> users = new HashMap<>();

		String input = scanner.nextLine();
		while(!input.equals("end of contests")) {
			String[] command = input.split(":");
			String contest = command[0];
			String pass = command[1];
			passes.put(contest, pass);

			input = scanner.nextLine();
		}

		input = scanner.nextLine();
		while (!input.equals("end of submissions")) {
			String[] command = input.split("=>");
			Map<String, Integer> contestsPoints = new HashMap<>();
			String contest = command[0];
			String pass = command[1];
			String user = command[2];
			Integer points = Integer.parseInt(command[3]);

			if(passes.containsKey(contest)) { // check if contest exists
				if (passes.get(contest).equals(pass)) { // check if pass is correct
					if (users.containsKey(user)) { // if user exists
						// if user had this exam
						if (users.get(user).containsKey(contest)){
							// if new result of points is better
							if (users.get(user).get(contest) < points) {
								contestsPoints.put(contest, points);
								users.get(user).put(contest, points);
							}
						} else { // if new exam for current user
							contestsPoints.put(contest, points);
							users.get(user).put(contest, points);
						}
					} else { // if new user
						contestsPoints.put(contest, points);
						users.put(user, contestsPoints);
					}
				}
			}


			input = scanner.nextLine();
		}

		// print best user: user + total points


		Map<String, Integer> usersSumPoints = new HashMap<>(); // creating and filling map of users and their topPoints
		users.forEach((user, contestsPoints) -> { // 
			int totalPoints = contestsPoints.values().stream().mapToInt(n->n).sum();
			usersSumPoints.put(user, totalPoints);
		});

//		usersSumPoints.forEach((k,v) -> System.out.println(k + " has total: " + v));

		String bestUser = Collections.max(usersSumPoints.entrySet(), Map.Entry.comparingByValue()).getKey();
		Integer bestUserPoints = Collections.max(usersSumPoints.entrySet(), Map.Entry.comparingByValue()).getValue();

		System.out.println("Best candidate is " + bestUser + " with total " + bestUserPoints + " points.");

		// print names sort by name
		// for each name print each contest + points - order descending
		System.out.println("Ranking: ");
		users.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(name -> {
					String user = name.getKey();
					Map<String,Integer> contestsPoints;
					contestsPoints = name.getValue();
			System.out.println(user);
			contestsPoints.entrySet().stream()
					.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
					.forEach( element -> System.out.println("#  " + element.getKey() + " -> " + element.getValue()));
		});

	}
}

