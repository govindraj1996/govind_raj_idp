package Java.Collections.Map;

import java.util.LinkedHashMap;

public class Linked_Hashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(106,"manju");
        map.put(102, "Rahul");
        map.put(103,"Rahul");
        //Fetching key
        System.out.println("Keys: " + map.keySet());
        //Fetching value
        System.out.println("Values: " + map.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: " + map.entrySet());
        map.remove(102);
        System.out.println("After invoking remove() method: "+map);
    }
}