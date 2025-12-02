/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dll;

/**
 *
 * @author rechiee
 */
public class Node {
    Phone info;
    Node next;
    Node pre;

    public Node() {
    }

    public Node(Phone info, Node next, Node pre) {
        this.info = info;
        this.next = next;
        this.pre = pre;
    }
    Node (Phone x){
        this(x, null, null);
    }
    
    
}
