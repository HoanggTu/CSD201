/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj03;

/**
 *
 * @author rechiee
 */
public class Main {
    public static void main(String[] args) {
        MyDoubleLinkedList list1 = new MyDoubleLinkedList();
        list1.addlast(new Student("00x", "Tung", 9.8));
        for ( int i =0; i<10;i++){
            list1.addLast(new Student("00" + i, "Nguyen Van " + i, i));
        }
        
        
    }
   
}
