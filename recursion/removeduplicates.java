import java.util.*;

public class removeduplicates{
    public static void remove(String str,StringBuilder sb,boolean map[],int idx){
        //base
        if(idx == str.length()){
            System.out.println(sb);
            return ;
        }
        char curr = str.charAt(idx);
        if(map[curr-'a'] == true){
            remove(str, sb, map, idx+1);
        }
        else{
            map[curr-'a'] = true;
            remove(str, sb.append(curr), map, idx+1);
        }

    }
    public static void main(String args[]){
        String str = "appnacollage";
        remove(str,new StringBuilder("") , new boolean[26], 0);

    }
}