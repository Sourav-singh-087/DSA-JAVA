import java.util.*;
public class merge{
    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge1(arr,si,ei,mid);

    }
    public static void merge1(int arr[],int si,int ei,int mid){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k =0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]  = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(k =0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];

        }


    }

    public static void main(String []args){
        int arr[] = {6,3,5,1,4,2,-2,-4,43,21,56,78,54,33};
        mergesort(arr, 0, arr.length-1);
        printArr(arr);

    }

}