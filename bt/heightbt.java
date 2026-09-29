import java.util.*;
public class heightbt {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    public static int height (Node root){
        //base case
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;

    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        return leftcount + rightcount + 1;

    }
    public static int sum (Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);

        return leftsum + rightsum + root.data;
    }
    public static boolean isIdentical(Node node ,Node subroot){
        if(node == null && subroot == null){
            return true;
        }else if(node == null || subroot == null || node.data!= subroot.data){
            return false;
        }
        if(!isIdentical(node.left, subroot.left)){
            return false;
        }
        if(!isIdentical(node.right, subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root ,Node subroot){
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical (root,subroot)){
                return true;
            }

        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);

    }
    public static void klevel(Node root,int level,int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data+" ");
            return;
        }
        klevel(root.left, level+1, k);
        klevel(root.right, level+1, k);
    }
    public static Node lca2(Node root,int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);
        
        if(rightlca == null){
            return leftlca;
        }
        if (leftlca == null) {
            return rightlca;
            
        }
        return root;
    }
    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int rightdist = lcaDist(root.right, n);
        int leftdist = lcaDist(root.left, n);

        if(rightdist == -1 && leftdist == -1){
            return -1;
        }else if(leftdist == -1){
            return rightdist +1;
        }else {
            return leftdist+1;
        }

    }
    public static int mindist (Node root , int n1,int n2){
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(root, n1);
        int dist2 = lcaDist(root, n2);
        return dist1 + dist2;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
       

       int n1 =6;
       int n2 =3;
       System.out.print(mindist(root, n1, n2));
      
    }
    
}
