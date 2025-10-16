/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj01;

/**
 *
 * @author rechiee
 */
public class MyList2 {
    private Node head; 
    private Node tail;

    public MyList2() {
    }

    public MyList2(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }
    
    public boolean isEmpty(){
        return head == null && tail == null;
    }
    
    public void add(Student st){
        if(st != null && st.getGpa() >= 5){
            Node newNode = new Node (st , null);
            if( isEmpty()){
                this.head = newNode;
                this.tail = newNode;
            }else {
                this.tail.next=newNode;
                this.tail= newNode;
            }
        }
    }
    public void treverse(){
        Node temp =head ;
        while(temp != null){
            System.out.println(temp.getInfo());
            temp = temp.next;
        }    
    }
    
}
