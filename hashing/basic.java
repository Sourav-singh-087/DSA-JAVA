package hashing;

import java.util.HashMap;

public class basic {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("japan", 45);
        System.out.println(hm);

        int country = hm.get("japan");
        System.out.println(country);

        System.out.println(hm.containsKey("india"));
        hm.containsKey("us");
        System.out.println(hm.containsKey("us"));

        hm.remove("china");
        System.out.println(hm);



    }
}
