/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prj06;

/**
 *
 * @author rechiee
 */
public class Node {

    char info;
    Node left, right;
    Node next , prev;

    public Node(char info) {
        this.info = info;
        this.left= null;
        this.right= null;
    }
   
}
