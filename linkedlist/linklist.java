import java.util.LinkedList;

public class linklist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;

        head = newNode;

    }
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail =  newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;

        }
        Node temp = head;
        
        while (temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println( );
    }
    public void add(int idx,int data){
        if(idx == 0){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;


    }
    public int removefirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;

        }else if(size == 1){
            int val =head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int itrsearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;

    }
    public void NthNode (int n){
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        // base
        if(n == sz){
            head = head.next;
            return;
        }
        //sz-n
        int i=1;
        int itofind = sz-n;
        Node prev = head;
        while(i<itofind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;


    }
    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow;
    }
    public boolean checkpalindrome (){
        //base 
        if(head == null || head.next == null ){
            return true;
        }
        //midhalf
        Node midNode = findmid(head);

        //mid reverse
        Node curr = midNode;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // 1st hlf == 2nd hlf
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static boolean checkcycle (){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;

    }
    public static void removecycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = true;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle =true;
                break;
            }
            
        }
        if(cycle == false){
            return ;
            }

        //find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;

        }
        //remove cycle
        prev.next = null;


    }
    public void zigzag (){
        // mid node 
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        Node mid = slow;

        // reverse
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null ){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node left = head;
        Node right = prev;
        Node nextR ,nextL;

        // alt merging
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            right = nextR;
            left = nextL;

        }
    }


    public static void main(String[] args) {
        linklist ll = new linklist();
        ll.addlast(1); 
        ll.addlast(2); 
        ll.addlast(3); 
        ll.addlast(4); 
        ll.addlast(5);
        ll.addlast(6); 

        ll.print();
        ll.zigzag();
        ll.print();
    }
}