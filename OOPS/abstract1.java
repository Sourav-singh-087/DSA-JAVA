import java.util.*;

public class abstract1 {
    public static void main(String[] args) {

        dog d = new dog();
        d.walks();
        d.eats();

        chicken c = new chicken();
        c.walks();
        c.sleep();
        c.eats();
    }

    abstract static class Animal {

        void eats() {
            System.out.println("eats");
        }

        abstract void walks();
    }

    static class dog extends Animal {

        
        void walks() {
            System.out.println("walks on 4 legs");
        }
    }

    static class chicken extends Animal {

        
        void walks() {
            System.out.println("walks on 2 legs");
        }

        void sleep() {
            System.out.println("sleeps");
        }
    }
}