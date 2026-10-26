import java.util.*;

public class firstoccurence{
    public static int first(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return first(arr, key, i+1);

    }
    public static int lastoccur(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = lastoccur(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;

    }
    public static void main(String args[]){
        int arr[] = {3,4,5,6,78,5,32,5,6,9,0};
        System.out.println(first(arr,6,0));
        System.out.println(lastoccur(arr, 6, 0));
        

    }
}