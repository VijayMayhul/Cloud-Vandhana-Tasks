package com.CloudVandanaTask;

import java.util.*;

public class NumToRomNum {
	public static int changeRomNum(String s) {
		int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int value;

            switch (currentChar) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    System.err.println("Invalid Roman numeral character: " + currentChar);
                    return -1;
            }

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Roman numeral: ");
        String romanNumeral = sc.nextLine();
        int result = changeRomNum(romanNumeral);
        System.out.println("Integer representation: " + result);
	}

}
