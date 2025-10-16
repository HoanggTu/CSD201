/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj01;

/**
 *
 * @author rechiee
 */
public class Main {
    public static void main(String[] args) {
        MyList list1 = new MyList();
        list1.add(new Student("00x", "Tu", 9.7));
        for (int i=0; i< 100;i++){
            list1.add(new Student("00"+i, "Tu"+i, i));
        }
        
        list1.treverse();
        
        MyList2 list2 = new MyList2();
        list2.add(new Student("01", "Le Nhat Tung", 9.9));
        list2.add(new Student("02", "Nguyen Van A", 4));
        list2.add(new Student("03", "Gia dinh HAHA", 8));
        list2.treverse();
    }
}
