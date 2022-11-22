package Java.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist
{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(5);
        arrayList.add(25);
        arrayList.add(25);
        arrayList.add(45);
        arrayList.add(24);
        arrayList.add(45);

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.remove(1);
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        System.out.println("Arraylist elements are: ");
        Iterator<Integer> it=arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
