package Java.Collections.List;

import java.util.Iterator;
import java.util.Vector;

public class vector
{
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.addElement("item1");
        vector.addElement("item2");
        vector.addElement("item3");

        System.out.println(vector);
        //removing an element
        vector.remove("item2");
        System.out.println(vector);

    }
}
