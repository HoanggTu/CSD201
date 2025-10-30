/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj03;

/**
 *
 * @author rechiee
 */
public class MyDoubleLinkedList2 {
    private Node head;
    private Node tail;
    private int count = 0;

    public MyDoubleLinkedList2() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }
    
    public boolean isEmpty(){
        return head == null && tail == null;
    }
    
    public void addLast(Student st){
        Node newNode = new  Node(st, null);
        if(isEmpty()){
            this.head= newNode;
            this.tail= newNode;
        }else{
            this.tail.next= newNode;
            newNode.prev=newNode;
            
            this.tail = newNode;
        }
        count++;
    }
    
    public void addFrist(){
        if(this.isEmpty()){
            return;
        }else{
            new
            
            
        }
    }
    
     

    
    
    
    
}
