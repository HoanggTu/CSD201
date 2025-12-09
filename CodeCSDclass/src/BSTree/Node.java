/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BSTree;

/**
 *
 * @author rechiee
 */
public class Node {
    private int info;
    private Node left, right;

    public Node() {
    }

    public Node(int info, Node left, Node right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }
    
    
    
    Node(int x){
        this(x, null,null);
    }
}
