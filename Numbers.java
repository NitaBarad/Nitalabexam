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
        
        int largest = num1;
        
        if (num2 > largest) {
            largest = num2;
        }
        
        if (num3 > largest) {
            largest = num3;
        }
        
        int sum = largest;
        
        System.out.println("The sum of the largest number is: " + sum);
    }
}