package Java.Collections.List;

import java.util.Iterator;
import java.util.Stack;

public class stack
{
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(25);
        stack.push(35);
        stack.push(45);
        stack.push(57);
        stack.push(89);
        stack.pop();
        stack.remove(2);

        System.out.println(stack);
        System.out.println("Stack elements are: "+stack);

    }
}
