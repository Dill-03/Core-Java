package com.exam;

import java.util.Scanner;

public class Convert_mile_to_Km {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter distaince in kilometer : ");
    double km=input.nextDouble();
    
    double mile=km*1.61;
        System.out.println(km + " Kilomiter = " + mile + " miles");  
    }
    
}
