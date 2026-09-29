import java.util.*;
public class twoqueue {
    static class Stack{
        Queue <Integer> q1 = new LinkedList<>();
        Queue <Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else {
                q2.add(data);
            }
        }

        public static int pop(){
            
        }
    }

}