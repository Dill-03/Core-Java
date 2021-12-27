package com.exam;

import java.util.Scanner;

public class BMI_calculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in inches : ");
        int heghit = input.nextInt();
        System.out.print("Enter your weight in kilogram : ");
        int weight = input.nextInt();
        
        //Disply result
        double bmi = weight / (heghit * heghit * .0254 * .0254);
        System.out.println("BMI : " +Math.round(bmi));
        if (bmi < 18.5) {
            System.out.println("Underweihgt");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
