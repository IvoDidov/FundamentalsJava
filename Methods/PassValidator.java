import java.util.Scanner;

public class PassValidator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String pass = scanner.nextLine();

		validatePass(pass);
	}

	private static void validatePass(String pass) {
		boolean ok = true;
		if(!validateLength(pass)) {
			System.out.println("Password must be between 6 and 10 characters"); 
			ok = false;
		}
		if(!validateChars(pass)) {
			System.out.println("Password must consist only of letters and digits");
			ok = false;
		}
		if(!validateDigits(pass)) {
			System.out.println("Password must have at least 2 digits");
			ok = false;
		}
		if (ok) {
			System.out.println("Password is valid");
		}
	}

	private static boolean validateLength(String pass) {
		if (pass.length() >= 6 && pass.length() <= 10) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean validateChars(String pass) {
		boolean valid = true;
		for (int i = 0; i < pass.length(); i++) {
			if ((pass.charAt(i) >= 65 && pass.charAt(i) <=90) || (pass.charAt(i) >= 97 && pass.charAt(i) <= 122) || ( pass.charAt(i) >=48 && pass.charAt(i) <= 57)) {
				valid = true;
			} else {
				valid = false;
				break;
			}
		}
		return valid;
	}

	private static boolean validateDigits(String pass) {
		int digitCount = 0;
		for (int i = 0; i < pass.length(); i++) {
			char [] nums = new char [] {'1','2','3','4','5','6','7','8','9','0'};
			for (char n : nums) {
				if (n == pass.charAt(i)) {
					digitCount++;
				}
			}
		}
		if (digitCount >= 2) {
			return true;
		} else {
			return false;
		}
	}
	
	
}

