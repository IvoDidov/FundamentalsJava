import java.util.Scanner;
import java.util.Arrays;

public class MultiSign {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine(); // take array as string
		// make it a real array
		String[] num = input.split(" ");
		
		//take new line as a command
		input = scanner.nextLine();

		while (!input.equals("end")) {
			// make full comand an array
		String[] fullCommand = input.split(" ");

			String command = fullCommand[0];

			switch (command) {
				case "exchange" :
					num = exchange(num, fullCommand[1]);
					break;
				case "max" :
					if (fullCommand[1].equals("even")) {
						maxEven(num);
					} else {
						maxOdd(num);
					}
					break;
				case "min" :
					if  (fullCommand[1].equals("even")) {
						minEven(num);
					} else {
						minOdd(num);
					}
					break;
				case "first" :
					if (fullCommand[2].equals("even")) {
						firstEven(num, fullCommand[1]);
					}else {
						firstOdd(num, fullCommand[1]);
					}
					break;
				case "last":
					if (fullCommand[2].equals("even")) {
						lastEven(num, fullCommand[1]);
					} else {
						lastOdd(num, fullCommand[1]);
					}
					break;
			}
			input = scanner.nextLine();
			
		}
		// print result of the array
		System.out.print("[");
		for (int i = 0; i < num.length; i++) {
			if (i == num.length -1) {
				System.out.print(num[i]);
			} else {
				System.out.print(num[i] + ", ");
			}
		}
		System.out.print("]");
	}

	
	
	private static String[] exchange(String[] num, String token) {
		
		/*		method exchange 
	 * does - acording to input index, 
	 * everything after the index goes in the beginning
	 * everything before the index goes after
	*/
		
		int index = Integer.parseInt(token);
		if (index < 0 || index > num.length -1) {
			System.out.println("Invalid index");
			return num;
		} else {
			String[] holder = new String[num.length];
			// take all after index and put in start of new []
			for (int i = 0; i < num.length - (index +1); i++) {
				holder[i] = num[index + 1 + i];
			}
			// take all before index and put in end of new []
			for (int i = 0; i <= index; i++) {
				holder[num.length - (index +1) + i] = num[i];
			}
			return holder;
		}
		
	} // done!
	
	
	private static void maxEven(String[] num) {
		
		/* 		method maxEven
	 * returns index of biggest even element 
	 * or most right one
	 */
		
		int [] nums = Arrays.stream(num)
		.mapToInt(e -> Integer.parseInt(e))
		.toArray();
		
		int topNum = Integer.MIN_VALUE;
		int topIndex = -1;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] %2 == 0) { // num[i] is even
				if (nums[i] >= topNum) {
				topNum = nums[i];
				topIndex = i;
				}
			}
		}
		if (topIndex > -1) {
			System.out.println(topIndex);
		} else {
			System.out.println("No matches");
		}
		 
	 }
	 
	
	private static void maxOdd(String[] num) {
	
			 /*		method maxOdd
	  * returns index of biggest odd element
	  * or left most one
	  */
	
		int [] nums = Arrays.stream(num)
		.mapToInt(e -> Integer.parseInt(e))
		.toArray();
		
		int topNum = Integer.MIN_VALUE;
		int topIndex = -1;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] %2 != 0) { // num[i] is even
				if (nums[i] >= topNum) {
				topNum = nums[i];
				topIndex = i;
				}
			}
		}
		if (topIndex > -1) {
			System.out.println(topIndex);
		} else {
			System.out.println("No matches");
		}
		 
	 }

	
	private static void minEven(String[] num) {
	
			/*		method minEven
	 * returns index of min even element
	 * or rightmost one
	 */
	
		int [] nums = Arrays.stream(num)
		.mapToInt(e -> Integer.parseInt(e))
		.toArray();
		
		int topNum = Integer.MAX_VALUE;
		int topIndex = -1;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] %2 == 0) { // num[i] is even
				if (nums[i] <= topNum) {
				topNum = nums[i];
				topIndex = i;
				}
			}
		}
		if (topIndex > -1) {
			System.out.println(topIndex);
		} else {
			System.out.println("No matches");
		}
	}
	
	
	private static void minOdd(String[] num) {
		
		/*		method minOdd
	 * returns index of min odd element
	 * or rightmost one
	 */
		
		int [] nums = Arrays.stream(num)
		.mapToInt(e -> Integer.parseInt(e))
		.toArray();
		
		int topNum = Integer.MAX_VALUE;
		int topIndex = -1;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] %2 != 0) { // num[i] is even
				if (nums[i] <= topNum) {
				topNum = nums[i];
				topIndex = i;
				}
			}
		}
		if (topIndex > -1) {
			System.out.println(topIndex);
		} else {
			System.out.println("No matches");
		}
	}
	 
	
	private static void firstEven(String[] num, String token) {
		/* methods it wrong. 
		 * must count elements first and THEN create an arrya
		 *  core principle done
		*/
		int [] nums = Arrays.stream(num)
			.mapToInt(e -> Integer.parseInt(e))
			.toArray();	
		
		int index = Integer.parseInt(token);
		
		int[] result = new int [index];
		int count = 0;
		
		if (index <= nums.length) {
			for (int i = 0; i < num.length; i++) {
				if (nums[i] % 2 == 0) {
					result[count] = nums[i];
					count++;
				}
				if (count >= index) {
					break;
				}
			}
			
			printIArray(result);
	
		} else {
			System.out.println("Invalid count");
		}
		
		
		
	}
	 
	private static void firstOdd(String[] num, String token) {
		int [] nums = Arrays.stream(num)
			.mapToInt(e -> Integer.parseInt(e))
			.toArray();	
		
		int index = Integer.parseInt(token);
		
		int[] result = new int [index];
		int count = 0;
		
		if (index <= nums.length) {
			for (int i = 0; i < num.length; i++) {
				if (nums[i] % 2 != 0) {
					result[count] = nums[i];
					count++;
				}
				if (count >= index) {
					break;
				}
			}
			
			printIArray(result);
	
		} else {
			System.out.println("Invalid count");
		}
		
		
	}
	 
	private static void lastEven(String[] num, String token) {
		int [] nums = Arrays.stream(num)
			.mapToInt(e -> Integer.parseInt(e))
			.toArray();	
		
		int index = Integer.parseInt(token);
		
		int[] result = new int [index];
		int count = 0;
		
		if (index <= nums.length) {
			for (int i = 0; i < num.length; i++) {
				if (nums[num.length - i - 1] % 2 == 0) {
					result[count] = nums[num.length - i - 1];
					count++;
				}
				if (count >= index) {
					break;
				}
			}
			
			printIArray(result);
	
		} else {
			System.out.println("Invalid count");
		}
		
		
		
	}
	
	
	private static void lastOdd(String[] num, String token) {
		int [] nums = Arrays.stream(num)
			.mapToInt(e -> Integer.parseInt(e))
			.toArray();	
		
		int index = Integer.parseInt(token);
		
		int[] result = new int [index];
		int count = 0;
		
		if (index <= nums.length) {
			for (int i = 0; i < num.length; i++) {
				if (nums[num.length - i - 1] % 2 != 0) {
					result[count] = nums[num.length - i - 1];
					count++;
				}
				if (count >= index) {
					break;
				}
			}
			
			printIArray(result);
	
		} else {
			System.out.println("Invalid count");
		}
		
		
		
	}
	 
	private static void printSArray(String[] num) {
		System.out.print("[");
		for (int i = 0; i < num.length; i++) {
			if (i == num.length -1) {
				System.out.print(num[i]);
			} else {
				System.out.print(num[i] + ", ");
			}
		}
		System.out.print("]");
	}
	
	private static void printIArray(int[] num) { // prints int array without zeroes
		
		/*
		 *  BUG - not printing 0 in order not to print empty arrays 
		 * for methods: 1) lastEven/Odd 2) firstEven/Odd
		 */
		System.out.print("[");
		for (int i = 0; i < num.length; i++) {
			if (i == 0) { // if first
				if (num[i] != 0) {
					System.out.print(num[i]);
				}
			} else {
				if (num[i] != 0) {
					System.out.print(", " + num[i] );
				}
			}
		}
		System.out.print("]");
		System.out.println();
	}

}











