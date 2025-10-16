/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj01;

/**
 *
 * @author rechiee
 */
public class MyList {
    private Node head;
    private Node tail;

    public MyList() {
    }
    
    

    public MyList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }
    
    public boolean isEmpty(){
        return head == null && tail == null;
    }
    
    public void add( Student st){
        Node newNode = new Node (st, null);
        if(isEmpty()){
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.next = newNode;
            this.tail= newNode;
        }
    }
    
    public void treverse(){
        Node temp= head;
        while (temp!=null){
            System.out.println(temp.getInfo());
            temp = temp.next;
        }
    }
    
}
