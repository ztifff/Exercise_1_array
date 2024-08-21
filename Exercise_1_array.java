package exercise;

import java.util.Scanner;

public class Exercise_1_array {
	private Scanner scanner = new Scanner(System.in);
	private String input;
	private int[] vowelcount = new int[5];
	private int consonantcount;

	public static void main(String[] args) {
		Exercise_1_array obj = new Exercise_1_array();
		obj.string();
		obj.vowels();
		obj.consonant();
		obj.output();
		
	}
	public void string() {
		while(true) {
		System.out.print("Enter a string:(maximum 20): ");
		input = scanner.next();
		if (input.length() > 20 ) {
			System.out.print("Your input exceeded 20 characters: ");
		} else {
			break;
		}
		}
		
	}
	public void vowels() {
		for (char v : input.toCharArray()) {
            switch (v) {
                case 'a':
                	vowelcount[0]++;
                    break;
                case 'e':
                	vowelcount[1]++;
                    break;
                case 'i':
                	vowelcount[2]++;
                    break;
                case 'o':
                	vowelcount[3]++;
                    break;
                case 'u':
                	vowelcount[4]++;
                    break;
            }
        }
	}
	public void consonant() {
		consonantcount = 0;
		for (char c: input.toCharArray()) {
			if (c >= 'a' && c <= 'z' && "aeiou".indexOf(c)==-1) {
				consonantcount++;
			}
			
		}
	}
	public void output() {
		System.out.println("\nVowel Counts:");
		System.out.println("a: " + vowelcount[0]);
		System.out.println("e: " + vowelcount[1]);
		System.out.println("i: " + vowelcount[2]);
		System.out.println("o: " + vowelcount[3]);
		System.out.println("u: " + vowelcount[4]);
		System.out.println("\nTotal Consonant: " + consonantcount);
	}
}
