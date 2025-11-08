/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prj04;

/**
 *
 * @author rechiee
 */
public class MyStack {

    /**
     * @param args the command line arguments
     */
    Node top;
    int count = 0;
    
    public MyStack(){
        top = null;
        count =0;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public void push ( Student st){
        Node newNode= new Node ( st, top);
        top = newNode;
        count++;
    }
    
    public Student pop(){
        if(isEmpty()){
            return null;
        }
        Student temp = top.getInfo();
        top = top.getNext();
        
        count--;
        return temp;
    }
    
    public Student peek(){
        if(isEmpty()){
            return null;
        }
        Student temp = top.getInfo();
        
        return temp ;
    }
    // size
    //    public int size(){
    //        int count = 0;
    //        Node temp = top;
    //        while(temp!=null){
    //            count++;
    //            temp=temp.getNext();
    //        }
    //        return count;
    //    }
    
    public int size(){
        return count ;
    }
    
    public void clear(){
        top=null;
        count =0;
    }
}
