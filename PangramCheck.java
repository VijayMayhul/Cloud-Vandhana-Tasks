package com.CloudVandanaTask;

import java.util.Scanner;

public class PangramCheck {
		public static void pangramTest(String s)
		{
			boolean[] letters = new boolean[26];
	        String sentence = s.toLowerCase();

	        for (int i = 0; i < sentence.length(); i++) {
	            char c = sentence.charAt(i);
	            if (c >= 'a' && c <= 'z') {
	                letters[c - 'a'] = true;
	            }
	        }

	        boolean isPangram = true;
	        for (boolean letter : letters) {
	            if (!letter) {
	                isPangram = false;
	                break;
	            }
	        }

	        if (isPangram) {
	            System.out.println("The sentence is a pangram!");
	        } else {
	            System.out.println("The sentence is not a pangram.");
	        }
		}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        pangramTest(sentence);
        scanner.close();
	}

}
