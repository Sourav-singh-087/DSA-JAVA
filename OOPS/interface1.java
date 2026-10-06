import java.util.*;

public class interface1{
    public static void main (String [] args){
        bear b = new bear();
        b.plant_eater();
        b.meat_eater();
    }
    interface chess {
        void moves();
    }
    static class queen implements chess {
        public void moves(){
            System.out.println("up,down,right,left,diagonal");
        }

    }
    static class rook implements chess{
        public void moves(){
            System.out.println("up, down , right , left");
        }
    }
    interface herbivous{
        void plant_eater();
    }
    interface carnivous{
        void meat_eater();

    }
    static class bear implements herbivous,carnivous{
        public void plant_eater(){
            System.out.println("eats only plant");
        }
        public void meat_eater(){
            System.out.println("eats only meat");
        }


    }


}