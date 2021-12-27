package com.exam;

import java.util.Scanner;

public class findSpacificCharacter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a articals : ");
        String s = input.nextLine();

        System.out.println("Position of 'a' are: ");
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal count  : " + count + " times");

    }
}
