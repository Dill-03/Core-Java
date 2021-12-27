package evedence2;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a integer : ");
        int number = input.nextInt();

        int count = 0;
        for (int i =2; i <=number; i++) {
            if(number%i==0){
            count++;
            }
        }
        
        if(count>=2){
            System.out.println("is not prime number.");
        }else{
            System.out.println("is a prime number.");
        }

    }

}
