import java.util.Scanner;

public class pow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base :");
        int a = sc.nextInt();
        System.out.print("Enter the exponent :");
        int b = sc.nextInt();
        System.out.println(a+ " rasied to the power "+b+ " is "+pows(a, b));


    }
    public static int pows(int a, int b){
        if(b==0) return 1;
        return a*pows(a,b-1);
    }

}