
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
        while (p != null) {
            f.writeBytes(p.info.ID + "-" + p.info.name + "-" + p.info.price + "     "); // write data in the node p to the file f
            p = p.next;
        }
        f.writeBytes("\r\n");
    }

    void ftraverseBW(RandomAccessFile f) throws Exception {
        Node p = tail;
        while (p != null) {
            f.writeBytes(p.info.ID + "-" + p.info.name + "-" + p.info.price + "     "); // write data in the node p to the file f
            p = p.pre;
        }
        f.writeBytes("\r\n");
    }

    void loadData(int k) {
        String[] a = Lib.readLineToStrArray("data.txt", k);
        String[] b = Lib.readLineToStrArray("data.txt", k + 1);
        String[] c = Lib.readLineToStrArray("data.txt", k + 2);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(a[i]);
            int y = Integer.parseInt(c[i]);
            addLast(x, b[i], y);
        }
    }

    void addLast(int id, String name, int price) {
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        Phone p = new Phone (id, name, price);
        Node newNode = new Node(p);
        
        if(isEmpty()){
           head = tail = newNode; 
        }else{
            tail.next = newNode;
            newNode.pre= tail;
            tail = newNode;
        }
        size++;
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
    }
    
    void addFirst(int id, String name, int price) {
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        Phone p = new Phone (id, name, price);
        Node newNode = new Node(p);
        
        if(isEmpty()){
           head = tail = newNode; 
        }else{
            newNode.next = head;
            head.pre= newNode;
            head = newNode;
        }
        size++;
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
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
        System.out.println("Enter ID:"); int id = sc.nextInt();
        System.out.print("Enter Name: "); String name = sc.next();
        System.out.print("Enter Price: "); int price = sc.nextInt();
        
        addFirst(id, name, price);
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
        if(head != null && head.next != null && head.next.next != null){
            Node p = head.next.next;
            
            p.pre.next = p.next;
            
            if(p.next != null){
                p.next.pre =p.pre;
            }else{
                tail = p.pre;
            }
            size--;
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        ftraverseFW(f);
        ftraverseBW(f);
        f.close();
    }

    // f4: remove the all Phone 'I'
    void f4() throws Exception {
        clear();
        loadData(0);
        String fname = "f4.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        ftraverseFW(f);
        ftraverseBW(f);
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        Node p = head;
        while (p != null) {
            Node nextNode = p.next; // Lưu đường đi tiếp theo trước khi xóa p

            if (p.info.name.equals("I")) {
                // TH1: Xóa Head
                if (p == head) {
                    head = head.next;
                    if (head != null) head.pre = null;
                    else tail = null; // Nếu list chỉ có 1 phần tử
                } 
                // TH2: Xóa Tail
                else if (p == tail) {
                    tail = tail.pre;
                    tail.next = null;
                } 
                // TH3: Xóa Giữa
                else {
                    p.pre.next = p.next;
                    p.next.pre = p.pre;
                }
                size--;
            }
            p = nextNode; // Đi tiếp
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        ftraverseFW(f);
        ftraverseBW(f);
        f.close();
    }

    // f5: add a new Phone to the possition "before the last node"
    // (only add if the list does not contain the ID of the new Phone).
    // This also means that: 
    // (1) you should check the ID of the new Phone exist in the list or not; 
    // (2) if it does not exist, you write your code to add it to the list.
    void f5() throws Exception {
        clear();
        loadData(0);
        String fname = "f5.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        ftraverseFW(f);
        ftraverseBW(f);
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        Phone newData = new Phone(99, "New", 100); 

// 1. Kiểm tra trùng ID
        boolean exist = false;
        Node check = head;
        while(check != null){
            if(check.info.ID == newData.ID) { exist = true; break; }
            check = check.next;
        }

        // 2. Nếu không trùng và list có ít nhất 1 phần tử
        if(!exist && !isEmpty()){
            Node newNode = new Node(newData);

            // Nếu chỉ có 1 phần tử (Head == Tail) -> Thêm trước Tail = Thêm vào đầu
            if(head == tail) {
                newNode.next = head;
                head.pre = newNode;
                head = newNode;
            } 
            else {
                // Chèn vào giữa [tail.pre] và [tail]
                Node preTail = tail.pre;

                preTail.next = newNode;
                newNode.pre = preTail;

                newNode.next = tail;
                tail.pre = newNode;
            }
            size++;
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        ftraverseFW(f);
        ftraverseBW(f);
        f.close();
    }

    // f6: delete the last node 
    void f6() throws Exception {
        clear();
        loadData(0);
        String fname = "f6.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        ftraverseFW(f);
        ftraverseBW(f);
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        if(head == tail){
            clear();
        }
        else{
            tail= tail.pre;
            tail.next= null;
            size--;
        }
        //------ End your code here-----------------------------------------------------------
        //------------------------------------------------------------------------------------
        ftraverseFW(f);
        ftraverseBW(f);
        f.close();
    }

    // f7: delete the duplicated nodes
    // two nodes are duplicated if their names and prices are the same
    // even if their IDs are different
    void f7() throws Exception {
        clear();
        loadData(0);
        String fname = "f7.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        ftraverseFW(f);
        ftraverseBW(f);
        //------------------------------------------------------------------------------------
        //------ Start your code here---------------------------------------------------------
        Node p = head;
        while (p != null) {
            Node q = p.next;
            while (q != null) {
                Node nextQ = q.next; // Lưu đường đi

                // So sánh Tên và Giá
                if (q.info.name.equals(p.info.name) && q.info.price == p.info.price) {
                    // Logic xóa node q (đang nằm sau p, nên q ko thể là head)

                    // Nếu q là tail
                    if (q == tail) {
                        tail = tail.pre;
                        tail.next = null;
                    } 
                    // Nếu q nằm giữa
                    else {
                        q.pre.next = q.next;
                        q.next.pre = q.pre;
                    }
                    size--;
                }
                q = nextQ;
            }
            p = p.next;
        }
        //------ End your code here-----------------------------------------------------------
        ftraverseFW(f);
        ftraverseBW(f);
        f.close();
    }

}
