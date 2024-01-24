/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        do{
            System.out.println("Enter the numerator and denominator in order: ");
            int numerator = input.nextInt();
            int denominator = input.nextInt();    
            try{            
            System.out.print(quotient(numerator, denominator));
            flag = false;
            }
            catch(ArithmeticException e)
            {
                System.out.printf("Zero is invalid denominator. Try again. \n");
            }
        } while (flag);
    }
    public static int quotient(int a, int b){
        return (a / b);
    }
}

