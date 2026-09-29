package recursion;

public class ntoone {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){
        if(n==0) return;
        System.err.println(n);
        print(n-1);
        return;

        
    }
    
    
}
