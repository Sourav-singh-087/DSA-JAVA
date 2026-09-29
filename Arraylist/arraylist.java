package Arraylist;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

         ArrayList<Integer>list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // list.remove(2);

        // int element = list.get(3);

        // list.set(2,10);
        for(int i = 0; i<list.size();i++){
            System.out.print(list.get(i));
        }
        

    

        System.err.println(list.size());
        
    }
    
    
}
