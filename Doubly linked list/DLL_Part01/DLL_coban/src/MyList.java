
import java.util.*;
import java.io.*;

public class MyList {

    Node head, tail;
    int size;

    MyList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    void ftraverseFW(RandomAccessFile f) throws Exception {
        Node p = head;
        f.writeBytes( "head -> tail     "); // write data in the node p to the file f

        while (p != null) {
            f.writeBytes(p.info + "     "); // write data in the node p to the file f
            p = p.next;
        }
        f.writeBytes("\r\n");
    }

    void ftraverseBW(RandomAccessFile f) throws Exception {
        Node p = tail;
        f.writeBytes( "tail -> head     ");
        while (p != null) {
            f.writeBytes(p.info + "     "); // write data in the node p to the file f
            p = p.pre;
        }
        f.writeBytes("\r\n");
    }

    void loadData(int k) {
        String[] a = Lib.readLineToStrArray("data.txt", k);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(a[i]);
            addLast(x);
        }
    }

    void addLast(int k) {
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        Node newNode = new Node(k);
        
        if(isEmpty()){
            head= tail= newNode;
            
        }else{
            tail.next= newNode;
            newNode.pre=tail;
            tail=newNode;
        }
        size++;
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
    }
    
    void addFirst(int k){
        Node newNode = new Node(k);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            newNode.next= head;
            head.pre= newNode;
            head= newNode;
        }
        size++;
    }

    // f1: ham nay se goi ham addLast nhieu lan
    void f1() throws Exception {
        clear();
        loadData(0);
        String fname = "f1.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        ftraverseFW(f);
        ftraverseBW(f);
        f.close();
    }

    // f2: ham addFirst ==> du lieu nhap tu ban phim
    void f2() throws Exception {
        clear();
        loadData(0);
        String fname = "f2.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        ftraverseFW(f);
        ftraverseBW(f);
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so muon: ");
        int n = sc.nextInt();
        
        addFirst(n);
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        ftraverseFW(f);
        ftraverseBW(f);
        f.close();
    }

    // f3: ham deleteThirdNode ==> xoa node thu ba cua list
    void f3() throws Exception {
        clear();
        loadData(0);
        String fname = "f3.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        ftraverseFW(f);
        ftraverseBW(f);
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        if (head != null && head.next != null && head.next.next != null) {

            Node p = head.next.next; // Đây là Node thứ 3

            // Bước 1: Nối thằng trước p với thằng sau p
            // Vì là node thứ 3 nên chắc chắn có node thứ 2 (p.pre)
            p.pre.next = p.next;

            // Bước 2: Nối thằng sau p về thằng trước p
            // Cần kiểm tra xem p có phải là Tail không?
            if (p.next != null) {
                p.next.pre = p.pre;
            } else {
                // Nếu p là Tail (Node cuối cùng), thì Tail mới là node thứ 2
                tail = p.pre;
            }

            size--; // Giảm size
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        ftraverseFW(f);
        ftraverseBW(f);
        f.close();
    }


}
