
import java.util.*;
import java.io.*;

public class MyList {

    Node head;

    MyList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void clear() {
        this.head = null;
    }

    void ftraverse(RandomAccessFile f) throws Exception {
        Node p = head;
        while (p != null) {
            f.writeBytes(p.info + " "); // write data in the node p to the file f
            p = p.next;
        }

        f.writeBytes("\r\n");

    }

    void loadData(int k) {
        String[] a = Lib.readLineToStrArray("data.txt", k);
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(a[i]);
            addLast(number);
        }
    }

    void addLastRec(int n, Node t) {
        if (t.next == null)
            t.next = new Node(n);
        else 
            addLastRec(n, t.next);
    }

    void addLast(int n) {
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        if (isEmpty())
            head = new Node(n);
        else
            addLastRec(n, head);
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
    }

    void f1() throws Exception {
        clear();
        loadData(0);
        String fname = "f1.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        ftraverse(f);
        f.close();
    }

    int sumFor() {
        int s = 0;
        for (Node t = head; t != null; t = t.next) {
            s += t.info;
        }
        return s;
    }

    int sumWhile() {
        int s = 0;
        Node t = head;
        while (t != null) {
            s += t.info;
            t = t.next;
        }
        return s;
    }

    int sumRec(Node t) {
        if (t == null)
            return 0;
        return t.info + sumRec(t.next);
    }

    // f2: Tinh tong cac gia tri trong list
    void f2() throws Exception {
        clear();
        loadData(0);
        String fname = "f2.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");

        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        int sF = sumFor();
        f.writeBytes("Sum with For Loop:   " + sF + "\n");
        int sW = sumWhile();
        f.writeBytes("Sum with While Loop:   " + sW + "\n");
        int sR = sumRec(head);
        f.writeBytes("Sum with Recursion:   " + sR + "\n");

        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        ftraverse(f);
        f.close();
    }

    // f3: dem so luong node co trong list
    // thuc hien bang 3 cach khac nhau: for, while, recursion
    // trinh bay tuong tu bai f2
    void f3() throws Exception {
        clear();
        loadData(0);
        String fname = "f3.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");

        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        
        
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        ftraverse(f);
        f.close();
    }

    // f4: tim gia tri lon nhat trong list
    // thuc hien bang 3 cach khac nhau: for, while, recursion
    // trinh bay tuong tu bai f2
    void f4() throws Exception {
        clear();
        loadData(0);
        String fname = "f4.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");

        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        
        
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        ftraverse(f);
        f.close();
    }

    void printRec1(RandomAccessFile f, Node t) throws Exception {
        // code here:

        // end your code here
    }

    void printRec2(RandomAccessFile f, Node t) throws Exception {
        // code here:

        // end your code here		
    }

    // f5: hoan thanh cac ham printRec1() va printRec2() 
    // de xuat cac gia tri trong list theo thu tu tu truoc ra sau,
    // va sau do tu sau ra truoc
    void f5() throws Exception {
        clear();
        loadData(0);
        String fname = "f5.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        f.writeBytes("Tu truoc ra sau:\r\n");
        printRec1(f, head);
        f.writeBytes("\n\nTu sau ra truoc:\r\n");
        f.writeBytes("\r\n");
        printRec2(f, head);
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------

        f.close();
    }

    // f6: dem so luong node > 5
    // thuc hien bang 3 cach khac nhau: for, while, recursion
    // trinh bay tuong tu bai f2
    void f6() throws Exception {
        clear();
        loadData(0);
        String fname = "f6.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");

        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        
        
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        ftraverse(f);
        f.close();
    }

    // f7: xoa tat ca cac node > 5
    // thuc hien bang 3 cach khac nhau: for, while, recursion
    // trinh bay tuong tu bai f2
    void f7() throws Exception {
        clear();
        loadData(0);
        String fname = "f7.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");

        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        
        
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        ftraverse(f);
        f.close();
    }

}
