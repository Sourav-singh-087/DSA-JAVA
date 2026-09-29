import java.util.*;

public class arraybinary {
    public static int linearSearch (int number[], int key){
        for( int i=0 ;i<number.length ;i++){
            if (number[i]== key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int number[] = {2,5,8,12,43,67};
        int key = 6;

        int index =linearSearch(number, key);
        if (index == -1){
            System.out.println("Key not found");
        }
        else {
            System.out.println("Key found at index: " + index);
        }

       
    }
}
