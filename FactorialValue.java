
package evedence2;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a integer : ");
        int number=input.nextInt();
        int factorial=1;
        for (int i = number; i >1; i--) {
            factorial=factorial*i;
            
        }
        
        System.out.println("Factorial valu of " + number + " is : " + factorial);
    }
}
