/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minimumnumber;
import java.util.Scanner;

/**
 *
 * @author Acer-User
 */
public class MinimumNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        
        int min = (num1 < num2) ? num1 : num2;
        
        System.out.println("Minimum of " + num1 + " and " + num2 + " is: " + min);
    }
}
