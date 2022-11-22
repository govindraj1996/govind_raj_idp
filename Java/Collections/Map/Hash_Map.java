package Java.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map
{
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
        hashMap.put(100,"Amit");
        hashMap.put(101,"Vijay");
        hashMap.put(102,"Rahul");
        hashMap.put(103,"Rahul");
        hashMap.put(104,"Ranjith");

        System.out.println(hashMap);

        hashMap.remove(101);
        System.out.println(hashMap);
        System.out.println();

        System.out.println("Updated list of elements:");
        hashMap.replace(102, "Gaurav");
        for(Map.Entry m:hashMap.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated list of elements:");
        hashMap.replaceAll((k,v) -> "Ajay");
        for(Map.Entry m:hashMap.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
