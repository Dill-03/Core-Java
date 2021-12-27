
package evedence2;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three integer number : ");
        
        int x=input.nextInt();
        int y=input.nextInt();
        int z=input.nextInt();
        
        
        if(x>y && x>z){
            System.out.println("largest number is : " + x);
        }
        else if(y>x && y>z){
            System.out.println("largest number is : " + y);
        }
        else if(z>y && z>x){
            System.out.println("largest number is : " + z);
        }
    }
}
