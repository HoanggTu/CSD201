package prj02;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rechiee
 */
public class Ex_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        for (int i=0; i< 10; i++){
            list.add(i);
        
        }
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        
    }
}
