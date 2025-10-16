/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj02;

/**
 *
 * @author rechiee
 */
public class MyList {
    private Node head;
    private Node tail;
    private int count =0;

    public MyList() {
    }

    public MyList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }
    
    public boolean isEmpty(){
        return head == null && tail == null;
    }
    
    public void addLast(Student st){
        Node newNode = new Node(st, null);
        if( isEmpty()){
            this.head= newNode;
            this.tail= newNode;
        }else {
            this.tail.next= newNode;
            this.tail= newNode;
        }
        count ++;
    }
    
    public void addFirst(Student st){
        Node newNode= new Node (st, null);
        if( isEmpty()){
            this.head= newNode;
            this.tail= newNode;
        }else {
            newNode.next= head;
            head = newNode;
        }
        count++;
    }
    
    public void removeFirst(){
        if(this.isEmpty()){
            return;
        }
        if( head != null){
            head = head.next;
        }
        if( head == null){
            tail= null;
        }
        count--;
    }   
    public void removeLast(){
        if(this.isEmpty()){
            return;
                
        }
        Node p = head;
            
        if(p.next == null){
            head = null;
            tail = null;
        } else {
            while(p.next.next != null){
                p = p.next;
            }
            p.next = null;
            tail = p;
        } 
        count--;
        
    }
    
    public void remove(int v){
        if(this.isEmpty()){
            return;
        }
        if(v == 0){
            removeFirst();
            return;
        }
        
        Node p = head;
        for( int i=0 ; i< v-1 ;i++){
            if(p != null){
                p =p.next;
            }
        }
        
        if( p != null){
            p.next= p.next.next;
            if(p.next == null){
                tail =p;
            }
        }
        count--;
    }
    
    public void treverse(){
        Node temp = head;
        while ( temp != null){
            System.out.println(temp.getInfo());
            temp = temp.next;
        }
    }
    
    public int size(){
        return count;
    }
    
    public void add(Student st, int position){
        
    }
    
    public int countPass(){
        return 0;
    }
    
    public int find(String studentId){
        return -1;
    }
}
