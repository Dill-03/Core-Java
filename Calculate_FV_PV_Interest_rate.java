
package com.exam;


public class Calculate_FV_PV_Interest_rate {
     public static void main(String[] args) {
        String x = "10";
        String y = "20";
        int p = Integer.parseInt(x); //converting string to intger
        int q = Integer.parseInt(y);  //converting string to intger

        System.out.println(x + y);
        System.out.println("Sumation of P and Q = " + (p + q));

        String x1 = "10.5";
        String y1 = "20.5";
        double f = Double.parseDouble(x1); //converting string to double
        double m = Double.parseDouble(y1);  //converting string to double
        System.out.println(f + m);
        System.out.println("Sumation of P and Q = " + (f + m));

        
        //calculaiton of future value of a certain amount in local bangk 
        double capital = 1000000;
        double r = .08447177119769855;
        double n = 5;
        double future_value = Math.round(capital * Math.pow(1 + r,n));
        System.out.println("future value : " + future_value);
        
        // Find the interst rate 
        double future_value1 = 1500000;
        double Present_value = 1000000;
        double n1 = 5;
        double rate = (Math.pow(future_value1/Present_value,1/n1)-1);
        System.out.println("Interest rate is : " +rate);
    }
}
