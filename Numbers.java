package p1;

import java.util.Scanner;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the First number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the Second number: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter the Third number: ");
        int num3 = input.nextInt();
        
        int avg = (num1+num2+num3)/3;
        
        
        System.out.println("The average  is: " + avg);
    }
}