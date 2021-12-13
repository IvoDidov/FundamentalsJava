package exam;

import java.util.*;

public class EmailValidator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String email = scanner.nextLine();
		String input = scanner.nextLine();

		while(!input.equals("Complete")) {
			String[] command = input.split(" ");
			switch (command[0]) {
				case "Make" :
					if (command[1].equals("Upper")) {
						 email = email.toUpperCase();
						System.out.println(email);
					} else{
						email = email.toLowerCase();
						System.out.println(email);
					}
					break;
				case "GetDomain" :
					int count = Integer.parseInt(command[1]);
					String result = email.substring(email.length()-count);
					System.out.println(result);
					break;

				case "GetUsername" :
					int pos = -1 ;
					for (int i = 0; i < email.length(); i++) {
						if (email.charAt(i)== '@') {
							pos = i;
						}
					}
					if (pos >= 0) {
						StringBuilder name = new StringBuilder();
						for (int i = 0; i < pos; i++) {
							name.append(email.charAt(i));
						}
						System.out.println(name);
					} else {
						System.out.println("The email " + email + " doesn't contain the @ symbol.");
					}
					break;

				case "Replace" :

					String  X = (command[1]);
					String B  = X.toUpperCase();
					String A = X.toLowerCase();
					email = email.replace(A, "-");
					email = email.replace(B, "-");
					System.out.println(email);
					break;

				case "Encrypt" :
					for (int i = 0; i < email.length(); i++) {
						int a = email.charAt(i);
						System.out.print(a + " ");
					}
					break;
			}



			input = scanner.nextLine();
		}



	}
}
