import java.util.*;


public class stacklinkedlist {
    public static void pushatbottam(Stack <Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int top = s.pop();
        pushatbottam(s, data);
        s.push(top);
    }
    public static String reverseString (String str){
        Stack <Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr =s.pop();
            result.append(curr);
            
        }
        return result.toString();

    }

   public static void main(String[] args) {
   String str = "ijollek";
   String  result = reverseString(str);
   System.out.println(result);
   }
}
