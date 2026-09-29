public class tileing {
    public static int tile(int n){
        //base
        if(n == 0 || n ==1){
            return 1;
        }
        return tile(n-1) + tile(n-2);
        /* 
        //kaam
        int fnm1 = tile(n-1);

        int fnm2 = tile(n-2);

        int totalways = fnm1 + fnm2;
        return totalways;
 */
    }
    public static int friendspairing(int n){
        //base 
        
        if(n == 1 || n ==2){
            
            return n;
        }
        return friendspairing(n-1) + (n-1)*friendspairing(n-2);
        /* 
        //choice
        //single
        int fnm1 = friendspairing(n-1);

        //pair
        int fnm2 = friendspairing(n-2);
        int pairways = (n-1)*fnm2;
        //totalways
        int totalways = fnm1 + pairways;
        return totalways;
        */

    }
    public static void occurs(int arr[],int key,int i){
        //basecase
        if(i == arr.length){
            return ;
        } 
        //kaam
        if(arr[i] == key){
            System.out.println(i+" ");
        }
        occurs(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        occurs(arr, key, 0);
        
        System.out.println();
    }
    
}
