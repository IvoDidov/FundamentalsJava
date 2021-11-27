import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// input: 1) DNA length; 2) DNA
		// search for best DNA==longets 1's sequence
		// or leftmost startiing || greatest sum
		// out = best dna index + its sum + dna

		int DNALength = Integer.parseInt(scanner.nextLine());
		String input = scanner.nextLine();

		int DNAIndex = 0;
		int topLength =0;
		int topStart = DNALength;
		int topSum = 0;
		int topIndex = 0;
		int[] topDNA = new int[DNALength];

		while (!input.equals("Clone them!") {
			DNAIndex++;
			int length = 1;
			int sum =0;
			int startIndex = DNALength;

			int[] DNA = Arrays.stream(input.split("!+"))
				.mapToInt(Integer::parseInt)
				.toArray();
			// find length
			for (int i = 0; i < DNALength -1; i++) {
				while (DNA[i] == DNA[i+counter]) {
					length++;
					if (i+length >= DNALength) {
						break;
					}
				}
			}
			//find sum
			for (int element : DNA) {
				sum += element;
			}

				if (length > topLength) {
					topLength = length;
					topStart = i;
					topSum = 0;
					for (int one : DNA) {
						topSum += one;
					}
					topIndex = DNAIndex;

not finished here




