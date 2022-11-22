package Java.Collections.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hashset
{
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("Zemoso");
        set.add("IDC");
        set.add("Coforge");
        set.add("TCS");
        set.add("IBM");
        System.out.println(set);
        System.out.println();

        set.remove("IDC");
        System.out.println("The linked hashset elements are: ");
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
