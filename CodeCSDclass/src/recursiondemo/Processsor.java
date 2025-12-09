/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursiondemo;

/**
 *
 * @author rechiee
 */
public class Processsor {
    
    // Hàm tính giai thừa đệ quy
    public long getFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return getFactorial(number - 1) * number;
        }
    }

    // Hàm tính số Fibonacci thứ n đệ quy
    public int getFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }

    // Hàm in ra dãy Fibonacci
    public void printFibonacciSeries(int number) {
        System.out.print("Fibonacci Series up to " + number + " is: ");
        for (int i = 0; i < number; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
    }
}