public class doublely {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;

        } 
        
    }
    public static Node head;
    public static Node tail;
    public static int size;
    // add 
    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode; 
        head = newNode;
    }
    
    // remove 
    // print
    public static void print(){
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
    public static void main(String[] args) {
        doublely dll = new doublely();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.print();
        System.out.println(dll.size);
        
    }

    
}