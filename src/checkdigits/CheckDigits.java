package checkdigits;

/******************************************************************************
* CheckDigits.java 
* Programmer: @author jcboyd
* Version: 1.0
* Course: SDEV 2210
* This program 
******************************************************************************/

import java.util.*; //Scanner

public class CheckDigits {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Project 9, Check Digits by JC Boyd\n");
        double num1, num2, num3, num4;
        
        System.out.print("Enter first number: ");
        num1 = Double.parseDouble(stdIn.nextLine());
        System.out.print("Enter second number: ");
        num2 = Double.parseDouble(stdIn.nextLine());
        System.out.print("Enter third number: ");
        num3 = Double.parseDouble(stdIn.nextLine());
        System.out.print("Enter fourth number: ");
        num4 = Double.parseDouble(stdIn.nextLine());
    
        System.out.printf("%10s%-7.2f\n%10s%-7.2f\n%10s%-7.2f\n%10s%-7.2f\n", 
                "Total: ", getTotal(num1, num2, num3, num4),
                "Average: ", getAverage(num1, num2, num3, num4),
                "Largest: ", getLargest(num1, num2, num3, num4),
                "Smallest: ", getSmallest(num1, num2, num3, num4));
    } //end main
    
    public static double getTotal(double num1, double num2, double num3, double num4) {
        return num1 + num2 + num3 + num4;
    } //end getTotal
    
    public static double getAverage(double num1, double num2, double num3, double num4) {
        return (num1 + num2 + num3 + num4) / 4;  
    } //end getAverage
    
    public static double getLargest(double num1, double num2, double num3, double num4) {
        double largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num4 > largest) {
            largest = num4;
        }           
        return largest;
    } //end getLargest 
    
      public static double getSmallest(double num1, double num2, double num3, double num4) {
        double smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        if (num4 < smallest) {
            smallest = num4;
        }           
        return smallest;
    } //end getSmallest  
    
} //end class CheckDigits

