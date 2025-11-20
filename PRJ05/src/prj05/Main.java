/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prj05;

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
        MyQueue queue = new MyQueue();

        // tạo một vài sinh viên
        Student s1 = new Student("S01", "Nguyen Van A", 6.5);
        Student s2 = new Student("S02", "Tran Thi B", 7.8);
        Student s3 = new Student("S03", "Le Van C", 4.9);

        // test enqueue
        System.out.println(">>> enqueue students vào queue:");
        queue.enqueue(s1);
        queue.enqueue(s2);
        queue.enqueue(s3);

        // test front
        System.out.println("\n>>> phần tử trên cùng (front):");
        System.out.println(queue.front());

        // test dequeue
        //        System.out.println("\n>>> dequeue students ra khỏi queue:");
        //        while (!queue.isEmpty()) {
        //            Student st = queue.dequeue();
        //            System.out.println("dequeue: " + st);
        //        }
        System.out.println("Size: " + queue.size());
        System.out.println("\n>>> dequeue students ra khỏi queue:");
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("Size: " + queue.size());      
        
        queue.clear();

        // test queue rỗng
        System.out.println("\n>>> thử dequeue khi queue rỗng:");
        System.out.println(queue.dequeue()); // sẽ ra null
    }
    
}
