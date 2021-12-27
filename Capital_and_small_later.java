package com.exam;

import java.util.Scanner;

public class Capital_and_small_later {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a charecter : ");
        char ch = input.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is a small later");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(" It is a capital later");
        } else {
            System.out.println("Not a charecter");
        }
    }

}
