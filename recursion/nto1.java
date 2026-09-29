public class nto1 {
    public static void printdec(int n){
        if(n==1){
            System.err.println(1);
            return;
        }


        System.err.println(n);
        printdec(n-1);
    }
    public static void printinc(int n ){
        if(n==1){
            System.err.println(n+" ");
            return;
        }
        printinc(n-1);
        System.err.print(n+" ");
    }
    public static int fact(int n){
        if (n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n* fact(n-1);
        return fn;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = sum(n-1);
        int sn = n + snm1 ;
        return sn;

    }
    public static int fibo (int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int fn1 = fibo(n-1);
        int fn2 = fibo(n-2);
        int fn = fn1 + fn2 ;
        return fn ;

    }
    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstoccur(int arr[],int i,int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key ){
            return i;

        }
        return firstoccur(arr, i+1, key);

    }
    public static int lastoccur(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        int isfound= lastoccur(arr, i+1, key);
        if(isfound == -1 && arr[i]==key ){
            return i;
        }
        return isfound;
    

    }
    public static int power(int x,int n){
        if(n == 0){
            return 1;
        }
        /*int pnm1 = power(x, n-1);
        int pn = x*pnm1;
        return pn;
        */ 
        return x*power(x, n-1);
    }
    public static int optimizepower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfpower = optimizepower(a, n/2);
        int halfpowersq = halfpower*halfpower;

        if(n%2 != 0){
            halfpowersq = halfpowersq *a;
        }
        return halfpowersq;
    }
    public static void removeduplicates(int idx,String str,StringBuilder newStr,boolean map[]{
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        // kaam
        char 
    })
    public static void main(String[] args) {
        

        System.out.println(optimizepower(3,5));
    }
}