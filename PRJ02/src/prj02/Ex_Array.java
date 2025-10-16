/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj02;

/**
 *
 * @author rechiee
 */
public class Ex_Array {
    public static void main(String[] args) {
        int a[]= new int[100];
        for (int i=0; i< a.length; i++){
            a[i]=i;
        }
        for (int value : a){
            System.out.println(value +" ");
        }
    }
}
