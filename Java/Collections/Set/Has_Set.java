package Java.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Has_Set
{
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("ZEMOSO");
        set.add("SONATA");
        set.add("INFOSIS");
        set.add("TCS");
        set.add("IBM");
        System.out.println(set);
        System.out.println();
        set.remove("TCS");

        System.out.println("The Set elements are: ");
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
