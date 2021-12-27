package com.exam;

import java.util.Scanner;

public class Number_Found_Not_Found {

    public static void main(String[] args) {
        int[] a = {3, 2, 13, 10, 5, 6, 5};
        Scanner input = new Scanner(System.in);
        System.out.println("enter a numbver");
        int number = input.nextInt();
        int count = 0;
        int counts=0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                count++;
                if (count == 1) {
                    System.out.println("found");
                    System.out.print("index of " + number + " is : ");
                }
                System.out.print(i + " ");

            }else{
            counts++;
            }
            

        }
        if(counts==a.length){
            System.out.println("not fund");
        }
        System.out.println("");

    }

}


