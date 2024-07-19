package org.example;

// import java.util.Scanner;

public class AddCalc {
    public float AddCalculate() {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // float x = scanner.nextFloat(); 
        // float y = scanner.nextFloat();    
        float x = 2.0f; 
        float y = 3.5f;    
        float AddSum = x + y;

        // scanner.close();

        return AddSum;
    }

    public static void main(String[] args) {
        System.out.println(new AddCalc().AddCalculate());
    }
}