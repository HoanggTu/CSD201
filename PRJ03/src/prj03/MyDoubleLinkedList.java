/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prj03;

import jdk.nashorn.internal.objects.annotations.SpecializedFunction;
/**
 *
 * @author rechiee
 */
public class MyDoubleLinkedList {

    /**
     * @param args the command line arguments
     */
    private Node head ;
    private Node tail ;
    private int count ;

    public MyDoubleLinkedList() {
    }

    public MyDoubleLinkedList(Node head, Node tail, int count) {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public void addLast(Student st){
        Node newNode= new Node (st, null);
        if(isEmpty() ){
            head =tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        count++;    
    }
    
    public void addfirst(Student st){
        Node newNode = new Node(st, null);
        if(isEmpty() ){
            head = tail = newNode;
        }else{
            newNode.next= head;
            head.prev =newNode;
            head =newNode;
        }
        count++;
    }
    
    public void removeFirst(){
        if(isEmpty())return;
        
        head = head.next;
        if(head != null) {
            head.prev = null;
        }else {
            tail = null;
        
        }
        count--;
    }
    public void removeLast() {
        if(isEmpty()) return ;
        
        if( head == tail ) {
            head = tail = null;
        }else {
            tail = tail.prev;
            tail.next = null;
        }
        count --;
    }
    
    public void remove( int index){
        if( index < 0 || index >= count ) return ;
        
        if( index ==0 ){
            removeFirst();
            return;
        }
        if(index == count -1 ){
            removeLast();
            return;
        }
        
        Node current = head;
        for ( int i =0; i< index ;i++){
            current = current.next;
        }
        
        current.prev.next= current.next;
        current.next.prev= current.prev;
        
        count--;
    }
    
    public void traverse(){
        for (Node temp = head ; temp != null ; temp = temp.next){
            System.out.printl(temp.getInfo());
        }
    }
    
    public void traverseReverse(){
        for (Node temp = tail; temp != null; temp = temp.prev){
            System.out.printl(temp.getInfo());

        }
    }
    
    public int size(){
        return count;
    }
    
    public void add(Student st, int position) {
        if (position < 0 || position > count) return;

        if (position == 0) {
            addFirst(st);
        } else if (position == count) {
            addLast(st);
        } else {
            Node newNode = new Node(st, null);
            Node current = head;
            for (int i = 0; i < position; i++) {
                current = current.next;
            }
            Node prev = current.prev;

            newNode.next = current;
            newNode.prev = prev;
            prev.next = newNode;
            current.prev = newNode;

            count++;
        }
    }

    public int countPass() {
        int passCount = 0;
        for (Node temp = head; temp != null; temp = temp.next) {
            if (temp.getInfo().getGpa() >= 5) {
                passCount++;
            }
        }
        return passCount;
    }

    public int find(String studentId) {
        int index = 0;
        for (Node temp = head; temp != null; temp = temp.next, index++) {
            if (temp.getInfo().getId().equals(studentId)) {
                return index;
            }
        }
        return -1;
    }
    
    
    
    
}
