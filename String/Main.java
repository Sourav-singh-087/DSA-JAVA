import java.util.*;

public class Main {

    public static boolean isPalindrome(String str) {
        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String furits[] ={"apple","banana","mango"} ;

        String largest = furits[0];
        for(int i=1;i<furits.length;i++){

            if(largest.compareTo(furits[i])<0){
                largest = furits[i];
            }
        }


        System.out.println(largest);
    }
}