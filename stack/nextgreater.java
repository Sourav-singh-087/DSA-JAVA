import java.util.*;

public class nextgreater {

    public static void main(String[] args) {

        int arr[] = {9, 4, 0, 3, 8};

        Stack<Integer> s = new Stack<>();
        int nxtgreater[] = new int[arr.length];

        // loop from right to left
        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nxtgreater[i] = -1;
            } else {
                nxtgreater[i] = arr[s.peek()];
            }

            s.push(i);
        }

        // printing answer
        for (int i = 0; i < nxtgreater.length; i++) {
            System.out.print(nxtgreater[i] + " ");
        }

        System.out.println();
    }
}