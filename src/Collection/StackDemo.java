package Collection;

import java.util.Enumeration;
import java.util.Stack;
//last in first out
//legacy class and other is vector legacy class and vector is thread safe
// enumeration can only fetch, not able to remove elements
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(20);
        stack.push(10);
        stack.push(50);
        stack.push(60);
        System.out.println(
                stack
        );
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        Enumeration<Integer> enu = stack.elements();
        while(enu.hasMoreElements()){
            System.out.println(enu.nextElement());
        }


    }
}
