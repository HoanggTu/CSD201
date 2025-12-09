/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursiondemo;

/**
 *
 * @author rechiee
 */
public class Main {
    public static void main(String[] args) {
        Processsor processor = new Processsor();
        int number = 5;
        
        // Tính và in giai thừa
        long factorial = processor.getFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);

        // print Fibonacci series up to n
        processor.printFibonacciSeries(number);
    }
}
