import java.util.*;

public class polymorphism{
    public static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println(cal.sum(3,4));
        System.out.println(cal.sum(3,4,4));
        System.out.println(cal.sum((float)3.5,(float)4.5));

        dog d = new dog();
        d.eats();


    }
    static class Animal{
        void eats(){
            System.out.println("eats");
        }
    }
    static class dog extends Animal{
        void eats(){
            System.out.println("eats anything");
        }
    }
    static class calculator{
        int sum(int a,int b){
            return a+b;
        }
        float sum(float a,float b){
           return a+b;
        }
        int sum(int a,int b,int c){
            return a+b+c;
        }
    }
}