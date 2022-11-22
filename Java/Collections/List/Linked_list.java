package Java.Collections.List;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list
{
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("25");
        linkedList.add(56);
        linkedList.add(28.36);
        linkedList.add("Zemoso");
        linkedList.add(null);

        System.out.println(linkedList);
        System.out.println(linkedList.size());

        linkedList.remove(2);
        linkedList.add(0,35);
        System.out.println(linkedList);
        System.out.println(linkedList.size());

        System.out.println("Linkedlist elements are: ");
        Iterator it=linkedList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
