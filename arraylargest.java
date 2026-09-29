import java.util.*;

public class arraylargest {
    public static int get_largest(int numbers[]){
        int get_largest = Integer.MIN_VALUE ;
        int get_smallest = Integer.MAX_VALUE ;
        for(int i =0;i<numbers.length ;i++){
            if (get_largest < numbers[i]){
                get_largest = numbers[i];
            }
            if (get_smallest > numbers[i]){
                get_smallest = numbers[i];
            }

        }
        System.out.println("Smallest number is: " + get_smallest);  
        return get_largest; 

    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5};
        System.out.println("Largest number is: " + get_largest(numbers));
    }

    
}
