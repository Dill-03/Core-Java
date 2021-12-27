package com.exam;

import java.util.Scanner;

public class Leap_year {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // collect data from user
        System.out.println("Enter a year : ");
        int year = input.nextInt();
        
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Is a leap year");
        } else {
            System.out.println(year + " Not a leap year");
        }
    }
}
