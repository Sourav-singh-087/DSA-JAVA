import java.util.*  ;
public class binarysearch{
    public static int binarysearchs(int numbers[], int key){
        int start = 0, end = numbers.length -1;
        while(start <=end){
            int mid = (start + end)/2;
            if (numbers[mid] == key){
                return mid;
            }
            else if (numbers[mid] < key){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main (String args[]){
        int numbers[]= {2,5,8,12,43,67};
        int key = 67;
        System.out.println("Index for key " + key + " is: " + binarysearchs(numbers, key));
    }
}
