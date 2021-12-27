package com.exam;

import java.util.Scanner;

public class Cost_of_driving {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        // collect data from user 
        System.out.print("Enter the driving distance : ");
        double distance=input.nextDouble();
         
        
        System.out.print("Enter miles per gallon : ");
        double milesPerGallon=input.nextDouble();
        System.out.print("Enter price per gallon : ");
        double pricePerGallon=input.nextDouble();
        
        double costOfDriving=(distance/milesPerGallon)*pricePerGallon;
        double costOfDrivingPerKm=((distance/milesPerGallon)*pricePerGallon)/distance;
        System.out.println("The cos of driving is : " +costOfDriving);
        System.out.println("The cos of driving per km : " +costOfDrivingPerKm);
    }
}
