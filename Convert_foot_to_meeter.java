package com.exam;

import java.util.Scanner;

public class Convert_foot_to_meeter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value in foot : ");
        double foot = input.nextDouble();
        
        // separate integer part from foot
        int intPart=(int)foot;
        //separate decimale part from food
        double decPart=(foot-intPart)*10;
  
        //conver foot to meter
        double intMeter = intPart / 3.28;
        double decMeter=decPart/39.37;
        
        double meter=intMeter+decMeter;
        System.out.println(foot + " foot = " + meter + " meter");
    }
}
