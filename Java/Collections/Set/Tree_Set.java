package Java.Collections.Set;

import java.util.TreeSet;

public class Tree_Set
{
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("F");
        set.add("C");
        set.add("D");
        set.add("E");

        System.out.println("Intial Set: "+set);

        System.out.println("Head Set: "+set.headSet("C"));

        System.out.println("SubSet: "+set.subSet("A", "E"));

        System.out.println("TailSet: "+set.tailSet("C"));
    }
}
