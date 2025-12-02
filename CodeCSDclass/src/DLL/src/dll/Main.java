/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dll;
import java.io.*;
import java.util.*;

/**
 *
 * @author rechiee
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyList t = new MyList(); 
        
        Scanner sca = new Scanner(System.in);
        int choice = sca.nextInt();
        sca.nextLine();
        
        switch(choice) {
            case 0:
                return;
            case 1: 
                t.f1();
                System.out.println("Your output:");
                Lib.viewFile("f1.txt");
                break;
            case 2: 
                t.f2();
                System.out.println("Your output:");
                Lib.viewFile("f2.txt");
                break;
            case 3: 
                t.f3();
                System.out.println("Your output:");
                Lib.viewFile("f3.txt");
                break;
            case 4: 
                t.f4();
                System.out.println("Your output:");
                Lib.viewFile("f4.txt");
                break;
			case 5: 
                t.f5();
                System.out.println("Your output:");
                Lib.viewFile("f5.txt");
                break;
           
            default: 
                System.out.println("Invalid choice");
        }
        
        System.out.println();
    
    }
    private static void printMenu() {
        System.out.println("=============MENU=============");
        System.out.println("1. Test f1 ");
        System.out.println("2. Test f2 ");
        System.out.println("3. Test f3 ");
        System.out.println("4. Test f4 ");
	System.out.println("5. Test f5 ");
        System.out.println("0. Exit");
        System.out.println("==============================");
        System.out.print("Enter your choice [0 --> 5]: ");
    }
    
}
