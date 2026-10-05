import java.util.*;

public class inheritance{
    public static void main(String [] args){
        dog tommy = new dog();
        tommy.legs = 4;
        System.out.println(tommy.legs);
        tommy.eats();

    }
    static class Animal{
        String color;

        void eats(){
            System.out.println("eats");
        }
        void sleep(){
            System.out.println("sleep");
        }
    }
    static class Fish extends Animal{
        int fins;

        void swim(){
            System.out.println("swim");
        }
    }
    static class mammal extends Animal{
        int legs;
    }
    static class dog extends  mammal{
        void speak(){
            System.out.println("bow");
        }
    }

}